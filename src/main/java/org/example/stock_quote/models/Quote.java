package org.example.stock_quote.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
	
	@JsonProperty(value="symbol")
	private String symbol;
	
	@JsonProperty(value="companyName")
	private String companyName;
	
	@JsonProperty(value="sector")
	private String sector;
	
	@JsonProperty(value="latestTime")
	private String latestTime;
	
	@JsonProperty(value="open")
	private Double open;
	
	@JsonProperty(value="close")
	private Double close;
	
	@JsonProperty(value="high")
	private Double high;
	
	@JsonProperty(value="low")
	private Double low;
	
	
	public String getSymbol() {
		return symbol;
	}
	
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getSector() {
		return sector;
	}
	
	public void setSector(String sector) {
		this.sector = sector;
	}
	
	public String getLatestTime() {
		return latestTime;
	}

	public void setLatestTime(String latestTime) {
		this.latestTime = latestTime;
	}

	public Double getOpen() {
		return open;
	}
	
	public void setOpen(Double open) {
		this.open = open;
	}
	
	public Double getClose() {
		return close;
	}
	
	public void setClose(Double close) {
		this.close = close;
	}
	
	public Double getHigh() {
		return high;
	}
	
	public void setHigh(Double high) {
		this.high = high;
	}
	
	public Double getLow() {
		return low;
	}
	
	public void setLow(Double low) {
		this.low = low;
	}
}
