package com.shop.jpa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.jpa.model.Customer;
import com.shop.jpa.model.CustomerRepository;
import com.shop.jpa.model.Order;
import com.shop.jpa.repository.OrderRepository;

@Controller
public class ShopContorller {

	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@GetMapping("/order")
	public String order(Model model) {
		List<Order> list = orderRepository.findAll();
		model.addAttribute("list", list);
		return "order";
	}
	
	
	@GetMapping("/order/json")
	@ResponseBody
	public List<Order> json(){
		List<Order> list = orderRepository.findAll();
		return list;
	}
	
	@GetMapping("test")
	@ResponseBody
	public Map<String, Object> test(){
		Map<String, Object> map = new HashMap<String, Object>();
		List<Order> list = orderRepository.findAll();
		int count = 1;
		for(Order i : list) {
			String cId = i.getCustomers().getId();
			map.put(count+"st : Order", i);
			count++;
		}
		return map;
	}
}
