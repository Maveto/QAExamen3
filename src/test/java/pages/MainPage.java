package pages;

import controlsWeb.Button;
import controlsWeb.Image;
import controlsWeb.TextBox;
import org.openqa.selenium.By;

public class MainPage {
    public Image loginImg= new Image(By.xpath("//img[@src='/Images/design/pagelogin.png']"));
    public TextBox email= new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail"));
    public TextBox pwd = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword"));
    public Button loginButton = new Button(By.id("ctl00_MainContent_LoginControl1_ButtonLogin"));
    public MainPage(){}
}
