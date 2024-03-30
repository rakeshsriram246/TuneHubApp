package com.example.demo.repositiories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entites.PlayList;

public interface PlayListRepository extends JpaRepository<PlayList, Integer>
{

}
