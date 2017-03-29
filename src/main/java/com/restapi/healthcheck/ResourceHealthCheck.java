package com.restapi.healthcheck;

import com.codahale.metrics.health.HealthCheck;

/**
 * Created by renuka on 29/3/17.
 */
public class ResourceHealthCheck extends HealthCheck {
    protected Result check() throws Exception {
        return Result.healthy("The resources are healthy");
    }
}
