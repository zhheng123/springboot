package com.soda.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.soda.beans.News;
import com.soda.dao.NewsMapper;
import com.soda.service.NewsService;
@Service(value = "newsService")
public class NewsServiceImpl implements NewsService {
	
	@Autowired
    private NewsMapper newsMapper;
	
	@Transactional//事物
	@Override
	public News findById(int id) {
		/*News news=new News();
		news.setId(215);
		news.setAuthor("2222");
		newsMapper.updateByPrimaryKey(news);
		Integer.parseInt("11");*/
		return newsMapper.selectByPrimaryKey(id);
	}

}
