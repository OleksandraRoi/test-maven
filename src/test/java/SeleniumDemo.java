import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/");

        WebElement searchbox = driver.findElement(By.name("q"));

        String search = "chatGPT";
        String expectedTitle = "chatGPT - Google Search";
        searchbox.sendKeys(search, Keys.ENTER);

        String currentTitel = driver.getTitle();

        if(expectedTitle.equals(currentTitel)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed. The current title is "+currentTitel);
        }
    }
}
