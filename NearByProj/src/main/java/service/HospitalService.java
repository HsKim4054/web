package service;

import java.util.List;

import dto.Hospital;

public interface HospitalService {
	Hospital login(String comnum, String hpassword) throws Exception;

	void hospitaljoin(Hospital hospital) throws Exception;


	String comnumcheck(String comnum) throws Exception;

	Hospital hospitalInfo(String hname) throws Exception;
	
	
	List<Hospital> hospitalList(String department, String lat, String lon) throws Exception;
	Hospital selectHospitalBycomnum(String comnum) throws Exception;

	void hospitalModify(Hospital hospital) throws Exception;

	
}
