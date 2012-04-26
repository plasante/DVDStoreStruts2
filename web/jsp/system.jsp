<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>System Details</title>
    </head>
    <body>
        Environment: <s:property value="environment"/><br/>
        Operating System: <s:property value="operatingSystem"/>
    </body>
</html>
