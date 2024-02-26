package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage {
    @FindBy(xpath ="//input[@formcontrolname='username']")
    public WebElement userNameTextBox;

    @FindBy(xpath ="//input[@formcontrolname='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath ="//button[@aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath = "(//img[@class='logo-icon'])[1]")
    public WebElement technoStudyImage;




}
