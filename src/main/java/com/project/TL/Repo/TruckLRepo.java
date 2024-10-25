package com.project.TL.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.TL.Model.TruckLoad;

public interface TruckLRepo extends JpaRepository<TruckLoad, Integer> 
{
	
}
