
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shaiana.zan
 */
@WebServlet(name = "MinhaCalc", urlPatterns = {"/MinhaCalc"})
public class MinhaCalc extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public MinhaCalc(){
        super();
    }
    
    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text.html");
        
        
        PrintWriter out = response.getWriter();
        
        String svalor1 = request.getParameter("valor1");
        String svalor2 = request.getParameter("valor2");
        String sopcao = request.getParameter("opcao");
       
           
        double dvalor1 = Double.parseDouble(svalor1);
        double dvalor2 = Double.parseDouble(svalor2);
        double resultado = 0;
        String op = sopcao;
        
        if(sopcao.equals("+")){
            resultado = dvalor1 + dvalor2;
        }else if(sopcao.equals("-")){
            resultado = dvalor1 - dvalor2;
        }else if(sopcao.equals("*")){
            resultado = dvalor1 * dvalor2;
        }else if(sopcao.equals("/")){
            resultado = dvalor1 / dvalor2;
            }
        
        out.print("Resultado:" + resultado);
        
       double op1 =dvalor1 ;
       double op2 = dvalor2; 
       double result = resultado;
       int contador = 1;
		for (Cookie cookie : request.getCookies()) {
			if (cookie.getName().equals("contador")) {				
				contador = Integer.parseInt(cookie.getValue()) + 1;
				break;
			}
		}
                
                Cookie cookie = new Cookie("contador", String.valueOf(contador));
		response.addCookie(cookie);
		request.setAttribute("contador", contador);
        
       request.setAttribute("dvalor1", op1);
       request.setAttribute("dvalor2", op2);
       request.setAttribute("resultado", result);
       request.setAttribute("sopcao",op);
       
       request.getRequestDispatcher("minhaCalc.jsp").forward(request, response);
    }

    

}
