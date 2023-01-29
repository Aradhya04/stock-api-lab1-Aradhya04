package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Tradable{
    private String name;
    private double price;
    private String desc;
    private List<Double> prevPrices = new ArrayList<>();

    public Stock(String name, double price, String desc){
        this.name = name;
        this.price = price;
        this.desc = desc;
        prevPrices.add(price);
    }
    @Override
    public int getMetric() {
        double mean = (prevPrices.stream().mapToDouble(i -> i.doubleValue()).sum())/prevPrices.size();
        double dev= 0.0;
        for(double num: prevPrices) {
            dev +=  mean-num;
        }
        dev = dev/prevPrices.size();
        return dev > 0.0 ? 1 : -1;
    }
    @Override
    public void setBid(double bid) {
        prevPrices.add(bid);
        double newPrice = (prevPrices.stream().mapToDouble(i -> i.doubleValue()).sum())/prevPrices.size();
        StockMarket.getInstance().updatePrice(this, newPrice);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString(){
        return "Name: "+this.getName()+" Price: "+this.getPrice()+" Desc: "+this.getDesc()+" Metric: "+this.getMetric();
    }

}