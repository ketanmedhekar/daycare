package com.example.demo.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.VacancyRepository;

@Service
public class VacancyService {
	@Autowired
	VacancyRepository vacancyrepo;
	
	
	public List<Integer> getvacancybydate(String date,int daycare_id) {
		return vacancyrepo.getVacancyByDateId(date, daycare_id);
	}
	

}
