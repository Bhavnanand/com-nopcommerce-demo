package com.nopcommerce.demo.testbase;

import com.nopcommerce.demo.propertyreader.PropertyReader;
import com.nopcommerce.demo.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser= PropertyReader.getInstance().getProperty("browser");
    static String baseUrl= PropertyReader.getInstance().getProperty("baseUrl");

    @BeforeMethod
    public void setUP(){
       selectBrowser(browser);
    }
    @AfterMethod
    public void teardown(){
        closeBrowser();

    }
}
