package purchaseP;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {

	
	@Test(priority = 1)
	public void ClickingMenOption() {
		
		driver.findElement(By.xpath("//div[@class='nav-link dropdown-toggle pointer' and contains(text(),'Men')]")).click();
		// selecting Polo option from menu
		driver.findElement(By.xpath("//a[contains(text(),'Polos') and @class='toggle-menu pointer']")).click();
	}
	
	@Test(priority = 2)
	public void selectingFilters() throws InterruptedException {
		
		// Products:Polos
		driver.findElement(By.xpath("(//div[@class='customcheckbox']//input[@type='checkbox'])[2]")).click();
		// Size:Large
		driver.findElement(By.xpath("(//div[@class='customcheckbox']//input[@type='checkbox'])[19]")).click();
		//clicking apply button
		driver.findElement(By.xpath("//*[@id=\"listing-wrapper\"]/div[1]/div[3]/div/div[2]/div[1]/div/div[2]/div[1]/button")).click();
        		
	}
	
	
}
