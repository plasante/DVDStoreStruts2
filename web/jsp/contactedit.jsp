<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Contact</title>
    </head>
    <body>
        <h1>Edit Contact</h1>
        <s:form action="updateContact" method="post">
            <s:hidden name="contact.id"/>
            <s:textfield name="contact.firstName" label="First Name"/>
            <s:textfield name="contact.lastName" label="Last Name"/>
            <s:textfield name="contact.emailId" label="Email"/>
            <s:textfield name="contact.cellNo" label="Cell Number"/>
            <s:textfield name="contact.website" label="Homepage"/>
            <s:textfield name="contact.birthDate" label="Birth Date"/>
            <s:submit value="Update Contact"/>
        </s:form>
    </body>
</html>
