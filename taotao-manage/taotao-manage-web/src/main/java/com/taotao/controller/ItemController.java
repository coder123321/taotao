package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;

@Controller
public class ItemController {
	@Autowired
	private ItemService service;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
    public TbItem getItemById(@PathVariable Long itemId){
		TbItem item = service.getItemBy(itemId);
		return item;
	}
}
