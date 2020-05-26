package com.it;

import com.it.helpers.*;


public class App {
    public CommonHelper common;
    public LoginHelper login;
    public DashboardHelper dashboard;
    public CreateEmailHelper email;
    public EmailStatusHelper statusEmail;
    public ViewEmailHelper viewEmail;

    public App() {
        common = new CommonHelper();
        login = new LoginHelper();
        dashboard = new DashboardHelper();
        email = new CreateEmailHelper();
        statusEmail = new EmailStatusHelper();
        viewEmail = new ViewEmailHelper();
    }
}
