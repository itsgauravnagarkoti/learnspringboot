package com.gaurav;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class Dao {
	
	@Value("${spring.datasource.url}")
    private String dbUrl;

    @Value("${spring.datasource.username}")
    private String dbUsername;

    @Value("${spring.datasource.password}")
    private String dbPassword;

	public ArrayList<Iplteams> getIplDetails() throws SQLException, ClassNotFoundException {
		
		ArrayList<Iplteams> al = new ArrayList<Iplteams>();
		
		try {
		
		Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		
		Statement st = con.createStatement();
		
		
		ResultSet rs = st.executeQuery("select * from iplteams");
		
		while(rs.next()) {
			String teamName = rs.getString("teamName");
			int trophies = rs.getInt("trophies");
			String teamOwnerName = rs.getString("teamOwnerName");
			String teamCaptainName = rs.getString("teamCaptainName");
			
			Iplteams iplteams = new Iplteams(teamName,trophies,teamOwnerName,teamCaptainName);
			al.add(iplteams);
		}
		
		rs.close();
        st.close();
        con.close();
		}catch (Exception e) {
            e.printStackTrace();
        }
		return al;
	}
	
	public String insertInfo(Iplteams iplteam) throws SQLException {
       Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		
		PreparedStatement pt = con.prepareStatement("insert into iplteams values(?,?,?,?)");
		
		pt.setString(1, iplteam.getTeamName());
		pt.setInt(2, iplteam.getTrophies());
		pt.setString(3, iplteam.getTeamOwnerName());
		pt.setString(4, iplteam.getTeamCapitainName());
		
		pt.executeUpdate();
		
		return "Data Successfully Inserted";
		
	}
	
	
	public String updateinfo(String teamName,String captainName ) throws SQLException {
	       Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
			
			PreparedStatement pt = con.prepareStatement("update iplteams set teamName=? where teamCaptainName=?");
			
			pt.setString(1, teamName);
			pt.setString(2, captainName);
			
			pt.executeUpdate();
			
			return "Data Successfully Updated";
			
			
		}
	
	public String deleteItems(String teamCaptainName ) throws SQLException {
		
	       Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
			
			PreparedStatement pt = con.prepareStatement("delete from iplteams where teamCaptainName=?");
			
			pt.setString(1, teamCaptainName);
			
			
			pt.executeUpdate();
			
			return "Data Successfully Deleled";
			
			
		}
}
