package com.github.binodnme.service

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 1/7/17.
 */

open class TestServiceImpl : TestService {
    override fun fetchHello(): String {
        return "hello kotlin";
    }
}