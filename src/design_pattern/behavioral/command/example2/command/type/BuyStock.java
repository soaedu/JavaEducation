package design_pattern.behavioral.command.example2.command.type;

import design_pattern.behavioral.command.example2.command.Order;
import design_pattern.behavioral.command.example2.command.Stock;

public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
