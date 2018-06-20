package kugouMusic.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kugouMusic.Service.CoopernateService;
import kugouMusic.Service.ImgService;
import kugouMusic.Service.SongService;
import kugouMusic.entity.Cooperate;
import kugouMusic.entity.Img;
import kugouMusic.entity.Song;

/**
 * Servlet implementation class WinLoad
 */
public class WinLoad extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WinLoad() {
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
	    request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html;charset=utf-8");
	    
		ImgService imgService = new ImgService();
		List<Img> list = imgService.getImgInfo();
		request.setAttribute("list", list);
	
		SongService songService = new SongService();
		List<Song> song = songService.getAllSong();
		for(Song s:song) {
			System.out.println(s.toString());
		}
		request.setAttribute("song", song);
		
		List<Song> songHeat = songService.getAllSongHeat();
		for(Song s:songHeat) {
			System.out.println(s.toString());
		}
		request.setAttribute("songHeat", songHeat);

		List<Song>	songRadio = songService.getAllSongRadio();
		for(Song s:songRadio) {
			System.out.println(s.toString());
		}
		request.setAttribute("songRadio", songRadio);
	
		List<Song> songOriginal = songService.getAllSongOriginal();
		for(Song s:songOriginal) {
			System.out.println(s.toString());
		}
		request.setAttribute("songOriginal", songOriginal);
		
		List<Song> songMV = songService.getAllSongMV();
		for(Song s:songMV) {
			System.out.println(s.toString());
		}
		request.setAttribute("songMV", songMV);
		
		CoopernateService cooservice = new CoopernateService();
		List<Cooperate> cooperate = cooservice.getAllCooperateInfo();
		request.setAttribute("cooperate",cooperate);
	
		request.getRequestDispatcher("kugou.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
