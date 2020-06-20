package com.v.ControllerAndDomain;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Controller
public class Controller {

	final String Rest1URL = "http://localhost:8180/api1/test";
	final String Rest2URL = "http://localhost:8181/api2/test";
	final String Rest3URL = "http://localhost:8182/api3/test";

	RestTemplate restTemplate = new RestTemplate();

	List<LogSonuc> list = new ArrayList<LogSonuc>();

	@RequestMapping("/")
	public String test() {
		return "welcome";
	}

	@RequestMapping("/form")
	public String form() {
		//liste sifirlaniyor
		list=new ArrayList<LogSonuc>();
		return "form";
	}

	@GetMapping("/logList")
	public String logList(HttpServletRequest request, Model model) {

		int saniye = Integer.valueOf(request.getParameter("sure"));

		int app1;
		try {
			app1 = restTemplate.getForObject(Rest1URL, Integer.class);
		} catch (Exception e) {
			app1 = 0;
		}
		int app2;
		try {
			app2 = restTemplate.getForObject(Rest2URL, Integer.class);
		} catch (Exception e) {
			app2 = 0;
		}
		int app3;
		try {
			app3 = restTemplate.getForObject(Rest3URL, Integer.class);
		} catch (Exception e) {
			app3 = 0;
		}

		LogSonuc log = new LogSonuc();
		if (app1 == 1) {
			log.setApp1("Aktif");
		} else {
			log.setApp1("Pasif");
		}

		if (app2 == 1) {
			log.setApp2("Aktif");
		} else {
			log.setApp2("Pasif");
		}

		if (app3 == 1) {
			log.setApp3("Aktif");
		} else {
			log.setApp3("Pasif");
		}

		// Anlik Tarih Bilgisi Aliniyor
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		log.setTarih(sdf.format(cal.getTime()));

		list.add(log);

		model.addAttribute("veriler", list);
		model.addAttribute("saniye",saniye);
		model.addAttribute("mesaj", "Uygulamalar " + saniye + " saniyede bir kontrol ediliyor.");
		return "list";

	}

}
