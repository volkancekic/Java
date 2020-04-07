package com.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
	
	static Connection myConn;
	
	@RequestMapping("/login")
	public String showLogin() {
		return "login";
	}
	
	@RequestMapping("/usercontrol")
	public String showControlResult(@RequestParam("username") String username,@RequestParam("password") String password, Model model) {
		
		String dbUrl="jdbc:oracle:thin:@localhost:1521:xe";
		Statement stmt;
		String name="",lastname="",role="";
	try {
		myConn = DriverManager.getConnection(dbUrl,"java","java");
		System.out.println("Baglanti basarili.");		
		
		
		String sql="select * from PERSONEL where username='"+username+"' and password='"+password+"'";
		stmt = myConn.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		if (!rs.isBeforeFirst() ) {    
			return "hataliGiris";
		} 
		while(rs.next()) {
		
			name=rs.getString(3);
			lastname=rs.getString(4);
			role=rs.getString(5);
		}
		
		User personel=new User();
		personel.setUsername(username);
		personel.setPassword(password);
		personel.setName(name);
		personel.setLastname(lastname);
		personel.setRole(role);
		
		
		
		if(personel.getRole().equals("manager")) {
			model.addAttribute("role1","manager");
		}else {
			model.addAttribute("role1","personnel");
		}
		model.addAttribute("user1", personel);
		
		
	} catch (SQLException e) {
		System.out.println(e);//"veritabaný  hatasý"
	}		
		
		return "successful"; 
	}
	@RequestMapping("/cancel")
	public String showCancel() {
		return "cancel";
	}

}
