
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Serv23")
public class Serv23 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		Cookie a[]=request.getCookies();
		out.print("<br>Name:"+""+a[0].getValue());
		out.print("<br>Password:"+""+a[1].getValue());
		
		//out.print("<form action='Serv23' method='post'>");
	//	out.print("<input type='submit' value='click'>");
		//out.print("</form>");
		out.print("<a href='Serv23'>click</a>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
