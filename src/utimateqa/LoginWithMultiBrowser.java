package utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
public class LoginWithMultiBrowser {

    static String browser = "Edge";
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args) {

        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else{
            System.out.println("Wrong Browser name");
        }
        //Open the Url
        driver.get(baseUrl);
        //We give the implicit time to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the Title of the page
        String title = driver.getTitle();
        System.out.println("Page Title : " + title);

        //Print the page source
        System.out.println("Page source : " + driver.getPageSource());

        //Find the Email field element
        WebElement emailField = driver.findElement(By.id("user[email]"));
        //Enter the email to email field
        emailField.sendKeys("jasmeen144@gmail.com");

        //Enter the password to Password field
        driver.findElement(By.id("user[password]")).sendKeys("Prime");

        //Browser close
        driver.close();
    }


}
