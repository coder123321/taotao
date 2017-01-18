package com.taotao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.pojo.TbItemExample.Criteria;
import com.taotao.service.ItemService;

/**
 * item service
 * @author 016
 *
 */
@Service
public class ItemServiceItem implements ItemService {
	@Autowired
	private TbItemMapper itemmapper;

	@Override
	public TbItem getItemBy(long id) {
		
		TbItemExample example = new TbItemExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		List<TbItem> list = itemmapper.selectByExample(example);
		if(list!=null && list.size()>0){
			TbItem item = list.get(0);
			return item;
		}
		return null;
	}

}
