package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.ReservationDao;
import dao.ReservationDaoImpl;
import dto.Hospital;
import dto.Reservation;
import util.PageInfo;

public class ReservationServiceImpl implements ReservationService{
	
	private ReservationDao resDao;

	public ReservationServiceImpl() {
		resDao = new ReservationDaoImpl();
	}

	@Override
	public List<Map<String, Object>> showReservation(String pidnum) throws Exception {
		
		return resDao.selectMyReservation(pidnum);
	}
	
	@Override
	public Map<String, Object> detailRes(Map<String, Object> param) throws Exception {
		return resDao.selectDetailReservation(param);
	}
	

	@Override
	public Map<String, Object> reservationListByPage(Integer page) throws Exception {
	
	PageInfo pageInfo = new PageInfo();
	Integer reservationCount = resDao.selectReservationCount();
	int maxPage = (int) Math.ceil((double) reservationCount / 10); 
	int startPage = (page - 1) / 10 * 10 + 1; 
	int endPage = startPage + 10 - 1;
	if (endPage > maxPage)
		endPage = maxPage;
	if (page > maxPage)
		page = maxPage; 

	pageInfo.setAllPage(maxPage);
	pageInfo.setCurPage(page);
	pageInfo.setStartPage(startPage);
	pageInfo.setEndPage(endPage);

	int row = (page - 1) * 10 + 1; 
	List<Reservation> reservationList = resDao.selectTodayReservation(row - 1);

	Map<String, Object> map = new HashMap<>();
	map.put("pageInfo", pageInfo);
	map.put("reservationList", reservationList);
	return map;
}

	@Override
	public Map<String, Object> hrecordSearch(String type, String keyword, Integer page) throws Exception {
		Map<String, Object> param = new HashMap<>();

		param.put("type", type);
		param.put("keyword", keyword);
		PageInfo pageInfo = new PageInfo();
		int reservationCount = resDao.searchHRecordCount(param);
		int maxPage = (int) Math.ceil((double) reservationCount / 10); 
		int startPage = (page - 1) / 10 * 10 + 1; 
		int endPage = startPage + 10 - 1;
		if (endPage > maxPage)
			endPage = maxPage;
		if (page > maxPage)
			page = maxPage; 

		pageInfo.setAllPage(maxPage);
		pageInfo.setCurPage(page);
		pageInfo.setStartPage(startPage);
		pageInfo.setEndPage(endPage);

		Map<String, Object> map = new HashMap<>();
		map.put("pageInfo", pageInfo);

		if (page == 0) {
			return map;
		}

		int row = (page - 1) * 10 + 1; 
		param.put("row", row - 1);
		List<Reservation> reservationList = resDao.searchHRecordList(param);

		map.put("type", type);
		map.put("keyword", keyword);
		map.put("hrecordList", reservationList);
		return map;
	}
	
	@Override
	public List<String> timelist(Hospital hospital) throws Exception {
		List<String> timelist = new ArrayList<>();
		String clinic = hospital.getClinic();
		String lunch = hospital.getLunch();
		int scH = Integer.parseInt(clinic.substring(0, 2));
		int scM = Integer.parseInt(clinic.substring(2, 4));
		int ecH = Integer.parseInt(clinic.substring(4, 6));
		int ecM = Integer.parseInt(clinic.substring(6, 8));
		int slH = Integer.parseInt(lunch.substring(0, 2));
		int slM = Integer.parseInt(lunch.substring(2, 4));
		int elH = Integer.parseInt(lunch.substring(4, 6));
		int elM = Integer.parseInt(lunch.substring(6, 8));
		while (true) {
			String hour = Integer.toString(scH);
			if (hour.length() == 1) {
				hour = "0" + hour;
			}
			String min = Integer.toString(scM);
			if (min.length() == 1) {
				min = "0" + min;
			}
			timelist.add(hour + ":" + min);

			scM += 30;
			if (scM >= 60) {
				scH += 1;
				scM -= 60;
			}

			if (scH >= slH && scM >= slM) {
				break;
			}

		}
		while (true) {
			String hour = Integer.toString(elH);
			if (hour.length() == 1) {
				hour = "0" + hour;
			}
			String min = Integer.toString(elM);
			if (min.length() == 1) {
				min = "0" + min;
			}
			timelist.add(hour + ":" + min);

			elM += 30;
			if (elM >= 60) {
				elH += 1;
				elM -= 60;
			}

			if (elH >= ecH && elM >= ecM) {
				break;
			}
		}

		return timelist;
	}
	@Override
	public void insertReservation(Reservation reservation) throws Exception {
		resDao.insertReservation(reservation);
	}

	
}
