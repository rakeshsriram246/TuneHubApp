package com.example.demo.repositiories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entites.Songs;

public interface SongsRepository extends JpaRepository<Songs, Integer>
{

	public Songs findByName(String name);
}
