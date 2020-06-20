package com.v.Service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.v.Domain.Urun;
@Service
public class UrunServisiImpl implements UrunServisi {
	
	RestTemplate restTemplate=new RestTemplate();
	
	@Override
	public List<Urun> getList(String Url) {
		ResponseEntity<List<Urun>> respEntity=
				restTemplate.exchange(Url+"/list", HttpMethod.GET,null,new ParameterizedTypeReference<List<Urun>>() {
				});
				return respEntity.getBody();
	}

	@Override
	public Urun getUrun(String Url, Integer UrunId) {
		return restTemplate.getForObject(Url+"/urun/"+UrunId, Urun.class);
	}

	@Override
	public void deleteUrun(String Url, Integer UrunId) {
		restTemplate.delete(Url+"/sil/"+UrunId);
	}

	@Override
	public void saveUrun(String Url, Urun urun) {
		restTemplate.postForEntity(Url+"/urunekle", urun,Urun.class);
	}

}
