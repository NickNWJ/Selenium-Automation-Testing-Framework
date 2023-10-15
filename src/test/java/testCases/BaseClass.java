import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public String baseURL = "https://demo.guru.com/v4/";
    public String username = "mngr164225";
    public String password = "jagetAp";
    public static WebDriver driver;

    @BeforeClass
    public void setup()
    {
        System.setProperty("webdriver.chrom.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

}
