// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TC02LoginTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tC02Login() {
    driver.get("https://demo.opencart.com/");
    driver.findElement(By.cssSelector(".show > .d-none")).click();
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("input-email")).click();
    driver.findElement(By.id("input-email")).sendKeys("harrishvijay.gk856@gmail.com");
    driver.findElement(By.id("input-password")).click();
    driver.findElement(By.id("input-password")).sendKeys("123456");
    driver.findElement(By.cssSelector(".text-end:nth-child(5) > .btn")).click();
    {
      List<WebElement> elements = driver.findElements(By.linkText("Logout"));
      assert(elements.size() > 0);
    }
  }
}
