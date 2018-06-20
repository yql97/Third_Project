package kugouMusic.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class insertDo
 */
public class insertDo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertDo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		//PrintWriter out = response.getWriter();
			
//		      String name = request.getParameter("userName");
//				String email = request.getParameter("userEmail");
//				String pwd = request.getParameter("userPassword");
//			
//				UsersService uService = new UsersService();
//				//�����û���Ϣ
//				Users us = new Users(name,email,pwd);
//		
//				if(uService.insertUserInfo(us)){
//					request.setAttribute("name", name);
//					request.getRequestDispatcher("Succeed.jsp").forward(request, response);
//				}else{
//					request.getRequestDispatcher("Register.jsp").forward(request, response);
//				}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
