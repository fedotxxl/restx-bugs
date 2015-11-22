package io.belov.restx.resource;

import io.belov.restx.SampleService;
import restx.annotations.GET;
import restx.annotations.RestxResource;
import restx.factory.Component;

/**
 * Created by fbelov on 22.11.15.
 */
@Component
@RestxResource("/app")
public class SampleResource {

    private SampleService sampleService;

    public SampleResource(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GET("/hello")
    String doSomething() {
        return "hello world";
    }
}

