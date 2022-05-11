package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_getWindowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println(driver.getWindowHandles());

        //[CDwindow-1FE630D45B3F565FAB6DE8E1946459E8] benzersiz olarak acilan window'a ait hashcode'unu verir
        //[CDwindow-59580DD84721FD7AEEF7AC193216ED8C]

    }
}
