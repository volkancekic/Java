package com.v.Service;

import java.util.List;

import com.v.Domain.Yorum;

public interface YorumServisi {
	public List<Yorum> getComments(Integer urun_id);
	public void addComment(Yorum yorum);	
	
}
