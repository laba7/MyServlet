<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Welcome</title>
    <link href="<c:url value="/resources/css/welcome.css"/>" rel="stylesheet" type="text/css">
    <head>
    <body>
    <div id="header">
    <ul class="menu1">
        <li><a href=#>Меню</a>
            <ul class="submenu">
                <li><a href="https://auto.ria.com/">Автомагазин </a></li>
                <li><a href="#">Автозапчасти</a>
                <ul>
                            <li><a href="#" class="documents">Покрышки</a></li>
                            <li><a href="#" class="messages">Автохимия</a></li>
                            <li><a href="#" class="signout">Запчасти</a></li>
                        </ul>
                </li>
                <li><a href="#">Новости</a></li>
            </ul>
        </li>
        </ul>
       </div>
         <div id="menu">меню</div>
         <div id="content">контент</div>
         <div id="footer">низ сайта</div>
  </body>
</html>


