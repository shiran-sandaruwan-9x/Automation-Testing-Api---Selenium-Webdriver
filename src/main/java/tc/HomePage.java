package tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import po.PO_HomePage;

import java.util.concurrent.TimeUnit;


public class HomePage {

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","D:\\mi synergy\\mssql connection pool conrol\\TestDemoApp\\chromedriver.exe");
    }

    @Test
    public void test1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MICROSECONDS);

       // PO_HomePage po_homePage=new PO_HomePage(driver);
        PO_HomePage po_homePage = PageFactory.initElements(driver, PO_HomePage.class);
        po_homePage.setText_firstName("Shiran");
        po_homePage.setText_lastName("Sandaruwan");
        po_homePage.setText_address("no 12 colombo");
        po_homePage.setText_email("sadaruwan101@gmail.com");
        po_homePage.setText_phone("0716583267");
        po_homePage.selectSkillsByValue("Android");

    }

}
