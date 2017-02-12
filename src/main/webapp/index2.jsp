<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>LogReader</title>
</head>
<body style="padding:20px">


<div>
    <div style="float: left; width: 20%">
        <form method="post" id="my_form" action="#">
            <label>
                <div>
                    <div id="table" class="table">
                        <div class="table-row">
                            <div class="table-cell">Где искать</div>
                            <div class="table-cell"><input style="margin-left: 10px;width:90%" type="text" name="searchIn"></div>
                        </div>
                        <div class="table-row">
                            <div class="table-cell">Что искать</div>
                            <div class="table-cell"><input style="margin-left: 10px;width:90%" type="text" name="input"></div>
                        </div>
                        <div class="table-row">
                            <div class="table-cell">Формат файла</div>
                            <div class="table-cell"><select style="margin-left: 10px;width:30%" name="outputFormat">
                                <option value="text"></option>
                                <option value="xml">.xml</option>
                                <option value="html">.html</option>
                                <option value="doc">.doc</option>
                                <option value="log">.log</option>
                                <option value="pdf">.pdf</option>
                                <option value="rtf">.rtf</option>
                            </select></div>
                        </div>
                    </div>
                    <div id="divDate">
                        <div class="table-row">
                            <div class="table-cell">Дата c</div>
                            <div class="table-cell"><input style="margin-left: 65px;width:65%" type="text" name="dateFrom"></div>
                        </div>
                        <div class="table-row">
                            <div class="table-cell">по</div>
                            <input style="margin-left: 65px;width:65%" type="text" name="dateTo"></div>
                    </div>
                    <div class="table-row">
                        <div class="table-cell">
                            <br>
                            <input style="margin-right: 26px" width="25px" type="submit" name="ok">
                        </div>
                        <div class="table-cell">
                            <br>
                            <button id="addDate" type="button">Добавить дату</button>
                        </div>
                    </div>
                </div>
            </label>
        </form>
    </div>

    <div style="float: right;width: 80%">

        <div style="float:right">
            Вы: <%= request.getRemoteUser() %>
            <button id="logout">Выйти</button>
        </div>
        <div style ="float: left; width: 45%">
        <button id="clearText">Очистить</button>

        <label>
            <input class="jscolor" onchange="update(this.jscolor)" value="#e6eeff">
        </label> <div style ="float: right" id = "download"></div>

    </div>
        <div>
    <textarea readonly id="form_output"
              style="resize: none;margin-top:3px;height:95%;width: 100%; padding: 25px;color: #595959"></textarea>
        </div>

    </div>
</div>
<spring:url value="/resources/js/jquery-3.1.1.min.js" var="jqueryJs" />
<spring:url value="/resources/js/jscolor.js" var="jsColor" />
<script src="${jqueryJs}"></script>
<script src="${jsColor}"></script>

<script>



    document.getElementById("clearText").addEventListener("click", clearText);
    document.getElementById("logout").addEventListener("click", logout);
    document.getElementById("addDate").addEventListener("click", addDate);
    document.body.style.backgroundColor = '#e6eeff';

    $(document).ready(function () {
        $('#my_form').on('submit', function (e) {
            e.preventDefault();
            $.ajax({
                url: 'logReader',
                type: "post",
                data: $(this).serialize(),
                success: function (response) {
                    var divForm = $("#form_output");

                    if (response.urlFile != null) {
                        $("#download").html('<form method="GET" action="download"><input type="hidden" value="'+ response.urlFile +'" name="filename"><input type=submit value="скачать файл"></form>')

                    }
                    else {
                        divForm.empty();
                        var textToInsert = [];
                        var arrIndex = 0;
                        for (var i = 0; i < response.list.length; i++) {
                            textToInsert[arrIndex++] = response.list[i].xmlGCDate +
                                    " &nbsp;&nbsp;" + response.list[i].thread + "\r\n"
                                    + response.list[i].textBlock.replace(/</g, '&lt;') + "\r\n"

                        }
                        divForm.append(textToInsert.join(''));
                    }
                }
            });
        });
    });

    function update(jscolor) {
        var color = jscolor.hsv;
        var i = color[0];
        if (i < 270 || i > 352) {
            document.body.style.backgroundColor = '#' + jscolor
            invert(jscolor)
        }
    }

    function invert(rgb) {
        rgb = Array.prototype.join.call(arguments).match(/(-?[0-9\.]+)/g);
        for (var i = 0; i < rgb.length; i++) {
            rgb[i] = (i === 3 ? 1 : 255) - rgb[i];
        }
        document.body.style.color = "#" + rgb;
        document.getElementById("downloadLink").style.color = "#" + rgb;
    }

    function logout() {
        window.location = "logout.jsp";
    }

    function clearText() {
        $("#form_output").empty();
        $("#download").empty();
    }

    function addDate() {
        var e = document.createElement('div');
        e.innerHTML = '<div id="divDate"> <div class="table-row"> <div class="table-cell">Дата c</div><div class="table-cell"><input style="margin-left: 65px;width:65%" type="text" name="dateFrom"></div> </div> <div class="table-row"><div class="table-cell">по</div><input style="margin-left: 65px;width:65%" type="text" name="dateTo"></div> </div>';
        document.getElementById("divDate").append(e);

    }

</script>
</body>
<style>

    .table {
        display: table;
    }

    .table-row {
        display: table-row;
    }

    .table-cell {
        display: table-cell;
    }

    form {
         display: inline;
    }


</style>
</html>
