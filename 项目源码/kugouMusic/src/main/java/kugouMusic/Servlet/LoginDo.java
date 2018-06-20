package kugouMusic.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class LoginDo
 */
public class LoginDo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginDo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.setCharacterEncoding("utf-8");
//		HttpSession session  = request.getSession();
//		PrintWriter out = response.getWriter();
//		String name = request.getParameter("name");
//		String pwd = request.getParameter("pwd");
//		UsersService uService = new UsersService();
//		Users user = uService.getAllUserInfoByName(name, pwd);
//		boolean result = false;
//		if(user != null){
//			result = true;
//		}
//		session.setAttribute("user", user);
//			out.println(result);
//			out.close();	
		
//		if(user != null){
//			Cookie cookie = new Cookie("user", user.getUserName());
//			cookie.setMaxAge(360*24*1000*30);
//			response.addCookie(cookie);
//			session.setAttribute("user", new Users(name, pwd));
//			if(user.getUserPower() == 1){
//				out.print("<script>location.href='Backstage.jsp';</script>");
//			}else{
//			out.print("<script>location.href='WinLoad';</script>");
//			}
//		}else{
//			out.println(user);
//			out.close();
//		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
