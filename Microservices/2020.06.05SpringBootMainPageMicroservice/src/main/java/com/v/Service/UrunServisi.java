package com.v.Service;

import java.util.List;

import com.v.Domain.Urun;

public interface UrunServisi {
	public List<Urun> getList(String Url);
	public Urun getUrun(String Url,Integer UrunId);
	public void deleteUrun(String Url,Integer UrunId);
	public void saveUrun( String Url, Urun urun);	
}
