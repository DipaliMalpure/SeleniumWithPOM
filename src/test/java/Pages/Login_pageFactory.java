package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_pageFactory {
    WebDriver driver;
    public Login_pageFactory( WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
@FindBy(id="user-name")
    WebElement uname;
    @FindBy(id="password")
    WebElement pwd;
    @FindBy(id="login-button")
    WebElement btn;
    public void enterUname(String user)
    {
        uname.sendKeys(user);

    }
    public void enterPasword(String passwrd)
    {
       pwd.sendKeys(passwrd);

    }
    public void loginButton()
    {
       btn.click();

    }

}
