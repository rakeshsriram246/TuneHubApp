package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entites.Songs;
import com.example.demo.services.SongsService;

@Controller
public class SongController 
{
	
	@Autowired
	SongsService songserv;
	@PostMapping("/map-addSongs")
	public String addSongs(@ModelAttribute Songs song)
	{
	
		String name = song.getName();
		boolean status = songserv.songExists(name);
		if(status==false)
		{
			songserv.addSongs(song);
			return "songsuccess";
		}
		else
		{
			return "songfail";
		}
		
	}
	@GetMapping("/map-viewsongs")
	public String viewSongs(Model model)
	{
	
		List<Songs> songslist = songserv.fetchAllSongs();
		model.addAttribute("songslist", songslist);
		return "displaysongs";
	}
	@GetMapping("viewsongs")
	public String viewCustomerSongs(Model model) {
		
		boolean primeCustomerStatus=false;
		
		if(primeCustomerStatus==true)
		{
			List<Songs> songslist = songserv.fetchAllSongs();
			model.addAttribute("songslist", songslist);
			return "displaysongs";
		}
		else
		{	
			return "makepayment";
		}
		
	}
	
	
}


