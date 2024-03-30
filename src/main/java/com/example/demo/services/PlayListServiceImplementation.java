package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.PlayList;
import com.example.demo.repositiories.PlayListRepository;

@Service
public class PlayListServiceImplementation implements PlayListService
{
	@Autowired
	PlayListRepository prepo;

	@Override
	public void addPlaylist(PlayList playlist) {
		prepo.save(playlist);
		
	}

	@Override
	public List<PlayList> fetchPlaylist() {
		
		return prepo.findAll();
	}

	

}
