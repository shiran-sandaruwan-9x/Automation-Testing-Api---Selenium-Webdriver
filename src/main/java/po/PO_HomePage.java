package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PO_HomePage {

    //step 1
    WebDriver driver;

    public PO_HomePage() {
    }

    //step 2
    public PO_HomePage(WebDriver webDriver) {
        //step 3
        this.driver=webDriver;

    }

    //step 4
    @FindBy(how = How.XPATH, using = "//input[@ng-model='FirstName' and @placeholder='First Name']")
    private WebElement text_firstName;

    @FindBy(how = How.XPATH, using = "//input[@ng-model='LastName' and @placeholder='Last Name']")
    private WebElement text_lastName;

    @FindBy(how = How.XPATH, using = "//textarea[@ng-model='Adress']")
    private WebElement text_address;

    @FindBy(how = How.XPATH, using = "//input[@ng-model='EmailAdress']")
    private WebElement text_email;

    @FindBy(how = How.XPATH, using = "//input[@ng-model='Phone']")
    private WebElement text_phone;

    @FindBy(how = How.ID, using = "Skills")
    private WebElement select_list_skills;

    public void setText_firstName(String text_firstName) {
        this.text_firstName.sendKeys(text_firstName);
    }

    public void setText_lastName(String text_lastName) {
        this.text_lastName.sendKeys(text_lastName);
    }

    public void setText_address(String text_address) {
        this.text_address.sendKeys(text_address);
    }

    public void setText_email(String text_email) {
        this.text_email.sendKeys(text_email);
    }

    public void setText_phone(String text_phone) {
        this.text_phone.sendKeys(text_phone);
    }

    public void selectSkillsByValue(String skills){
        Select dropDown = new Select(this.select_list_skills);
        dropDown.selectByValue(skills);
    }

}
