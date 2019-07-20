package com.example.Trade.Service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.Trade.Service.model.Stock;
import com.example.Trade.Service.model.User;
import com.example.Trade.Service.services.TradeService;

@RestController
public class TradeController {
	
	@Autowired
	private TradeService tradeService;
	
	@PostMapping("/purchaseStock")
	public User registerUser(@RequestBody Stock stock, @RequestHeader String userToken, @RequestHeader String quantity) {
		
		return tradeService.purchaseStock(stock, userToken, quantity);
	}

}