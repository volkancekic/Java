package com.v.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v.Dao.UrunRepository;
import com.v.Domain.Urun;
@Service
public class UrunServisiImpl implements UrunServisi {
	
	@Autowired
	private UrunRepository urunRepository;
	
	@Override
	public List<Urun> getProducts() {
		return urunRepository.findAll();
	}
	@Transactional
	@Override
	public void addProduct(Urun urun) {
		urunRepository.save(urun);

	}
	@Transactional
	@Override
	public void updateProduct(Urun urun) {
		urunRepository.save(urun);

	}
	@Transactional
	@Override
	public void delete(Integer id) {
		urunRepository.deleteById(id);
	}

	@Override
	public Urun getProductById(Integer id) {		
		Optional<Urun> urun=urunRepository.findById(id);
		return urun.get();
	}

}
