package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Helper {

	
	public static void click(WebElement element) {
		
		element.click();
		
		
	}
	
	public static Properties readPropertyFile(String path) throws IOException {
		
		FileInputStream f = new FileInputStream(new File(path));
		Properties prop = new Properties();
		prop.load(f);
		
		return prop;
	}
}
