package com.socks.test;

import com.socks.api.payloads.UserPayload;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.isEmptyString;

public class UserTest {

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = "http://206.189.103.114";
    }

    @Test
    public void testCanRegisterNewUser() {
        UserPayload user = new UserPayload()
                .username(RandomStringUtils.randomAlphabetic(6))
                .password("test12345")
                .email("suchkalik@gmail.com");

        RestAssured
                .given().contentType(ContentType.JSON).log().all()
                .body(user)
                .when()
                .post("register")
                .then().log().all()
                .assertThat()
                .statusCode(200)
                .body("id", not(isEmptyString()));

    }
}
