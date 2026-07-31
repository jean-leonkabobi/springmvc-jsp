<%--
  Created by IntelliJ IDEA.
  User: beyea
  Date: 31/07/2026
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
    <head>
        <title><tiles:insertAttribute name="title"/></title>
    </head>
    <body>
        <tiles:insertAttribute name="content"/>
        <tiles:insertAttribute name="form"/>
        <tiles:insertAttribute name="table"/>
    </body>
</html>
