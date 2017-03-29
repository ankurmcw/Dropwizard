package com.restapi.resource;

import com.codahale.metrics.annotation.Timed;
import com.restapi.dto.UserInfo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by renuka on 29/3/17.
 */

@Path("/user")
@Produces (MediaType.APPLICATION_JSON)
public class UserResource {

    @GET
    @Timed
    public UserInfo getUserInfo() {
        return new UserInfo("A22472", "Ankur");
    }
}
