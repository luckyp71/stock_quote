package org.example.stock_quote.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StockQuote {
	@JsonProperty(value="quote")
	private Quote quote;

	public Quote getQuote() {
		return quote;
	}

	public void setQuote(Quote quote) {
		this.quote = quote;
	}
	
	
}
