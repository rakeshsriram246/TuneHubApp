package com.example.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController
{

	@GetMapping("/map-register")
	public String registerMapping() {
		return "register";
	}
	
	@GetMapping("/map-login")
	public String loginMapping() 
	{
		return "login";
	}

	@GetMapping("/map-addSongs")
	public String addSongsMapping() 
	{
		return "addsongs";
	}
	@GetMapping("/Payment")
	public String sample()
	{
		return "Payment";
	}

}
