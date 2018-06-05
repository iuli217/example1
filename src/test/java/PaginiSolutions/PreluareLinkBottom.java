package PaginiSolutions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PreluareLinkBottom {
	
	int cont=1;
	int cont1=1;
	
	public WebDriver preluareLinkuriBottom(WebDriver driver) {
		List<Object> lista = new ArrayList<Object>();

			do {int xx = driver.findElements(By.xpath("//section[@class='sitemap light fsize-S container']/div[1]/div["+cont+"]/ul/li")).size();
				
				while(cont1 <= xx) {
					lista.add(driver.findElement(By.xpath("//section[@class='sitemap light fsize-S container']/div[1]/div["+cont+"]/ul/li["+cont1+"]/a")).getAttribute("href"));	
					cont1+=1;
				}
			cont+=1;
			}while(cont <= 4);
			
		for (Object object : lista) {
			driver.navigate().to(object.toString());
			driver.navigate().back();
		}
		
		return driver;
		
	}

}
