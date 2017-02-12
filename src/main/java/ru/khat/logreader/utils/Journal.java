package ru.khat.logreader.utils;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Journal {

    public void writeEvent(HttpServletRequest request, String event) {

        String insert = "INSERT INTO journal" +
                " (user, event, time, ip)" +
                "VALUES (?, ?, ?, ?)";
        Context context;
        DataSource ds;
        Connection connection;
        PreparedStatement preparedStatement;

        try {
            context = new InitialContext();
            ds = (DataSource) context.lookup("jdbc/journalDB");
            connection = ds.getConnection();
            //  Statement statement = connection.createStatement();

            preparedStatement = connection.prepareStatement(insert);
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            Date date = Calendar.getInstance().getTime();
            preparedStatement.setString(1, request.getRemoteUser());
            preparedStatement.setString(2, event);
            preparedStatement.setString(3, df.format(date));
            preparedStatement.setString(4, request.getRemoteAddr());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();

        }

//        try {
//            Context context = new InitialContext();
//            DataSource ds = (DataSource) context.lookup("jdbc/journalDB");
//            Connection connection = ds.getConnection();
//            Statement statement = connection.createStatement();
//            DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
//            Date date = Calendar.getInstance().getTime();
//            statement.executeUpdate("INSERT INTO journal (user, event, time, ip)" +
//                    "VALUES ('" + request.getRemoteUser() + "', '" + event + "', '" + df.format(date) + "', '" + request.getRemoteAddr() + "')");
//            statement.close();
//            connection.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }
    }
}
