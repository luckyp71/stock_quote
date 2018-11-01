package org.example.stock_quote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;

import org.example.stock_quote.controllers.StockInfoController;

public class App {
	public static void main(String[] args) {

		StockInfoController stockController = new StockInfoController();

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		boolean running = true;
		int counter = 1;
		while (running) {
			try {
				String userInput = input.readLine();

				if (userInput == null) {
					userInput = " ";
				}

				String[] splitUserInput = userInput.split("\\s");

				if (userInput.contains("get quote") && splitUserInput.length == 3) {
					System.out.println(stockController.getStockQuote(splitUserInput[2]) + "\n");
				} else if (userInput.contains("get symbols") && splitUserInput.length == 2) {
					Collection<String> symbols = stockController.getStockSymbols();
					for (String symbol : symbols) {
						System.out.println(symbol);
					}
				} else if (userInput.contains("exit") && splitUserInput.length == 1) {
					System.out.println("Good Bye");
					running = false;
					System.exit(0);
				} else {
					counter++;
					if (counter > 3) {
						System.out.println("Your enter the wrong command 3 times, system will exit");
						System.exit(0);
					} else {
						System.out.println("Please input the right command");
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
