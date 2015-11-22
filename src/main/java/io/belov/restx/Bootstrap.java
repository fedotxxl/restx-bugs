package io.belov.restx;

import com.google.common.eventbus.EventBus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import restx.factory.AutoStartable;
import restx.factory.Component;
import restx.factory.Factory;

/**
 * Created by fbelov on 22.11.15.
 */
@Component
public class Bootstrap implements AutoStartable {

    private static final Logger log = LoggerFactory.getLogger(Bootstrap.class);

    private EventBus bus;

    public Bootstrap(EventBus bus) {
        this.bus = bus;
    }

    @Override
    public void start() {
        log.info("Bootstrap starting");

        Factory.getInstance().getComponents(EventBusBean.class).forEach(bus::register);

        log.info("Bootstrap finished");
    }
}
