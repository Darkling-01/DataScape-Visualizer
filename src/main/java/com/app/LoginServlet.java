package com.app;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		//get response writer
		PrintWriter out = response.getWriter();
		
		//read from fields
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		
		
		
		/*
		//build HTML code
		String htmlResponse = "<html><head> <link rel='stylesheet type='text/css' "
				+ "href='<%=request.getContextPath()%>/../css/style.css'>"
				+ "<title>Profile</title> ";
		htmlResponse += "</head><body>";
		htmlResponse += "<div class='navigation-bar'>";
		htmlResponse += "<ul class='navigation-list'>";
		htmlResponse += "<li class=\"icon8\"><img src=\"<%=request.getContextPath()%>/../images/icon8.png\" alt=\"icon8\"></li>";
		htmlResponse += "<li><a href=\"<%=request.getContextPath()%>/../home.html\">Home</a></li>";
		htmlResponse += "</div>";
		htmlResponse += "</body></html>";
		
		//return response
		out.print(htmlResponse);*/
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String userId = request.getParameter("userId");
		
		//create a session
		HttpSession session = request.getSession();
		session.setAttribute("user", userId);
		
		//redirect to visualizer.jsp
		response.sendRedirect("visualizer.jsp");
		
	}

}
