package pattern.command.model;

import pattern.command.enums.OrderStatus;

public class Order {

    private String customerName;
    private OrderStatus orderStatus;

    public String getCustomerName() {
        return customerName;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void updateOrderStatusToInProgress(){
        System.out.println(String.format("Changing the Order status [%s] to [%s]. Customer [%s].",
                this.orderStatus.name(),
                OrderStatus.IN_PROGRESS.name(),
                customerName));
        this.orderStatus = OrderStatus.IN_PROGRESS;
    }

    public void updateOrderStatusToDone(){
        System.out.println(String.format("Changing Order status [%s] to [%s]. Customer [%s].",
                this.orderStatus.name(),
                OrderStatus.DONE.name(),
                this.customerName));
        this.orderStatus = OrderStatus.DONE;
    }

    public static class Builder
    {

        private Order order = new Order();

        public Builder withCustomerName(String customerName) {
            this.order.customerName = customerName;
            return this;
        }

        public Order build() {
            order.orderStatus = OrderStatus.NEW;
            return order;
        }
    }
}
