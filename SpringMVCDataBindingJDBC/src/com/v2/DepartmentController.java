package com.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller()
@RequestMapping("/department")
public class DepartmentController {
	
	static Connection myConn;
	
	
	@RequestMapping("/homepage")
	public String showHome() {
		return "anasayfa";
	}
	
	@RequestMapping("/resultpage")
	public String showResult(@RequestParam("idno") String id,Model model) {	
		Integer aranan=Integer.valueOf(id);
	
				
		String dbUrl="jdbc:oracle:thin:@localhost:1521:xe";
		Statement stmt;
		int d_id=0,d_location=0;
		String d_name="";
	try {
		myConn = DriverManager.getConnection(dbUrl,"java","java");
		System.out.println("Baglanti basarili.");		
		
		
		String sql="select * from DEPARTMENTS where department_id="+aranan;
		stmt = myConn.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		if (!rs.isBeforeFirst() ) {    
			return "bulunamadi";
		} 
		while(rs.next()) {
			d_id=rs.getInt(1);
			d_name=rs.getString(2);
			d_location=rs.getInt(4);			
		}
		
		Department department=new Department();
		department.setId(d_id);
		department.setName(d_name);
		department.setLocation_id(d_location);
		
		model.addAttribute("departman", department);		
		
	} catch (SQLException e) {
		System.out.println("veritabaný  hatasý");
	}	
		return "goruntule";
	}
	
	@RequestMapping("/update")
	public String showUpdate(@ModelAttribute("dprtmn") Department department) {
		Statement stmt;
		
		int d_id=department.getId(),d_location=department.getLocation_id();
		String d_name=department.getName();
		
		try {
			
			
			
			String sql="update departments set department_name='"+d_name+"',location_id="+d_location+"where department_id="+d_id;
			stmt = myConn.createStatement();
			int rs=stmt.executeUpdate(sql);
			System.out.println("Güncelleme Ýþlemi Baþarýlý");				
			myConn.close();	
			System.out.println("Veritabaný baðlantýsý kapatýldý");
		} catch (SQLException e) {
			System.out.println("veritabaný  hatasý");
		}	
		
		return "guncelleme_sonucu";
	}
	
}
