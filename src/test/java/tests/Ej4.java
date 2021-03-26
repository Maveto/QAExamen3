package tests;

import activities.MainActivity;
import activities.SetAlarmActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionAppium.Session;

import java.net.MalformedURLException;

public class Ej4 {
    MainActivity mainActivity = new MainActivity();
    SetAlarmActivity setAlarmActivity = new SetAlarmActivity();

    @Test
    public void verifySetAlarm() throws MalformedURLException, InterruptedException {

        mainActivity.addAlarm.click();

        setAlarmActivity.mondayButton.click();
        setAlarmActivity.save.click();

        Thread.sleep(2000);
        Assert.assertTrue("No se creo la alarma", mainActivity.newAlarm.isControlDisplayed());
    }

    @After
    public void closeApp() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
