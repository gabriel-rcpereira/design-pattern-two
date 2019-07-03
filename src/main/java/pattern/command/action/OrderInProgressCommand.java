package pattern.command.action;

import pattern.command.contract.OrderCommand;
import pattern.command.model.Order;

public class OrderInProgressCommand implements OrderCommand {

    private Order order;

    public OrderInProgressCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.updateOrderStatusToInProgress();
    }
}
