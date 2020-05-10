package com.Entity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Entity.Dao.LoginDAO;
import com.Entity.E.Login;
@Service
public class LoginServisiImpl implements LoginServisi{
	@Autowired
	private LoginDAO loginDAO;

	@Transactional
	@Override
	public Login girisKontrol(Login lgn) {
		
		return loginDAO.girisKontrol(lgn);
	}
}
