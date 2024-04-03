package Lesson2_labs.prob2B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Order {
    private LocalDate orderDate;
    private List<OrderLine> orderLineList;

    public Order(LocalDate localDate){
        this.orderDate = localDate;
        orderLineList = new ArrayList<>();
    }

    public void addOrderLine(String orderLineNum,
                             double price,
                             int quantity){
        orderLineList.add(new OrderLine(orderLineNum,
                                        price,
                                        quantity,
                                        this));
    }

    public List<OrderLine> getOrderLineList(){
        return orderLineList;
    }

    public LocalDate getOrderDate(){
        return orderDate;
    }
    @Override
    public String toString() {
        return "Order{" +
                "orderDate=" + orderDate +
                ", orderLineList=" + orderLineList +
                '}';
    }

}
