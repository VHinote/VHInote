package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen {
public static void takeScreenshot(WebDriver driver, String name) throws IOException {
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\vrush\\OneDrive\\Documents\\Custom Office Templates\\"+name+".jpg");
		
		FileHandler.copy(source, destination);

	}

}
