package com.durai;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String site=request.getParameter("ss");
		int pant=Integer.parseInt(request.getParameter("pant"));
		int shirt=Integer.parseInt(request.getParameter("shirt"));
		int shoe=Integer.parseInt(request.getParameter("shoe"));
		int belt=Integer.parseInt(request.getParameter("belt"));
		Item i=new Item(site,pant,shirt,shoe,belt);
		i.item(i);
		Dao d=new Dao();
		try {
			d.insert(i);
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
	}

}
