package pages;

import controlsWeb.Button;
import controlsWeb.TextBox;
import org.openqa.selenium.By;

public class PricipalPage {
    public Button settingsButton = new Button(By.xpath("//td//a[contains(.,'Settings')]"));
    public TextBox oldPwd = new TextBox(By.xpath("//td/input[@id='TextPwOld']"));
    public TextBox newPwd = new TextBox(By.xpath("//td/input[@id='TextPwNew']"));
    public Button okButton = new Button(By.xpath("//div//button//span[contains(.,'Ok')]"));
    public Button logout = new Button(By.xpath("//td//a[contains(.,'Logout')]"));
}
