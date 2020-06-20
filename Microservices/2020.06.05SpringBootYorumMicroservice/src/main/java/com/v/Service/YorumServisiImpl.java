package com.v.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v.Dao.YorumRepository;
import com.v.Domain.Yorum;
@Service
public class YorumServisiImpl implements YorumServisi{

	@Autowired
	private YorumRepository yorumRepository;

	@Override
	public List<Yorum> getComments(Integer urun_id) {
		return yorumRepository.getCommentList(urun_id);
	}
	@Transactional
	@Override
	public void addComment(Yorum yorum) {
		yorumRepository.save(yorum);
		
	}
	
}
