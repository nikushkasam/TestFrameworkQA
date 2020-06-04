package com.it.helpers;

import com.it.pages.BasePage;

public class CommonHelper extends BasePage {

    public void takeScreenShot() {
        driver.takeSnapShot();
    }

    public void appStop()
    {
        driver.quit();
    }

}
