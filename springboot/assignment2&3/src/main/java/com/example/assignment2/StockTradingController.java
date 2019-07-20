package com.example.assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StockTradingController {
	
	static List<User> users = new ArrayList<>();
	static User loggedUser = new User(null, null);
	static List<Stock> tickers = new ArrayList<>();
	
	static {
		tickers.add(new Stock("WIPRO", 230.55));
		tickers.add(new Stock("INFY", 949.44));
		tickers.add(new Stock("TCS", 335.65));
		tickers.add(new Stock("TECHM", 560.87));
	}
	
	@RequestMapping ("/mainPage")
	public String mainPage(Map<String, Object> model) {
		model.put("key1", "Wipro");
		return "MainPage";
	}
	
	@RequestMapping ("/register")
	public String register(Map<String, Object> model) {
		model.put("key1", "Wipro");
		return "Register";
	}
	
	@RequestMapping("/purchaseStock")
	public String purchaseStock(@RequestParam("ticker") String ticker, @RequestParam("quantity") String quantity) {

		Stock st = tickers.get(tickers.indexOf(new Stock(ticker, Double.parseDouble(quantity))));
		loggedUser.getStocks().add(st);
		loggedUser.setBalance(loggedUser.getBalance() - Double.parseDouble(quantity));

		return "Final";
	}
	
	@RequestMapping("/registerUser")
	public String registerUser(@RequestParam("userId") String userId, @RequestParam("password") String password) {

		User user = new User(userId, password);
		user.setBalance(1000);
		users.add(user);

		return "Login";
	}
	
	@RequestMapping("/login")
	public String login(Map<String, Object> model) {
		model.put("key1", "Wipro");
		return "Login";
	}

	@RequestMapping("/userLogin")
	public String userLogin(@RequestParam("userId") String userId, @RequestParam("password") String password) {

		User user = new User(userId, password);

		if (users.contains(user)) {

			loggedUser = user;
			return "TickerPage";
		} else
			return "Login";
	}

	
}
