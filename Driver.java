package edu.neu.csye7374;

public class Driver {
    public static void main(String[] args) {
        System.out.println("============Main Execution Start===================\n\n");
        Stock googleStock = new Google(100.0);
        Stock teslaStock = new Tesla(87.0);
        
        StockMarket.getInstance().addStock(googleStock);
        StockMarket.getInstance().addStock(teslaStock);

        googleStock.setBid(100.27);
        System.out.println(googleStock);
        googleStock.setBid(99.20);
        System.out.println(googleStock);
        googleStock.setBid(98.26);
        System.out.println(googleStock);
        googleStock.setBid(96.43);
        System.out.println(googleStock);
        googleStock.setBid(95.50);
        System.out.println(googleStock);
        googleStock.setBid(94.5);
        System.out.println(googleStock);

        teslaStock.setBid(80.23);
        System.out.println(teslaStock);
        teslaStock.setBid(79.67);
        System.out.println(teslaStock);
        teslaStock.setBid(78.34);
        System.out.println(teslaStock);
        teslaStock.setBid(77.37);
        System.out.println(teslaStock);
        teslaStock.setBid(76.17);
        System.out.println(teslaStock);
        teslaStock.setBid(78.90);
        System.out.println(teslaStock);

        StockMarket.getInstance().displayStocks();
        System.out.println("\n\n============Main Execution End===================");
    }
}
