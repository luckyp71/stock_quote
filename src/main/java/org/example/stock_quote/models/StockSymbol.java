package org.example.stock_quote.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//The purpose of adding this annotation is to prevent the future changing in the REST provider
@JsonIgnoreProperties(ignoreUnknown = true)
public class StockSymbol {
	@JsonProperty(value="symbol")
	private String symbol;
	@JsonProperty(value="name")
	private String name;
	@JsonProperty(value="date")
	private String date;
	@JsonProperty(value="isEnabled")
	private boolean isEnabled;
	@JsonProperty(value="type")
	private String type;
	@JsonProperty(value="iexId")
	private String iexId;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIexId() {
		return iexId;
	}

	public void setIexId(String iexId) {
		this.iexId = iexId;
	}
}
