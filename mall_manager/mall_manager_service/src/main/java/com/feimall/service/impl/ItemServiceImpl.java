package com.feimall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feimall.mapper.TbItemMapper;
import com.feimall.pojo.TbItem;
import com.feimall.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	private TbItemMapper itemMapper;
	
	@Override
	public TbItem getItemById(long id) {
		// TODO Auto-generated method stub
		TbItem item=itemMapper.selectByPrimaryKey(id);
		return item;
	}

}
