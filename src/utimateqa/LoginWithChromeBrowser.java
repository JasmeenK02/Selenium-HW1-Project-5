package utimateqa;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * 1. Setup Chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */

public class LoginWithChromeBrowser {

    public static void main(String[] args) {

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        // Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //Open the URL
        driver.get(baseUrl);
        // We give implicit time to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page Title : " + title);

        //Print the current URL
        System.out.println("Current URL : " + driver.getCurrentUrl());

        //Print page source
        System.out.println("Page source : " + driver.getPageSource());

        //Find the Email field element
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("jasmeen144@gmail.com");

        //Enter the password to Password field element
        driver.findElement(By.id("user[password]")).sendKeys("Prime");

        //Browser close
        driver.close();



    }
}
