package com.gaurav;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/home")
	public String[] firstController() {
		
		String[] str = {"test","Main"};
		return str;
	}
	
	@GetMapping("/getteamData")
	public ArrayList<Iplteams> teamData() {
		ArrayList<Iplteams> list = new ArrayList<>();
		Iplteams iplteams1 = new Iplteams("MI",5, "Ambani","RohitSharma");
		Iplteams iplteams2 = new Iplteams("MI",5, "Ambani","RohitSharma");
		Iplteams iplteams3 = new Iplteams("MI",5, "Ambani","RohitSharma");
		Iplteams iplteams4 = new Iplteams("MI",5, "Ambani","RohitSharma");
		Iplteams iplteams5 = new Iplteams("MI",5, "Ambani","RohitSharma");
		list.add(iplteams1);
		list.add(iplteams2);
		list.add(iplteams3);
		list.add(iplteams4);
		list.add(iplteams5); 
		
		return list;
	}
	
	
	@GetMapping("/getsingleteamrecord/{teamName}")
	public ArrayList<Iplteams> getsingleteamrecord(@PathVariable String teamName) {
		
		ArrayList<Iplteams> list = new ArrayList<>();
		if(teamName.equals("csk")) {
			list.add(new Iplteams("CSK",5, "Ambani","Dhoni"));
		} else if(teamName.equals("mi")) {
			list.add(new Iplteams("MI",5, "Ambani","RohitSharma"));
		} else {
			list.add(new Iplteams("Other",5, "Ambani","Other"));
			list.add(new Iplteams("Other",5, "Ambani","Other"));
			list.add(new Iplteams("Other",5, "Ambani","Other"));
		}
		
		return list;
	}

}
