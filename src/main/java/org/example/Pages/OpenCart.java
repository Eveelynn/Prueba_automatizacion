package org.example.Pages;

import org.example.util.Page_base;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenCart extends Page_base{

    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/Browser/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void openCartURL(){
        driver.get("http://opencart.abstracta.us/");
        Assert.assertEquals(driver.getCurrentUrl(),"http://opencart.abstracta.us/");
    }


    public void realizarBusquedadelIphone(){
        if(driver.findElement(By.xpath("iPhone")).isDisplayed()){
            System.out.println("Existe text box");
        }else {
            System.out.println("No existe text box");
        }
    }

    public void buscariPhone(){
        driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("iphone");
    }

    public void seleccionarBotonBuscar(){
        driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
    }

    public void seleccionarOpcion(){
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/h4/a")));
            driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/h4/a")).click();
            System.out.println("Botón clickeado");
        }catch(Exception e){
            System.out.println(e);
        }
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[1]/a/img")).click();
    }

    public void agregarProductoAlCarrito(){
        driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
    }

    public void verCarrito(){
        driver.findElement(By.xpath("//*[@id=\"cart\"]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")).click();
    }

    public void validarIphone(){
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[1]/a/img")));
            driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[1]/a/img")).click();
            System.out.println("Aparece iPhone");
        }catch(Exception e){
            System.out.println(e);
        }

        if(driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a")).isDisplayed()){
            System.out.println("Existe iPhone en el carrito de compras");
        }else {
            System.out.println("No existe iPhone en el carrito de compras");
        }
    }

    public void removerIphone(){
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[2]")).click();
    }

    public void validarIphoneNoSeEncuentraEnCarrito(){
        if(driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).isDisplayed()){
            System.out.println("No existe iPhone en el carrito de compras");
        }else {
            System.out.println("Si existe iPhone en el carrito de compras");
        }
    }

    public void cerrarNavegador(){
        driver.quit();
    }

}
