package com.springcloud.data.service;

import com.springcloud.data.entity.Item;
import com.springcloud.data.properties.OrderProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ItemService {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    OrderProperties orderProperties;

    public Item queryItemById(Long id) {
        String itemUrl = "http://app-item/item/{id}";
        Item result = restTemplate.getForObject(orderProperties.getItem().getUrl()+id, Item.class);
        System.out.println("订单系统调用商品服务,result:" + result);
        return result;
    }

}
