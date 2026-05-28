package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginTest3 {

    WebDriver driver;
    LoginPage login;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        login = new LoginPage(driver);
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @Test
    public void loginCorrecto() {

        login.ingresarUsuario("student");
        login.ingresarPassword("Password123");
        login.clickLogin();

        Assertions.assertTrue(
                driver.getPageSource().contains("Logged In Successfully")
        );
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}