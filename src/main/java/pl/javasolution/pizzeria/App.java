package pl.javasolution.pizzeria;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.javasolution.api.IOrder;
import pl.javasolution.config.Config;
import pl.javasolution.implementation.Order;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        IOrder order = context.getBean(Order.class);
        order.printOrder();
    }
}
