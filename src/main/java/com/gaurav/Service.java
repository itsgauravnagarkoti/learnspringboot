package com.gaurav;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	Dao dao;
	
	public List<Iplteams> getIpltems() throws ClassNotFoundException, SQLException {
		List<Iplteams> list =  dao.getIplDetails();
		return list;
	}
	
	public String  saveIplteams(Iplteams iplteam) throws SQLException  {
		
		String msg = dao.insertInfo(iplteam);
		return msg;
	}
	
	
public String  updateIplteams(String teamName,String captainName) throws SQLException  {
		
		String msg = dao.updateinfo(teamName,captainName);
		return msg;
	}

public String  deleteItems(String teamCaptainName) throws SQLException  {
	
	String msg = dao.deleteItems(teamCaptainName);
	return msg;
}
	

	
}
