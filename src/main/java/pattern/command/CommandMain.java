package pattern.command;

import pattern.command.action.OrderDoneCommand;
import pattern.command.action.OrderInProgressCommand;
import pattern.command.model.Order;
import pattern.command.service.OrderQueueCommandService;

public class CommandMain {

    public static void main(String[] args){
        Order orderOne = new Order.Builder()
                .withCustomerName("Customer 1")
                .build();

        Order orderTwo = new Order.Builder()
                .withCustomerName("Customer 2")
                .build();

        OrderQueueCommandService orderQueueCommandService = new OrderQueueCommandService();
        orderQueueCommandService.add(new OrderInProgressCommand(orderOne));
        orderQueueCommandService.add(new OrderDoneCommand(orderOne));

        orderQueueCommandService.add(new OrderInProgressCommand(orderTwo));
        orderQueueCommandService.add(new OrderDoneCommand(orderTwo));

        orderQueueCommandService.execute();
    }
}
