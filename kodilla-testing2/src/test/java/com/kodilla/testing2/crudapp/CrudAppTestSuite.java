package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class CrudAppTestSuite {

    private static final String BASE_URL = "https://lisowski90.github.io/";
    private WebDriver webDriver;
    private Random generator;

    @Before
    public void WebDriver() {
        webDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        webDriver.get(BASE_URL);
        generator = new Random();
    }

    @After
    public void cleanUpAfterTest() {
        webDriver.close();
    }

    private String createCrudAppTestTask() throws InterruptedException {
        final String XPATH_TASK_NAME = "//form[contains(@action, \"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "//form[contains(@action, \"createTask\")]/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON = "//form[contains(@action, \"createTask\")]/fieldset[3]/button";
        String taskName = "Task number " + generator.nextInt(1000);
        String taskContent = taskName + " content!";

        WebElement name = webDriver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = webDriver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement button = webDriver.findElement(By.xpath(XPATH_ADD_BUTTON));
        button.click();
        Thread.sleep(2000);

        return taskName;
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        webDriver.navigate().refresh();

        while (!webDriver.findElement(By.xpath("//select[1]")).isDisplayed());

        webDriver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                            anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                        .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement buttonCreateCard =
                            theForm.findElement(By.xpath(".//button[contains (@class, \"card-creation\")]"));
                    buttonCreateCard.click();
                });
        Thread.sleep(5000);

    }

    private boolean checkTaskExistInTrello(String taskName) throws InterruptedException {
        final String TRELLO_URL = "https://trello.com/login";
        boolean result = false;
        WebDriver webDriverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        webDriverTrello.get(TRELLO_URL);

        webDriverTrello.findElement(By.id("user")).sendKeys("lisowski.bt@gmail.com");
        webDriverTrello.findElement(By.id("password")).sendKeys("1dobramamaPOKEMON");
        WebElement el = webDriverTrello.findElement(By.id("login"));
        el.submit();

        Thread.sleep(4000);

        webDriverTrello.findElement(By.id("password")).sendKeys("1dobramamaPOKEMON");
        webDriverTrello.findElement(By.id("login-submit")).submit();

        Thread.sleep(4000);

        webDriverTrello.findElements(By.xpath("//a[@class=\"board-tile\"]")).stream()
                .filter(aHref -> aHref.findElements(By.xpath(".//div[@title=\"Kodilla Application\"]")).size()>0)
                .forEach(WebElement::click);

        Thread.sleep(4000);

        result = webDriverTrello.findElements(By.xpath("//span")).stream()
                .anyMatch(theSpan -> theSpan.getText().equals(taskName));

        //webDriverTrello.close();

        return result;
    }

    public void deleteTaskFromCrudApp (String taskName) throws InterruptedException {
        webDriver.navigate().refresh();
        while (!webDriver.findElement(By.xpath("//select[1]")).isDisplayed());

        webDriver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .forEach(theForm -> theForm.findElement(By.xpath(".//button[text()='Delete']")).click());
    }

    @Test
    public void shouldCreateTrelloCard() throws  InterruptedException{
        String taskName = createCrudAppTestTask();
        //sendTestTaskToTrello(taskName);
        //assertTrue(checkTaskExistInTrello(taskName));
        deleteTaskFromCrudApp(taskName);
    }

}
