package pattern.command.action;

import pattern.command.contract.OrderCommand;
import pattern.command.model.Order;

public class OrderDoneCommand implements OrderCommand {

    private Order order;

    public OrderDoneCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.updateOrderStatusToDone();
    }
}
