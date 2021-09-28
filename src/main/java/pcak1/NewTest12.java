package pcak1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest12 {
  @Test
  public void f() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kamal\\Desktop\\drivers246\\chromedriver.exe");
		//opens chrome browser
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://ui.freecrm.com/");
        
       String atitle =  driver.getTitle();
       String etitle = "Cogmento CRM";
       
       System.out.println("test tet");
  }
}
