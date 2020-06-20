package com.v.SpringRestClient;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.v.SpringRestClient.Domain.Ogrenci;

public class SpringRestClientApi {
	static final String serverUrl = "http://localhost:8081/2020.04.28SpringSecurityDemo/api";

	static RestTemplate restTemplate = new RestTemplate();

	private static Ogrenci getOgrenci(int i) {
		return restTemplate.getForObject(serverUrl+"/students/"+i, Ogrenci.class);

	}

	private static void addOgrenci(Ogrenci ogr) {

		restTemplate.postForEntity(serverUrl+"/students", ogr,Ogrenci.class);
		

	}
	
	private static void updateOgrenci(Ogrenci ogrUpdating) {

		restTemplate.put(serverUrl+"/students", ogrUpdating);
		

	}
	
	private static void deleteOgrenci(int ogrId) {

		restTemplate.delete(serverUrl+"/students/"+ogrId);
		

	}
	
	private static List<Ogrenci> getOgrenciler(){
		ResponseEntity<List<Ogrenci>> respEntity=
		restTemplate.exchange(serverUrl+"/students", HttpMethod.GET,null,new ParameterizedTypeReference<List<Ogrenci>>() {
		});
		return respEntity.getBody();
		//yöntem 2
		/*ResponseEntity<Ogrenci[]> responseEntity = 
				restTemplate.getForEntity(serverUrl+"/students", Ogrenci[].class);
				
				List<Ogrenci> ogr = Arrays.asList(responseEntity.getBody());
				
				return ogr;*/
				
	}

	public static void main(String[] args) {
		
		//get
		Ogrenci ogr = getOgrenci(40);
		System.out.println(ogr);
		
		//add
		Ogrenci ogrInsert=new Ogrenci("buse", "bayrak", 11, null);
		addOgrenci(ogrInsert);
		
		//update
		ogr=getOgrenci(44);
		ogr.setOgrenciNo(1253);
		updateOgrenci(ogr);
		
		//delete
		int id=ogr.getId();
		deleteOgrenci(id);
		
		//List
		List<Ogrenci> ogrenciler=getOgrenciler();
		for(Ogrenci ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		
		
		

	}
}
