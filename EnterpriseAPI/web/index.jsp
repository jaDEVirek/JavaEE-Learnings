<%--
  Created by IntelliJ IDEA.
  User: wicio
  Date: 31.07.2020
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "ex" uri = "/WEB-INF/custom.tld"%>

<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<%--    <script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>--%>
    
    <script type="text/javascript" src="configFunctions.js">
    </script>
</head>
<body onload="callMyAction()">
<form action="enterprise/setUp">
    <label for="name">Enter your name</label><br/>
    <ex:actiontg message= "prototypeTest" ></ex:actiontg>
    <input type="text" name="name"/>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>
