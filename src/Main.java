import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //tell your project where webdriver is located
System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
//create an instance of webdriver
        WebDriver driver=new ChromeDriver();
        //open the website
        driver.get("https://www.facebook.com/");
//get current url that is these in the browser
        String URL=driver.getCurrentUrl();
        System.out.println(URL);
        //get the title of webpage
        String title=driver.getTitle();
        System.out.println("the title of the page is "+title);
        Thread.sleep(3000);
        //close thr browser
        driver.quit();





    }
}