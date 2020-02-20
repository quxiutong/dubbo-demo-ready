package com.qxt.service;

import java.util.List;

import com.qxt.domain.Article;
import com.qxt.domain.ArticleWithBLOBs;
import com.qxt.domain.Vo;

public interface ArticleService {

	ArticleWithBLOBs selectByPrimaryKey(Integer id);
	

	List<Article> list(Vo vo);
}
