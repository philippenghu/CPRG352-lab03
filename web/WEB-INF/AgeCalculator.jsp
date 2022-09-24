<%-- 
    Document   : Age Calculator
    Created on : 22-Sep-2022, 2:04:09 PM
    Author     : Hu Peng
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="age">
            <div>
                <label>Enter your age: </label>
                <input type ="text" name="age" value="${inputAge}">
            </div>
            
            
            <div>   
            <input type="submit" value="Age next birthday">
            </div>  
        </form>
          <a href="arithmetic"> Arithmetic Calculator</a>  
        <p>${message}</p>
        
    </body>
</html>
