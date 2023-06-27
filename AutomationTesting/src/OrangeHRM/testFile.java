package OrangeHRM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testFile {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AjayC\\Desktop\\GIT\\selenium-automation\\AutomationTesting\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");

        Thread.sleep(3000);
        WebElement username = driver.findElement(By.id("input-username"));
        username.sendKeys("demo");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("demo");

        WebElement login = driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button"));
        login.click();

        Thread.sleep(3000);

        WebElement closeAlert = driver.findElement(By.xpath("//*[@id=\"modal-security\"]/div/div/div[1]/button"));
        closeAlert.click();

        Thread.sleep(3000);

        WebElement catalogLink = driver.findElement(By.linkText("Catalog"));
        catalogLink.click();

        WebElement categoriesLink = driver.findElement(By.linkText("Categories"));
        categoriesLink.click();

        List<WebElement> tableRows = driver.findElements(By.tagName("tr"));
        int totalRows = tableRows.size();
        System.out.println("Total number of rows: " + totalRows);

        List<WebElement> tableData = driver.findElements(By.tagName("td"));
        int totalData = tableData.size();
        System.out.println("Total number of data: " + totalData);

        WebElement checkCamera = driver.findElement(By.xpath("//td[normalize-space()='Cameras']//preceding-sibling::td"));
        boolean isCameraSelected = checkCamera.isSelected();
        if (isCameraSelected) {
            System.out.println("The checkbox is already selected");
        } else {
            checkCamera.click();
        }

        List<WebElement> stringNumbers = driver.findElements(By.xpath("//*[@id=\"form-category\"]/div[1]/table/tbody/tr//td[3]"));

        List<Integer> integerNumbers = new ArrayList<Integer>();
        for (WebElement loopNumber : stringNumbers) {
            String individualNumber = loopNumber.getText();
            integerNumbers.add(Integer.parseInt(individualNumber));
        }
        System.out.println(integerNumbers);

        int smallestValue = Collections.min(integerNumbers);

        List<WebElement> selectSmallestValueChecks = driver.findElements(By.xpath("//td[normalize-space()='" + smallestValue + "']//preceding-sibling::td[2]"));
        for (WebElement selectSmallestValueCheck : selectSmallestValueChecks) {
            boolean isSmallestValueSelected = selectSmallestValueCheck.isSelected();
            if (!isSmallestValueSelected) {
                selectSmallestValueCheck.click();
            }
        }
    }
}
