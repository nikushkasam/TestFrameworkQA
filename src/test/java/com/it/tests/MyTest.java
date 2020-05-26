package com.it.tests;


import org.testng.Assert;
import org.testng.annotations.Test;


public class MyTest extends BaseTest{
    @Test
    public void test1()  {

        /*System.out.println(UserFactory.getRandomUsers(10));*/
        app.login.login(validUser);
        Assert.assertEquals(app.dashboard.getLbUserEmail(), validUser.email);
        app.dashboard.btnClickCreateEmail();
        app.email.create(sendEmail);
        Assert.assertTrue(true, app.statusEmail.getLbConfirmBlock());
        app.statusEmail.clickCheckMails();
        app.dashboard.btnСlickRowFirstNewLetter();
        Assert.assertEquals(app.viewEmail.getEmailBody(), sendEmail);







    }


}
