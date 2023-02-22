import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkSelenium1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String title=driver.getTitle();
        System.out.println(title);
        String URL=driver.getCurrentUrl();
        Thread.sleep(4000);
        driver.close();
    }
}
