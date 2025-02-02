package pl.javasolution.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.javasolution.api.IOrder;
import pl.javasolution.api.IPizza;
import pl.javasolution.implementation.ExoticPizza;
import pl.javasolution.implementation.GoodPizza;
import pl.javasolution.implementation.Order;

@Configuration
public class Config {
    @Bean
    public IPizza pizza() {
        return new ExoticPizza(17, "Exotic");
    }

    @Bean (name = "inna")
    public IOrder order(IPizza pizza) {
        return new Order(pizza);
    }
}
