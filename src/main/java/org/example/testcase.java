package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testcase extends Thread {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
    }

    @Test
    public void testng() throws InterruptedException {
        //LOGIN TEST
        //1.Go to https://magento.softwaretestingboard.com/ and use the provided username
        //password to login to the system. (Locator Strategy: xpath)
        String givenURL = "https://magento.softwaretestingboard.com/";
        driver.get(givenURL);
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals(givenURL, currentURL);
        System.out.println("URL VERIFIED");
        driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
        driver.findElement(By.id("email")).sendKeys("qagroup37@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Abc1234@");
        driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
//(1).Adding Cart
//(1.1)By Selecting Item

        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]/span[2]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"narrow-by-list2\"]/dd/ol/li[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/div/strong/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("option-label-size-143-item-175")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("option-label-color-93-item-49")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div/a")).click();
        Thread.sleep(2000);
        //Verify the product name,price,size,color are similar to the product you selected

        String productname="Pierce Gym Short";
        String productnamechecking=driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[1]/div/strong/a")).getText();
        Assert.assertEquals(productname,productnamechecking);
        System.out.println("Name is same");
        String price="$27.00";
        String checkingprice=driver.findElement(By.className("cart-price")).getText();

        Assert.assertEquals(price,checkingprice);
        System.out.println("price is same");

        String size="32";
        String te=driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[1]/div/dl/dd[1]")).getText();
        Assert.assertEquals(size,te);
        System.out.println("size is same");
        String color="Black";
        String te1=driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[1]/div/dl/dd[2]")).getText();
        Assert.assertEquals(color,te1);
        System.out.println("color is same");
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button")).click();
        Thread.sleep(12000);
        driver.findElement(By.xpath("/html/body/div[1]/header/div/a/img")).click();
        Thread.sleep(2000);
        //1.1.2
        //Using cart button
        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]/div/a/span")).click();
        Thread.sleep(4000);
        //1.1.3
        //change parameter
        driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[2]/td/div/a[2]")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("option-label-size-143-item-178")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("option-label-color-93-item-58")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("product-updatecart-button")).click();
        Thread.sleep(4000);
        String productname1="Pierce Gym Short";
        String productnamechecking1=driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[1]/div/strong/a")).getText();
        Assert.assertEquals(productname1,productnamechecking1);
        System.out.println("Name is same");
        String price1="$27.00";
        String checkingprice1=driver.findElement(By.className("cart-price")).getText();

        Assert.assertEquals(price1,checkingprice1);
        System.out.println("price is same");

        String size1="36";
        String te3=driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[1]/div/dl/dd[1]")).getText();

        Assert.assertEquals(size1,te3);
        System.out.println("size is same");
        String color4="Red";
        String te4=driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[1]/div/dl/dd[2]")).getText();
        Assert.assertEquals(color4,te4);
        System.out.println("color is same");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button")).click();
        Thread.sleep(12000);
        driver.findElement(By.xpath("/html/body/div[1]/header/div/a/img")).click();
        Thread.sleep(2000);
        //1.1.4
        //remove item
        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]/div/a/span")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[2]/td/div/a[3]")).click();

    }
}
