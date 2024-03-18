package controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.Hospital;
import service.PatientService;
import service.PatientServiceImpl;
import service.ReservationService;
import service.ReservationServiceImpl;

/**
 * Servlet implementation class MrecordSearch
 */
@WebServlet("/mrecordsearch")
public class MrecordSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MrecordSearch() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	request.getRequestDispatcher("mrecord.jsp").forward(request, response);
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String type = request.getParameter("type");
		String keyword = request.getParameter("keyword");
		String page = request.getParameter("page");
		String sdate = request.getParameter("sdate");
		String edate = request.getParameter("edate");
		HttpSession session = request.getSession();
		Hospital hospital = (Hospital)session.getAttribute("hospitaluser");
		String comnum = hospital.getComnum();
		int curPage = 1;
		if(page!=null) {
			curPage = Integer.parseInt(page);
		}

		
		try {
			ReservationService reservationService = new ReservationServiceImpl();
			Map<String, Object> res = reservationService.resAllSearch(type, keyword, curPage, sdate, edate,comnum);
			request.setAttribute("res", res);
			System.out.println(res);
			request.getRequestDispatcher("mrecord.jsp").forward(request, response);
		} catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("err", "게시판 검색 오류");
			request.getRequestDispatcher("error404.jsp").forward(request, response);
		}
	}

}
