package com.restapi;

import com.restapi.configuration.AppConfiguration;
import com.restapi.healthcheck.ResourceHealthCheck;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

/**
 * Created by renuka on 29/3/17.
 */
public class RestApiApplication extends Application<AppConfiguration> {

    public static void main(String[] args) throws Exception {
        new RestApiApplication().run(new String[]{"server", "conf/restapi.yml"});
    }

    public void run(AppConfiguration appConfiguration, Environment environment) throws Exception {
        environment.jersey().packages("com.restapi.resource");
        environment.healthChecks().register("Resource", new ResourceHealthCheck());
    }
}
