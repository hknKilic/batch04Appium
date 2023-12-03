package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.HooksWeb;

public class AmazonPage extends HooksWeb {

    public AmazonPage(AndroidDriver<WebElement> driver){
        this.androidDriver = driver ;
    }

   // Java Script Path
    public String searchTextBoxJS(String key){
        return "document.querySelector(\"#twotabsearchtextbox\").value='"+key+"';";
    }
    public String clickSearchBoxJS(){
        return "document.querySelector(\"#nav-search-submit-button\").click();";
    }

    public void executeElement(String element){
        androidDriver.executeScript(element);
    }

}
