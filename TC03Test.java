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
public class TC03Test {
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
  public void tC03() {
    driver.get("https://demo.opencart.com/en-gb/catalog/desktops/mac?sort=pd.name&order=ASC");
    driver.manage().window().setSize(new Dimension(1050, 652));
    driver.findElement(By.linkText("Desktops")).click();
    driver.findElement(By.linkText("Mac (1)")).click();
    driver.findElement(By.id("input-sort")).click();
    {
      WebElement dropdown = driver.findElement(By.id("input-sort"));
      dropdown.findElement(By.xpath("//option[. = 'Name (A - Z)']")).click();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".button-group > button:nth-child(2)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".button-group > button:nth-child(1)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".fa-shopping-cart")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".fa-circle-notch"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".btn-inverse")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("a:nth-child(2) > strong"));
      assert(elements.size() > 0);
    }
  }
}
