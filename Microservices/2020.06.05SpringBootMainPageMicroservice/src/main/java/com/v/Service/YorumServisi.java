package com.v.Service;

import java.util.List;

import com.v.Domain.Yorum;

public interface YorumServisi {
	public List<Yorum> getList(String Url,Integer urunId);	
	public void saveYorum( String Url, Yorum yorum);
}
