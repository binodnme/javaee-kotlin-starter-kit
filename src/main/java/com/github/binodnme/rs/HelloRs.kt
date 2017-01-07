package com.github.binodnme.rs

import com.github.binodnme.service.TestService
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 1/7/17.
 */

@Path("/")
open class HelloRs {

    @Inject
    private lateinit var testService: TestService

    @Path("/hello")
    @GET
    open fun sayHello(): String {
        return testService.fetchHello();
    }
}