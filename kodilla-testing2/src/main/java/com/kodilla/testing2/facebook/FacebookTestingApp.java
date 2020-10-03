package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookTestingApp {

    public static final String XPATH_REGISTRY = "//a[@role = \"button\"]";
    public static final String XPATH_SELECT = "//div[@class = \"_5k_5\"]/span/span";
    public static final String XPATH_SELECT_DAY = "//div[@class = \"_5k_5\"]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[@class = \"_5k_5\"]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[@class = \"_5k_5\"]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");

        WebElement registryButton = driver.findElement(By.xpath(XPATH_REGISTRY));
        registryButton.click();

        WebDriverWait driverWait = new WebDriverWait(driver, 5);
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_SELECT)));

        WebElement selectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select birthday = new Select(selectDay);
        birthday.selectByIndex(5);
        WebElement selectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select birthMonth = new Select(selectMonth);
        birthMonth.selectByIndex(8);
        WebElement selectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select birthYear = new Select(selectYear);
        birthYear.selectByIndex(25);
    }
}
