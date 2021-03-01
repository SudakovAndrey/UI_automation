package com.socks.ui;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class LoggedUserPage {
    public static SelenideElement logoutBtn() { return $("#logout > a"); }
    public static SelenideElement userName() { return $("#howdy > a"); }
}
