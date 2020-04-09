package com.v;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller()

public class DepartmentController {
	SessionFactory sessionFactory = new Configuration().configure("hibernate-config.xml")
			.addAnnotatedClass(Department.class).buildSessionFactory();

	@RequestMapping("/homepage")
	public String showHome(Model model, @RequestParam(value = "idno", required = false) String idgelen,
			@ModelAttribute("bilgiler") Department departmentGelen) {
		Integer arananid;

		if (idgelen != null) {
			arananid = Integer.valueOf(idgelen);

			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Department dept = session.get(Department.class, arananid);
			if (dept == null) {
				session.close();
				model.addAttribute("message", "Araman�za Uygun Sonu� Bulunamad�.");
				return "anasayfa";
			}
			session.getTransaction().commit();
			session.close();

			model.addAttribute("bilgiler", dept);
			return "anasayfa";
		} else if (departmentGelen.getId() != null) {
			Integer idno = departmentGelen.getId();

			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Department dept = session.get(Department.class, idno);

			List<Department> depts = session
					.createQuery("from Department where department_name='" + departmentGelen.getName() + "'")
					.getResultList();
			if (depts.size() > 0) {
				session.close();
				model.addAttribute("bilgiler", dept);
				model.addAttribute("message", "Girilen �sim Daha �nce Kullan�lm��. L�tfen Farkl� �sim Giriniz.");
				return "anasayfa";
			}
			dept.setName(departmentGelen.getName());
			dept.setManager_id(departmentGelen.getManager_id());
			dept.setLocation_id(departmentGelen.getLocation_id());
			session.getTransaction().commit();
			session.close();
			model.addAttribute("message2", "G�ncelleme ��lemi Ba�ar�l�.");
		}
		if (departmentGelen.getId() == null && (departmentGelen.getName() != null
				|| departmentGelen.getManager_id() != null || departmentGelen.getLocation_id() != null)) {
			model.addAttribute("message", "Hatal� Kullan�m !");

		}

		Department dept = new Department();
		model.addAttribute("bilgiler", dept);
		return "anasayfa";
	}

}
