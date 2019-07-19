package com.example.Trade.Service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Trade.Service.model.Stock;
import com.example.Trade.Service.model.User;
import com.example.Trade.Service.repository.TradeRepository;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class TradeService {
	
	@Autowired
	TradeRepository tradeRepository;
	
	@Autowired
	RegisterServiceFeignProxy registerServiceFeignProxy;
	
	static User loggedUser = new User(null, null);

	@HystrixCommand(fallbackMethod = "purchaseStockFallBack")
	public User purchaseStock(Stock stock, String userToken, String quantity) {
		
		loggedUser = registerServiceFeignProxy.getUserByToken(userToken);
		tradeRepository.purchaseStock(stock, loggedUser, quantity);
		return null;
	}
	
	public String purchaseStockFallBack() {
		return "Fallback accessing stock.";
	}

}
