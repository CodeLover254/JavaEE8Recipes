<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<jsp:useBean id="dateBean" scope="application" class="com.codelover254.JavaEE8Recipes.DateBean"/>
<p>${dateBean.current}</p>
</body>
</html>