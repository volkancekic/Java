package com.v.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.v.Domain.Yorum;

public interface YorumRepository extends JpaRepository<Yorum, Integer>{
	
	@Query(value="SELECT * FROM yorum WHERE urun_id=:urunId", nativeQuery = true)
	public List<Yorum> getCommentList(@Param("urunId") Integer id);
}
