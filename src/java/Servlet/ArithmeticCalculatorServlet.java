package Servlet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          request.setAttribute("result","---");
           getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp").forward(request, response);   
           return;
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String inputFirstS=request.getParameter("first");
        String inputSecondS=request.getParameter("second");
        String error;
         int result=0;
         if(inputFirstS==null || inputFirstS==""||inputSecondS==null || inputSecondS==""){
         error="Invalid";
         
         request.setAttribute("result",error);
         request.setAttribute("inputFirst",inputFirstS);
        request.setAttribute("inputSecond",inputSecondS);  
         }
         try{
            
         int inputFirst=Integer.parseInt(inputFirstS);
          int inputSecond=Integer.parseInt(inputSecondS);
          if(request.getParameter("cal").equals("+")){
          result=inputFirst+inputSecond;
          }
          else if(request.getParameter("cal").equals("-")){
          result=inputFirst-inputSecond;
          }
          else if(request.getParameter("cal").equals("*")){
          result=inputFirst*inputSecond;
          }
          else if(request.getParameter("cal").equals("%") && inputSecond!=0){
          result=inputFirst%inputSecond;
          }
          else{
          error="Invalid";
         request.setAttribute("result",error);
       request.setAttribute("inputFirst",inputFirstS);
        request.setAttribute("inputSecond",inputSecondS);   
         getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp").forward(request, response);
   return;
          }
           request.setAttribute("inputFirst",inputFirstS);
        request.setAttribute("inputSecond",inputSecondS); 
          request.setAttribute("result",result);
           getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp").forward(request, response);
           return;
         }catch(NumberFormatException e){
          error="Invalid";
         request.setAttribute("result",error);
   request.setAttribute("inputFirst",inputFirstS);
        request.setAttribute("inputSecond",inputSecondS);  
         getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp").forward(request, response);
   return;
         }  
    }
    
}
