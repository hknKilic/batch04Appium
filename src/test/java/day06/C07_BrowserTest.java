package day06;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import page.AmazonPage;
import utils.ConfigReader;
import utils.HooksWeb;
import utils.ReusableMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class C07_BrowserTest extends HooksWeb{


     AmazonPage amazonPage = new AmazonPage(androidDriver) ;

    @Test
    public void test01() {
        androidDriver.get("https://www.amazon.com");
    }

    @Test
    public void searchTextBox(){
        androidDriver.get("https://www.amazon.com");
        amazonPage.executeElement(amazonPage.searchTextBoxJS("mobile phone"));
        //amazonPage.executeElement(amazonPage.searchTextBoxJS("Mobile Phone"));
        amazonPage.executeElement(amazonPage.clickSearchBoxJS());
    }
}
