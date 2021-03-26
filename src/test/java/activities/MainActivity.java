package activities;

import controlsAppium.Button;
import controlsAppium.Label;
import org.openqa.selenium.By;

public class MainActivity {
    public Button addAlarm = new Button(By.id("com.sec.android.app.clockpackage:id/menu_alarm_add"));
    public Label newAlarm = new Label(By.xpath("//android.view.ViewGroup[@content-desc=\"6 Horas a. m., Cada lunes, Act., Pulse dos veces para editar.\"]"));
}
