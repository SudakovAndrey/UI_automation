package com.socks.api.conditions;

import io.restassured.response.Response;

public interface Conditions {

    void check(Response response);
}
