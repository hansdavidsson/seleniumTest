import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.*;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


import static org.junit.jupiter.api.Assertions.*;

class SeleniumTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    final private String testURL = "https://hansdavidsson-frontend.herokuapp.com/";
    final private String testURL2 = "https://hansdavidsson-frontend.herokuapp.com/clone_index.html";

    @Test
    @DisplayName("Getting the title of a website")
    public void testTitle() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get(testURL);
        Assertions.assertEquals(driver.getTitle(), "Homepage");
        System.out.println(driver.getTitle());
    }
    @Test
    @DisplayName("Start the game")
    public void startTheGame() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get(testURL2);
        WebElement nameButton = driver.findElement(By.id("playmebtn"));
        nameButton.click();
    }
}