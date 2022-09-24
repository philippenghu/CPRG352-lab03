<%-- 
    Document   : ArithmeticCalculator
    Created on : 22-Sep-2022, 2:04:28 PM
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
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
            <div>
                <label>First:</label> 
                <input type="text" name="first" value="${inputFirst}">
            </div>
             <div>
                <label>Second:</label> 
            </div>
             <div>
                <input type="text" name="second" value="${inputSecond}">
            </div>
            <div>
             <input name="cal" type="submit" value="+"> 
             <input name="cal" type="submit" value="-"> 
             <input name="cal" type="submit" value="*"> 
             <input name="cal" type="submit" value="%"> 
            </div>
        </form>
         
        <br>
        <p>Result: 
            <span>${result}</span> 
        </p>
         <a href="age"> Age Calculator</a>  
    </body>
</html>
