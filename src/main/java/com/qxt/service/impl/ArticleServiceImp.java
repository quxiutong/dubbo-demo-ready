package com.qxt.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qxt.dao.ArticleMapper;
import com.qxt.domain.Article;
import com.qxt.domain.ArticleWithBLOBs;
import com.qxt.domain.Vo;
import com.qxt.service.ArticleService;

@Service
public class ArticleServiceImp implements ArticleService {

	@Autowired
	private ArticleMapper articleMapper;

	@Override
	public ArticleWithBLOBs selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return articleMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Article> list(Vo vo) {
		// TODO Auto-generated method stub
		return articleMapper.list(vo);
	}

}
