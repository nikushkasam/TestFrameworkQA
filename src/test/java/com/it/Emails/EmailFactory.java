package com.it.Emails;


import java.util.ResourceBundle;

public class EmailFactory {
    private static ResourceBundle email = ResourceBundle.getBundle("email");

    public static Email sendEmail() {
        return new Email(email.getString("letterEmail"),
                email.getString("letterSubject"),
                email.getString("letterDescription"));
    }


}
