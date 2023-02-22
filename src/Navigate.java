import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
        //connect class to webdriver
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        //initiate the instance of Webdriver
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        //slow
        Thread.sleep(2000);
        //novigate to facebook
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);
        //go back
        driver.navigate().back();
        Thread.sleep(2000);
        //go to facebook again
        driver.navigate().forward();

    }
}
