<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>ADS</title>
  <script src="<c:url value="/resources/js/register.js"/>"></script>
  <script src="<c:url value="/resources/js/jquery-3.1.1.min.js"/>"></script>
</head>
<body>
<form action="${pageContext.request.contextPath}/register" method="post">

    <div id="SECTION">
        Раздел:
        <select name="SECTION" size="1">
            <option value="Легковые">Легковые</option>
            <option value="Грузовые">Грузовые</option>
            <option value="Специальные">Специальные</option>
            <option value="Водный транспорт">Водный транспорт</option>

            <input type="file" name="load" size="30"/>
        </select>
    </div>


    <form name="CarBrand" class="car">
        <label for="carBrand">Выбирите марку и модель автомобиля:</label>
        <select id="carBrand" name="carBrand">
            <c:forEach var="brand" items="${listBrand}">
                <option value="${brand.carBrand}" data='${brand.idBrand}'>${brand.carBrand}</option>
            </c:forEach>
        </select>
        <input type="button" onclick="getUser('${pageContext.request.contextPath}/register')" value = "Select brand"/>
    </form>

    <form name="Model" class="car">
            <select id="model" name = "Model">
               <c:forEach var="model" items="${model}">
                       <option value="${model.model}">${model.model}</option>
                  </c:forEach>
            </select>
            <input type="submit">
        </form>


    <div>
        <label><b>Введите год выпуска:</b></label>
        <input type="text" placeholder="Введите год" name="YEAR" required>
    </div>

    <form name="TYPE">
        Тип двигателя
        <select name="TYPE" size="1">
            <option value="Бензин">Бензин</option>
            <option value="Дизель">Дизель</option>
            <option value="Газ/Бензин">Газ/Бензин</option>
            <input type="text" name="load" size="25"/>
        </select>
    </form>

    <form name="VOLUME">
        Обьем двигателя:
        <br>
        <input type="text" size="10" maxlength="50" value="см"/>
    </form>


    <form name="MILEAGE">
        Пробег:
        <br>
        <input type="text" size="10" maxlength="50" value="км"/>
    </form>

    <form name="EQIUPMENT">
        Об авто:
        <br>
        <input type="text" size="70" maxlength="200" value="Коплектация, тип хранения, особености..."/>
    </form>


    <form name="PRICE">
        Цена, $:
        <br>
        <input type="text" size="40" maxlength="50" value="Цена"/>
    </form>

  <input type="submit" value="submit">

</form>
</body>
</html>