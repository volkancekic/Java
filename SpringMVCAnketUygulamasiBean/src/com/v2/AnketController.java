package com.v2;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/anket")
public class AnketController {
	
	@Autowired
	private ApplicationContext context;
	
	private Anket anket;
		
		static Connection myConn;
	
		@RequestMapping("/showform")
		public String showform1(Model model) {
			
			anket=context.getBean("anket",Anket.class);
			model.addAttribute("anket1",anket);		
			
			return "anketform1";
		}
		@RequestMapping("/showform2")
		public String showform2(@Valid @ModelAttribute("anket1") Anket anket1gelen, BindingResult bindingResult) {
			if(bindingResult.hasErrors()) {//hata varsa form1 e dön ve hata mesajý ver
				return "anketform1";
			}
			
			anket.setAd(anket1gelen.getAd());
			anket.setSoyad(anket1gelen.getSoyad());
			anket.setCinsiyet(anket1gelen.getCinsiyet());
			anket.setSehir(anket1gelen.getSehir());
			anket.setYas(anket1gelen.getYas());
			
			return "anketform2";
		}
		@RequestMapping("/anketconfirm")
		public String savePersonel(@ModelAttribute("anket2") Anket anket12,Model model) {
		
			model.addAttribute("anket22",anket);
			
String dbUrl="jdbc:oracle:thin:@localhost:1521:xe";
			
			
			try {
				myConn = DriverManager.getConnection(dbUrl,"java","java");
				System.out.println("Baglanti basarili.");
				
			
				
				
				
			} catch (SQLException e) {
				System.out.println("Veritabaný baðlantý hatasý");
				
			}
			
			//kayit ekleme kismi basliyor
			 InetAddress addr=null;
			 String ipAddress="";
			try {
				addr = InetAddress.getLocalHost();
				   ipAddress = addr.getHostAddress();			     
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			
			
			String harcamalar="";
			for(int i=0;i<anket12.getHarcama().length;i++) {
				harcamalar+=(anket12.getHarcama())[i];
			}
			
			String bos_zamanlar="";
			for(int i=0;i<anket12.getBos_zaman().length;i++) {
				bos_zamanlar+=(anket12.getBos_zaman())[i];
			}
			String sql="insert into anketdb (ad, soyad, cinsiyet, sehir, yas, ogr_durum, sektor, gelir, harcama, bos_zaman, ip_adres) values ('"+anket.getAd()+"','"+anket.getSoyad()+"','"+anket.getCinsiyet()+"','"+anket.getSehir()+"','"+anket.getYas()+"','"+anket12.getOgrenim_durumu()+"','"+anket12.getSektor()+"','"+anket12.getGelir()+"','"+harcamalar+"','"+bos_zamanlar+"','"+ipAddress+"')";
			Statement stmt;
			try {
				stmt = myConn.createStatement();
				int rset=stmt.executeUpdate(sql);
				System.out.println("Ekleme islemi Basarili");			
			
			} catch (SQLException e) {
				//System.out.println("Ekleme iþleminde hata oluþtu.");
				System.out.println(e);
			}
			try {
				myConn.close();//db baglantisi kapandi.
				System.out.println("Veritabaný baðlantýsý kapatýldý");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			
			return "anketconfirm";
		}
	
	}


