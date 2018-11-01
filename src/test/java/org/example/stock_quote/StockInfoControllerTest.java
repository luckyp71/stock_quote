package org.example.stock_quote;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Collection;

import org.example.stock_quote.controllers.StockInfoController;

public class StockInfoControllerTest {

	private StockInfoController stockController = new StockInfoController();

	//Test getStockSymbol method from StockInfoController
	@Test
	public void testGetStockSymbols() {
		boolean expectedResult = true;
		boolean actualResult = false;
		
		Collection<String> symbols = stockController.getStockSymbols();
		
		if (symbols != null) {
			actualResult = true;
		}
		assertEquals(expectedResult, actualResult);
	}
	
	//Test getStyockQuote method from StockInfoController
	@Test
	public void testGetStockQuote() {
		boolean expectedResult = true;
		boolean actualResult = false;
		
		String stockQuote = stockController.getStockQuote("GOOG");
		
		if (stockQuote != "" && stockQuote != "{\"message\":\"data not found}") {
			actualResult = true;
		}
		assertEquals(expectedResult, actualResult);
	}
	
}
