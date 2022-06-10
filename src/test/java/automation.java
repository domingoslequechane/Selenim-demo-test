import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation {
    String searchText = "Testagem e Validação de Software";
    @Test
    public void searchGoogle(){
        System.setProperty("webdriver.chrome.driver", "src/drive/chromedriver");
        WebDriver browser = new ChromeDriver();

//      Page Navigations
        browser.get("https://google.com");
        browser.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).click();
        browser.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(searchText, Keys.ENTER);
        browser.findElement(By.xpath("//*[@id=\"rso\"]/div[3]/div/div/div[1]/a/h3")).click();
    }
}
