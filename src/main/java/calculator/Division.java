package calculator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/div")
public class Division extends HttpServlet {
//restriction
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	double num1=Double.parseDouble(req.getParameter("num1"));
	int num2=Integer.parseInt(req.getParameter("num2"));
System.out.println(num1);
System.out.println(num2);
 resp.getWriter().print("<html><body><h1 style='color:blue'>The division of "+num1 +" and "+num2 +" is "+(num1/num2)+"</h1></body></html>");		

}
} 



//	public void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
//		double num1=Double.parseDouble(arg0.getParameter("num1"));
//		int num2=Integer.parseInt(arg0.getParameter("num2"));
//	System.out.println(num1);
//	System.out.println(num2);
//      arg1.getWriter().print("<html><body><h1 style='color:blue'>The division of "+num1 +" and "+num2 +" is "+(num1/num2)+"</h1></body></html>");		

