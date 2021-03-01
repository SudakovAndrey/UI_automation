package com.socks.ui.tests;

import com.socks.ui.LoggedUserPage;
import com.socks.ui.MainPage;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.*;

public class TestLogin extends BaseUITest {

    @Test
    public void userCanLoginWithValidCredentials() {
        // when
        MainPage.open()
        .loginAs("suchkalik", "123456");

        LoggedUserPage loggedUserPage = at(LoggedUserPage.class);
        LoggedUserPage.logoutBtn().shouldHave(text("Logout"));
        LoggedUserPage.userName().shouldHave(text("Logged in as"));
    }
}
