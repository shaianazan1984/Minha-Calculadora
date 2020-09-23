<%-- 
    Document   : minhaCalc
    Created on : Sep 23, 2020, 2:32:06 AM
    Author     : shaiana.zan
--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.IOException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
         <% 
            //&lt;c:out value="${dvalorA}"/&gt;
          
           
        double dvalor1 = ((Double) request.getAttribute("dvalor1")).doubleValue();
        double dvalor2 = ((Double) request.getAttribute("dvalor2")).doubleValue();
        double resultado = ((Double) request.getAttribute("resultado")).doubleValue();
        String sopcao = (String) request.getAttribute ("sopcao");
        int contador = (Integer) request.getAttribute ("contador");
         %>
         
         Cálculo:
         </br>            
        <% 
         
        out.print ( dvalor1);
       %>
       </br>
        <% 
       
        out.print ( sopcao);
       %>
        </br>    
       <% 
          out.print ( dvalor2);
        %>
         </br>  
         
         =
       <% 
         out.print ( resultado);
        
          %>
          
          
          </br>      
          
          Olá! Você já acessou este site
           <% 
          out.print ( contador);
        %> vezes. <br> Volte sempre!
         </br>
    </body>
</html>
