import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Set the driver path
System.setProperty("webdriver.edge.driver", "C:\\Users\\Sakshi\\Desktop\\java\\test_project\\src\\drivers\\msedgedriver.exe");
WebDriver driver = new EdgeDriver();

driver.get("https://demo.guru99.com/test/newtours/register.php");

Thread.sleep(1000);

WebElement firstName = driver.findElement(By.name("firstName"));
firstName.sendKeys("Sakshi");

Thread.sleep(1000);

WebElement lastName = driver.findElement(By.name("lastName"));
lastName.sendKeys(".");

Thread.sleep(1000);

WebElement phone = driver.findElement(By.name("phone"));
phone.sendKeys("9876543210");

Thread.sleep(1000);

WebElement username = driver.findElement(By.name("userName"));
username.sendKeys("sakshi123@gmail.com");

Thread.sleep(1000);

WebElement address = driver.findElement(By.name("address1"));
address.sendKeys("New Hari Nagar");

Thread.sleep(1000);

WebElement city = driver.findElement(By.name("city"));
city.sendKeys("Hoshiarpur");

Thread.sleep(1000);

WebElement state = driver.findElement(By.name("state"));
state.sendKeys("Punjab");

Thread.sleep(1000);

WebElement pinCode = driver.findElement(By.name("postalCode"));
pinCode.sendKeys("146001");

Thread.sleep(1000);

Select countryList = new Select(driver.findElement(By.name("country")));
countryList.selectByValue("INDIA");

Thread.sleep(1000);

WebElement loginUserName = driver.findElement(By.id("email"));
loginUserName.sendKeys("sakshi@gmail.com");

Thread.sleep(1000);

WebElement password = driver.findElement(By.name("password"));
password.sendKeys("sakshi@12345987");

Thread.sleep(1000);

WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
confirmPassword.sendKeys("sakshi@12345987");

Thread.sleep(1000);

WebElement submit = driver.findElement(By.name("submit"));
submit.click();

Thread.sleep(4000);
driver.quit();
}
}