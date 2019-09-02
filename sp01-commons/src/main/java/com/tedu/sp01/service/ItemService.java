package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	List<Item> getItems(String orderId);
	/**保存订单的时候减少库存*/
	void decreaseNumbers(List<Item> list);
}
