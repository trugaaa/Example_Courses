package lesson1.conditions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class RealConditionUsageApplication {

    public static void main(String[] args) {
        String browserName = "firefox";
        WebDriver driver;

        switch (browserName) {
            case "chrome": {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(new ChromeOptions());
                break;
            }
            case "firefox": {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver(new FirefoxOptions());
                break;
            }
            default: {
                throw new IllegalStateException("Unknown Browser provided");
            }
        }
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        try {
            Thread.sleep(7500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
        System.out.println("Success: " + browserName);
    }
}
