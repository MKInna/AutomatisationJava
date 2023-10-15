package ui.selenium.builder;

import ui.selenium.po.AuthorizationPage;

public class LoginPageBuilder {
    private String userName;
    private String password;

    public LoginPageBuilder withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public LoginPageBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public AuthorizationPage build() {
        return new AuthorizationPage()
                .setEnterPassword(password)
                .setEnterUserName(userName);
    }
}
