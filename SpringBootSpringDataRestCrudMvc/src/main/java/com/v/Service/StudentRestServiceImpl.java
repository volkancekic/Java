package com.v.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.v.Domain.Link;
import com.v.Domain.Student;

@Service
public class StudentRestServiceImpl implements StudentRestService {
	// rest-Client
	
	RestTemplate restTemplate = new RestTemplate();

	@Override
	public List<Student> getList(String Url) {		
		//JSON PARSE EDILIYOR BURADA
		JSONObject obj = new JSONObject(restTemplate.getForObject(Url, String.class));
		JSONArray array=obj.getJSONObject("_embedded").getJSONArray("students");
		
		List<Student> studentList=new ArrayList<Student>();        
        
        for (int i = 0; i < array.length(); i++) {        	
        	Student student=new Student();        	
        	student.setId(array.getJSONObject(i).getInt("id"));
        	student.setFirstName(array.getJSONObject(i).getString("firstName"));
        	student.setLastName(array.getJSONObject(i).getString("lastName"));
        	student.setEmail(array.getJSONObject(i).getString("email"));        	
        	student.setBirthDate(Date.valueOf(array.getJSONObject(i).getString("birthDate")));
        	
        	studentList.add(student);
            
        }       
        
        return studentList;
      
	}

	@Override
	public Student getStudent(int StudentId, String Url) {
		return restTemplate.getForObject(Url+"/"+StudentId, Student.class);
	}

	@Override
	public void deleteStudent(int StudentId,String Url) {
		restTemplate.delete(Url+"/"+StudentId, Student.class);		
	}

	@Override
	public void save(Student student, String Url) {
		if(student.getId()==null) {
			//save
			restTemplate.postForEntity(Url, student, Student.class);
			
		}else {
			//update			
			restTemplate.put(Url+"/"+student.getId(), student);
			
		}
	}

	@Override
	public Link getPageLinks(String Url) {
		//SAYFA LINKLERI ICIN BILGILER ALINIYOR JSON'DAN
		//JSON PARSE EDILIYOR BURADA
				JSONObject obj = new JSONObject(restTemplate.getForObject(Url, String.class));
				JSONObject links=obj.getJSONObject("_links");				
				Link pgLink=new Link(); 				
				
		         if(links.has("first")) {
		        	 String firstLink=links.getJSONObject("first").getString("href");
		        	 pgLink.setFirst(firstLink);
		         }
		         if(links.has("prev")) {
		        	 String prevLink=links.getJSONObject("prev").getString("href");
		        	 pgLink.setPrev(prevLink);
		         }
		         if(links.has("self")) {
		        	 String selfLink=links.getJSONObject("self").getString("href");
		        	 pgLink.setSelf(selfLink);
		         }
		         if(links.has("next")) {
		        	 String nextLink=links.getJSONObject("next").getString("href");
		        	 pgLink.setNext(nextLink);
		         }
		         if(links.has("last")) {
		        	 String lastLink=links.getJSONObject("last").getString("href");
		        	 pgLink.setLast(lastLink);
		         }
		         
		         JSONObject pages=obj.getJSONObject("page");	
		         if(pages.has("size")) {
		        	 int size=pages.getInt("size");
		        	 pgLink.setPageSize(size);
		         }
		         if(pages.has("totalElements")) {
		        	 int totalElements=pages.getInt("totalElements");
		        	 pgLink.setTotalElements(totalElements);
		         }
		         if(pages.has("totalPages")) {
		        	 int totalPages=pages.getInt("totalPages");
		        	 pgLink.setTotalPages(totalPages);
		         }
		         if(pages.has("number")) {
		        	 int number=pages.getInt("number");
		        	 pgLink.setPageNumber(number);
		         }
		        return pgLink;
	}
	
	
	

}
