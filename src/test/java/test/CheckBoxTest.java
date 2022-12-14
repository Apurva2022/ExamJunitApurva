package test;



import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import junit.framework.Assert;
import page.CheckBox;
import util.BrowserFactory;

public class CheckBoxTest extends BrowserFactory
{
	WebDriver driver;
	CheckBox checkBoxPage;
	
	@Before
	public void setUp()
	{
		driver = BrowserFactory.init();
		checkBoxPage = PageFactory.initElements(driver, CheckBox.class);
		driver.get("https://techfios.com/test/103/index.php");
	}
	
	@Test
	public void validateAllCheckBox() throws InterruptedException
	{
		String actualText = checkBoxPage.clickToggleAll();
		System.out.println(actualText);
		Assert.assertEquals("Checkbox element not found", "allbox",actualText);
		Thread.sleep(2000);
		
		//Validate List
		Assert.assertEquals(true, checkBoxPage.validateAllListCheckBox());
		
		
	}
	
	
	
}