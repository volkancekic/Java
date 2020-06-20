package com.v.Service;

import java.util.List;

import com.v.Domain.Urun;


public interface UrunServisi {
	public List<Urun> getProducts();
	public void addProduct(Urun urun);
	public void updateProduct(Urun urun);
	public void delete(Integer id);
	public Urun getProductById(Integer id);
}
