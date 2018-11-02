<h1>Stock Quote</h1>

<p>This project is a REST Consumer which consume stock data from<a href="https://iextrading.com"> IEX API</a> using java.</p>
<p>To pull the image from <a href="https://hub.docker.com/r/luckyp71/stock_quote/">docker hub</a> just simply run <strong>docker pull luckyp71/stock_quote</strong> command</p>

<h2>Prerequisites</h2>
<p>1. Java 8</p>
<p>2. Jackson</p>
<p>3. Maven</p> 
<p>4. Docker</p>

<h2>Step to run the program</h2>
<p>1. Cleaning, installing, and packaging the project by using maven command i.e. <strong>mvn clean install package</strong>.</p>
<p>2. Create docker image of this project by using docker-compose command i.e. <strong>docker-compose up -d --build</strong></p>
<p>3. Run stock_quote:dev image by running <strong>docker run -it stock_quote:dev</strong> command</p>
<p>4. Enter the particular command for particular purpose, please check the detail <a href="./src/main/resources/input.txt">here</a></p>

<h2>Retrieve Stock Symbols Data</h2>
<div>
<img src="./src/main/resources/get-symbols.png" height="800pt" width="1000pt"/>
</div>

<h2>Retrieve Stock Quote Data</h2>
<div>
<img src="./src/main/resources/get-quote.png" height="800pt" width="1000pt"/>
</div>
