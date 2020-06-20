package com.v.Service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.v.Domain.Yorum;
@Service
public class YorumServisiImpl implements YorumServisi {

	RestTemplate restTemplate=new RestTemplate();
	
	@Override
	public List<Yorum> getList(String Url, Integer urunId) {
		ResponseEntity<List<Yorum>> respEntity=
				restTemplate.exchange(Url+"/list/"+urunId, HttpMethod.GET,null,new ParameterizedTypeReference<List<Yorum>>() {
				});
				return respEntity.getBody();
	}

	@Override
	public void saveYorum(String Url, Yorum yorum) {
		restTemplate.postForEntity(Url+"/yorumekle", yorum,Yorum.class);
	}

}
