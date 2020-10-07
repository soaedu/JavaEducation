package design_pattern.behavioral.command.example2;

import design_pattern.behavioral.command.example2.command.Broker;
import design_pattern.behavioral.command.example2.command.Stock;
import design_pattern.behavioral.command.example2.command.type.BuyStock;
import design_pattern.behavioral.command.example2.command.type.SellStock;

public class CommandMain {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
