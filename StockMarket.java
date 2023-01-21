package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockMarket {
  private static StockMarket instance = null;
  private List<Stock> stocks;

  private StockMarket(){
    stocks = new ArrayList<>();
  }

  public static synchronized StockMarket getInstance(){
    if(instance == null){
      instance = new StockMarket();
    }
    return instance;
  }
  
  public void updatePrice(Stock s, double price){
    if(this.stocks.contains(s)){
      s.setPrice(price);
      return;
    }
    System.out.println("stock not found");
  }

  public void addStock(Stock s){
    if(this.stocks.contains(s)){
      System.out.println("Stock already present");
      return;
    }
    this.stocks.add(s);
  }

  public void removeStock(Stock s){
    boolean removed = this.stocks.remove(s);
    if(!removed){
      System.out.println("stock not found");
    }
  }

  public void displayStocks(){
    for (Stock s: this.stocks) {
      System.out.println(s);  
    }
  }

 


}
