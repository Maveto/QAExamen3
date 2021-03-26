package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import pages.MainPage;
import pages.PricipalPage;
import sessionWeb.Session;

public class Ej2 {
    MainPage mainPage = new MainPage();
    PricipalPage pricipalPage = new PricipalPage();
    String email = "mautest@mautest.com";
    String pwd = "1234";
    String newpwd = "12345";

    @Test
    public void verifyChangePwd() throws InterruptedException {
        Session.getSession().getDriver().get("http://todo.ly/");

        mainPage.loginImg.click();
        mainPage.email.set(email);
        mainPage.pwd.set(pwd);
        mainPage.loginButton.click();

        pricipalPage.settingsButton.click();
        pricipalPage.oldPwd.set(pwd);
        pricipalPage.newPwd.set(newpwd);
        pricipalPage.okButton.click();
        pricipalPage.logout.click();

        mainPage.loginImg.click();
        mainPage.email.set(email);
        mainPage.pwd.set(newpwd);
        mainPage.loginButton.click();
        Thread.sleep(2000);

        Assert.assertTrue("No se cambio la password", pricipalPage.logout.controlIsDisplayed());

    }

    @After
    public void close(){
        Session.getSession().closeSession();
    }
}
