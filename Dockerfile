FROM java:8
MAINTAINER Lucky Pratama

ADD /target/stock_quote-0.0.1-SNAPSHOT-jar-with-dependencies.jar /stock_quote.jar

ENTRYPOINT ["java","-jar","/stock_quote.jar"]
