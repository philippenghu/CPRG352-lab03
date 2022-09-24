package Servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       getServletContext().getRequestDispatcher( "/WEB-INF/AgeCalculator.jsp").forward(request, response);
   return;
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String inputAgeS = request.getParameter("age");
         if(inputAgeS ==null || inputAgeS==""){
    String error="Please enter your age.";
request.setAttribute("message",error);
   getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp").forward(request, response);
   return;
    }
         
try{
    int inputAge=Integer.parseInt(inputAgeS);
     String message;
    if(inputAge<0){
      message = "Your age should be equal to or greater than 0"; 
    request.setAttribute("message",message);
    getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp").forward(request, response);
   return;
    }
    else{
    inputAge++;
    message = "Your age next birthday will be "+ inputAge; 
    request.setAttribute("message",message);
    
    getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp").forward(request, response);
   return;
    }
            }
catch (NumberFormatException e){
String Error="You must enter a number";
request.setAttribute("message",Error);
getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp").forward(request, response);
   return;
} 

}
}