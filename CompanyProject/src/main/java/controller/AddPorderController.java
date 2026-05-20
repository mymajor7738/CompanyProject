package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import dao.impl.PorderDaoImpl;
import entity.Porder;


@WebServlet("/AddPorderController")
public class AddPorderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddPorderController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		Porder porder=(Porder)session.getAttribute("P");
		new PorderDaoImpl().addPorder(porder);
		response.sendRedirect("porder/finish.jsp");//超連結都走GET
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post");
		
	}

}
