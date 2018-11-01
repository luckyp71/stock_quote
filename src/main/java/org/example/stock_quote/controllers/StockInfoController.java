package org.example.stock_quote.controllers;

import java.util.ArrayList;
import java.util.Collection;

import org.example.stock_quote.interfaces.StockInfoInterface;
import org.example.stock_quote.models.StockQuote;
import org.example.stock_quote.models.StockSymbol;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;
import java.util.logging.Logger;

public class StockInfoController implements StockInfoInterface {

	public final Logger logger = Logger.getLogger(StockInfoController.class.getName());

	@Override
	public Collection<String> getStockSymbols() {

		Collection<String> response = new ArrayList<>();
		String respString = "";
		ObjectMapper mapper = new ObjectMapper();

		try {
			URL url = new URL("https://ws-api.iextrading.com/1.0/ref-data/symbols");
			@SuppressWarnings("unchecked")
			Collection<StockSymbol> symbols = mapper.readValue(url,
					mapper.getTypeFactory().constructCollectionType(Collection.class, StockSymbol.class));
			for (StockSymbol s : symbols) {
				response.add("Symbol: " + s.getSymbol() + "\n" + "Company Name: " + s.getName() + "\n" + "Date: " + s.getDate()
						+ "\n" + "Is Enabled: " + s.isEnabled() + "\n" + "Type: " + s.getType() + "\n" + "Iex ID: "
						+ s.getIexId() + "\n");
			}

		} catch (MalformedURLException e) {
			logger.severe(String.valueOf(e));
		} catch (IOException ioe) {
			respString = "{\"message\":\"data not found}";
			response.add(respString);
		}
		return response;
	}

	@Override
	public String getStockQuote(String symbol) {

		StockQuote stockQuote = null;
		String response = "";
		ObjectMapper mapper = new ObjectMapper();

		try {
			URL url = new URL("https://api.iextrading.com/1.0/stock/" + symbol
					+ "/batch?types=quote,news,chart&range=1m&last=10");
			stockQuote = mapper.readValue(url, StockQuote.class);
			response = "Stock Symbol: " + stockQuote.getQuote().getSymbol() + "\n" + "Company Name: "
					+ stockQuote.getQuote().getCompanyName() + "\n" + "Latest Time: "
					+ stockQuote.getQuote().getLatestTime() + "\n" + "Sector: " + stockQuote.getQuote().getSector()
					+ "\n" + "Closing Price: " + stockQuote.getQuote().getClose() + "\n" + "Opening Price: "
					+ stockQuote.getQuote().getOpen() + "\n" + "Highest Price: " + stockQuote.getQuote().getHigh()
					+ "\n" + "Lowest Price: " + stockQuote.getQuote().getLow();
		} catch (MalformedURLException e) {
			logger.severe(String.valueOf(e));
		} catch (IOException ioe) {
			response = "{\"message\":\"data not found}";
		}
		return response;
	}

}
