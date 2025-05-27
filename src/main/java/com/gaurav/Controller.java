package com.gaurav;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired	
	Service service;
	
	@GetMapping("/getTeams")
	public List<Iplteams> getDetailsView() throws ClassNotFoundException, SQLException{
		return service.getIpltems();
	}
	
	@PostMapping("/getTeams")
	public String getDetailsPost(@RequestBody  Iplteams iplteam) throws ClassNotFoundException, SQLException{
		
		String msg = service.saveIplteams(iplteam);
		
		return msg;
	}
	
	@PutMapping("/getTeams/{teamName}/{captainName}")
	public String getDetailsUpdate(@PathVariable String teamName, @PathVariable String captainName) throws ClassNotFoundException, SQLException{
		
		String msg = service.updateIplteams(teamName, captainName);
		
		return msg;
	}
	
	@DeleteMapping("/getTeams/{captainName}")
	public String getDetailsDelete(@PathVariable String captainName) throws ClassNotFoundException, SQLException{
		
		String msg = service.deleteItems(captainName);
		
		return msg;
	}
}
