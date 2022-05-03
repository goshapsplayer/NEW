import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Autoria {

    //1. Описать UI элементы

    By searchButton= By.xpath("//button[@class='button']");
    By brand= By.xpath("//input[@id='brandTooltipBrandAutocompleteInput-brand']");
    By model = By.xpath("//input[@id='brandTooltipBrandAutocompleteInput-model']");
    By region = By.xpath("//input[@id='brandTooltipBrandAutocompleteInput-region']");
    By price = By.xpath("//input[@id='priceFrom']");
    By price2 = By.xpath("//input[@id='priceTo']");


    //2. Методы описывающие действия

    //3. Написать тесты
    @Test
    public void openSite1 () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        driver.get("https://auto.ria.com/uk/");

        driver.findElement(brand).sendKeys("Audi");
        driver.findElement(By.xpath("//li[@data-value='6']")).click();
        driver.findElement(model).sendKeys("Q8");
        driver.findElement(By.xpath("//li[@data-value='61203']")).click();
        //driver.findElement(region).sendKeys("Одеса");
        //driver.findElement(By.xpath("//a[text()='Одеса']")).click();
        driver.findElement(price).sendKeys("100000");
        driver.findElement(By.xpath("//input[@id='priceFrom']")).click();
        driver.findElement(price2).sendKeys("200000");
        driver.findElement(By.xpath("//input[@id='priceTo']")).click();
        driver.findElement(searchButton).click();
        Thread.sleep(1000);
        Assert.assertEquals("https://auto.ria.com/uk/search/?categories.main.id=1&price.currency=1&price.USD.gte=100000&price.USD.lte=200000&indexName=auto,order_auto,newauto_search&brand.id[0]=6&model.id[0]=61203&size=20",driver.getCurrentUrl());


        //1. открыть страницу
        // driver.get("https://auto.ria.com/uk/");
        // driver.findElement(By.xpath(searchButton)).click();

        //driver.close();

        //2. открыть страницу navigate
        //driver.navigate().to("https://auto.ria.com/uk/");
        //driver.navigate().to("https://odessa.ithillel.ua/");
        //driver.navigate().forward();
    }
    @Test
    public void openSite2 () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        driver.get("https://auto.ria.com/uk/");

        driver.findElement(brand).sendKeys("Audi");
        driver.findElement(By.xpath("//li[@data-value='6']")).click();
        driver.findElement(model).sendKeys("Q8");
        driver.findElement(By.xpath("//li[@data-value='61203']")).click();
        //driver.findElement(region).sendKeys("Одеса");
        //driver.findElement(By.xpath("//a[text()='Одеса']")).click();
        driver.findElement(searchButton).click();
        Thread.sleep(1000);
        Assert.assertEquals("https://auto.ria.com/uk/legkovie/audi/rs-q8/",driver.getCurrentUrl());
        driver.close();


        //1. открыть страницу
        // driver.get("https://auto.ria.com/uk/");
        // driver.findElement(By.xpath(searchButton)).click();

        //driver.close();

        //2. открыть страницу navigate
        //driver.navigate().to("https://auto.ria.com/uk/");
        //driver.navigate().to("https://odessa.ithillel.ua/");
        //driver.navigate().forward();
    }
    @Test
    public void openSite3 () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        driver.get("https://auto.ria.com/uk/");

        driver.findElement(brand).sendKeys("Audi");
        driver.findElement(By.xpath("//li[@data-value='6']")).click();
        driver.findElement(model).sendKeys("Q8");
        driver.findElement(By.xpath("//li[@data-value='61203']")).click();
        //driver.findElement(region).sendKeys("Одеса");
        //driver.findElement(By.xpath("//a[text()='Одеса']")).click();
        driver.findElement(searchButton).click();
        Thread.sleep(1000);
        Assert.assertEquals("https://auto.ria.com/uk/legkovie/audi/rs-q8/",driver.getCurrentUrl());
        driver.close();

        //1. открыть страницу
        // driver.get("https://auto.ria.com/uk/");
        // driver.findElement(By.xpath(searchButton)).click();

        //driver.close();

        //2. открыть страницу navigate
        //driver.navigate().to("https://auto.ria.com/uk/");
        //driver.navigate().to("https://odessa.ithillel.ua/");
        //driver.navigate().forward();
    }

}

