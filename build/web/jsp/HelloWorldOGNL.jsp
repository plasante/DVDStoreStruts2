<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World OGNL</title>
    </head>
    <body>
        Entered value: <s:property value="name"/><br/>
        Value of key 1 : <s:property value="key1"/><br/>
        Value of key 2 : <s:property value="key2"/><br/>
    </body>
</html>
