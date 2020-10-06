package design_pattern.behavioral.command.example2.command.type;

import design_pattern.behavioral.command.example2.command.Order;
import design_pattern.behavioral.command.example2.command.Stock;

public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
