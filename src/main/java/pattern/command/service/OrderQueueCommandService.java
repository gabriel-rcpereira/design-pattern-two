package pattern.command.service;

import pattern.command.contract.OrderCommand;

import java.util.ArrayList;
import java.util.List;

public class OrderQueueCommandService {

    private List<OrderCommand> orderCommands;

    public OrderQueueCommandService() {
        orderCommands = new ArrayList<>();
    }

    public void add(OrderCommand orderCommand){
        this.orderCommands.add(orderCommand);
    }

    public void execute(){
        this.orderCommands.forEach(OrderCommand::execute);
    }
}
