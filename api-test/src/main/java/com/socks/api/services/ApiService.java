//package com.socks.api.services;
//
//import jdk.jfr.ContentType;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//public class ApiService {
//
//    protected RequestSpecification setup() {
//
//        return RestAssured
//                .given()
//                .contentType(ContentType.JSON)
//                .filters(getFilters());
//    }
//
//    private List<Filter> getFilters() {
//        ProtectConfig config = ConfigFactory.create(ProjectConfig.class, System.getProperties());
//        if (config.loggin()) {
//            return Arrays.asList(new RequestLogginFilter(), new ResponseLoggingFilter(), new AllureRestAssured());
//        }
//        return Collections.singletonList(new AllureRestAssured());
//    }
//
//}
