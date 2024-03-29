package com.ftn.OnlineFitness.dao;

import java.util.List;

import com.ftn.OnlineFitness.model.Admin;
import com.ftn.OnlineFitness.model.ELanguage;


public interface AdminDAO {
	
	public Admin findOne(int id);

	public List<Admin> findAll();
	
	public int update(Admin admin);
		
	public List<ELanguage> getAdminLanguages(int id);
	
	public Admin getByEmail(String email);
	
	public Admin getByPhoneNumber(String phoneNumber);
	
	public Admin getByCardNumber(String cardNumber);





	//DODATO
	public Admin getByEmailAndPassword(String email,String password);
	
	

}
