package com.v.Controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.v.Entity.Authority;
import com.v.Entity.User;

@Controller
@RequestMapping("/users")
public class UsersController {
	SessionFactory sessionFactory=new Configuration()
			.configure("hibernate-config.xml")
			.addAnnotatedClass(User.class)
			.addAnnotatedClass(Authority.class)
			.buildSessionFactory();
	
	@RequestMapping("/userlist")
	public String userListPage(Model model) {		
				
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();	
		Query<User> query=session.createQuery("from User",User.class);
		List<User> resultList=query.getResultList();

		session.close();
		model.addAttribute("users", resultList);
		
		return "user-list";
	}
	
	@GetMapping("/userguncelle")
	public String userUpdate(@RequestParam("userName")String uname, Model model) {
			
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();	
		User usr=session.get(User.class, uname);			
		session.close();
		
		model.addAttribute("users",usr);
		return "user-form";
	}
	
	@GetMapping("/userekle")
	public String userUpdate(Model model) {
			
		User usr=new User();
		
		model.addAttribute("users",usr);
		return "user-form";
	}
	
	@PostMapping("/userkaydet")
	public String userSave(@ModelAttribute("users") User user) {
		
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();		
		session.saveOrUpdate(user);	
		session.getTransaction().commit();
		session.close();
		
		return "redirect:/users/userlist";
	}
	
	@GetMapping("/usersil")
	public String userDelete(@RequestParam("userName")String uname) {
				
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();	
		User usr=session.get(User.class, uname);
		session.delete(usr);
		session.getTransaction().commit();
		session.close();
		
		return "redirect:/users/userlist";
	}
	
}
