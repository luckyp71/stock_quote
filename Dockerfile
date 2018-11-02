FROM java:8
LABEL maintainer="luckypratama71@yahoo.com"

ADD /target/stock_quote-0.0.1-SNAPSHOT-jar-with-dependencies.jar /stock_quote.jar

ENTRYPOINT ["java","-jar","/stock_quote.jar"]
