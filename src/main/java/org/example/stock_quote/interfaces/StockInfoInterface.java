package org.example.stock_quote.interfaces;

import java.util.Collection;

import org.example.stock_quote.models.StockQuote;
import org.example.stock_quote.models.StockSymbol;

public interface StockInfoInterface {

	//Get all stock symbols
	public Collection<String> getStockSymbols();
	
	//Get stock quote
	public String getStockQuote(String symbol);
	
}
