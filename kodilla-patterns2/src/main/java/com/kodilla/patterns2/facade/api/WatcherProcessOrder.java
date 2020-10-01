package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class WatcherProcessOrder {
    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherProcessOrder.class);

    @Before(value = "execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" + "&&target(object)")
    public void logEvent(Object object) {
            LOGGER.info("Call processOrder method from class: " + object.getClass().getName());
    }
}
