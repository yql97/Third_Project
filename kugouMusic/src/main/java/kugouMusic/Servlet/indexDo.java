package kugouMusic.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class indexDo
 */
public class indexDo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public indexDo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
         response.setCharacterEncoding("utf-8");
		

		HttpSession session = request.getSession();

		//PrintWriter out = response.getWriter();

//		String name = request.getParameter("name");
//		String pwd = request.getParameter("pwd");
//		AdminService adminService = new AdminService();
//		Admins admins = adminService.getAllAdminInfo(name, pwd);
//		session.setAttribute("admins", admins);
//		
//		RecordService rService = new RecordService();
//		List<Record> record = rService.getAllRecordInfo();
//		session.setAttribute("record", record);
//		int re = rService.getAllRecordcount(name);
//		session.setAttribute("re", re);
//		
		//session.setAttribute("re",re);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
