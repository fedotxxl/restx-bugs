package io.belov.restx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import restx.factory.Component;

/**
 * Created by fbelov on 22.11.15.
 */
@Component
public class SampleService implements EventBusBean {

    private static final Logger log = LoggerFactory.getLogger(SampleService.class);

    public SampleService() {
        log.warn("Creating SampleService - " + this.toString());
    }
}
