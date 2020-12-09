package com.it.tests;


import com.it.utils.AllureLogger;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MyTest extends BaseTest{

    @Test
    public void test1()  {

        /*System.out.println(UserFactory.getRandomUsers(10));*/
        /*System.out.println(EmailFactory.getRandomEmails(10));*/

        /*app.login.login(validUser);
        Assert.assertEquals(app.dashboard.getLbUserEmail(), validUser.email);
        app.dashboard.btnClickCreateEmail();
        app.email.createEmail(sendEmail);
        Assert.assertTrue(true, app.statusEmail.getLbConfirmBlock());
        app.statusEmail.clickCheckMails();
        app.dashboard.btnСlickRowFirstNewLetter();
        Assert.assertEquals(app.viewEmail.getEmail(), sendEmail);*/


        app.login.login(validUser);
        app.common.takeScreenShot();
        Assert.assertEquals(app.dashboard.getLbUserEmail(), validUser.email);


    }



}
