package testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UrbanLadderTesting {
	WebDriver d;
	@BeforeTest
	 public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Downloads\\chromedriver.exe");
		 d=new ChromeDriver();
		d.navigate().to("https://www.urbanladder.com/");
		//d.findElement(By.linkText("Log-in")).click();
		
		d.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test(priority = 0)
	 public void login() throws InterruptedException {
	    d.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/section[3]/ul/li[2]/span")).click();
		Thread.sleep(2000);
		d.findElement(By.partialLinkText("Log In")).click();
		Thread.sleep(10000);
		d.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/div[2]/div[3]/form/div/input")).sendKeys( "harimurali007@gmail.com");
		d.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/div[2]/div[3]/form/div/div/div/input")). sendKeys("harimurali007");
		d.findElement(By.id("ul_site_login")).click();
	}
	@Test(priority = 1)
	public void bed() {
		d.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/nav/div/ul/li[3]/span")).click();
		String s = d.findElement(By.partialLinkText("Beds")).getText();
		/*System.out.println(s);
		Assert.assertEquals(s,"Beds");*/
		
	}
	@Test(priority = 2)
	public void mattresses() {
		d.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/nav/div/ul/li[3]/span")).click();
		String s = d.findElement(By.partialLinkText("Mattresses")).getText();
		/*System.out.println(s);
		Assert.assertEquals(s,"Mattresses");*/
	}
	@Test(priority = 3)
	public void storage() {
		d.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/nav/div/ul/li[3]/span")).click();
		String s = d.findElement(By.partialLinkText("Storage & Accessories")).getText();
		System.out.println(s);
		Assert.assertEquals(s,"Storage & Accessories");
	}
	@Test(priority = 4)
	public void kids() {
		d.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/nav/div/ul/li[3]/span")).click();
		String s = d.findElement(By.partialLinkText("Kids Bedroom")).getText();
		System.out.println(s);
		Assert.assertEquals(s,"Kids Bedroom");
	}
	/*@Test(priority = 5)
	public void Allmatt() throws InterruptedException {
		d.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/nav/div/ul/li[3]/span")).click();
		d.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/nav/div/ul/li[3]/div/div/ul/li[2]/div/a")).click();
		//Assert.assertEquals("Beds",s);
		//System.out.println(s);
		}*/
	/*@Test(priority = 6)
	public void Storageaccess() throws InterruptedException {
		d.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/nav/div/ul/li[3]/span")).click();
		d.findElement(By.partialLinkText("Storage & Accessories")).click();
		//Assert.assertEquals("Beds",s);
		//System.out.println(s);
		}*/
	@Test(priority = 5)
	public void customer() throws InterruptedException 
	{
		d.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/nav/div/ul/li[3]/span")).click();
		d.findElement(By.partialLinkText("Double Beds")).click();
		String s = d.findElement(By.xpath("/html/body/div[2]/div[4]/div[4]/div[1]")).getText();
		Assert.assertEquals("Customer Stories", s);
		System.out.println(s);
	}
	@Test(priority = 6)
	public void browsepopular() {
		String s = d.findElement(By.xpath("/html/body/div[2]/div[4]/div[5]/div[1]")).getText();
		Assert.assertEquals("Browse Popular Categories", s);
		System.out.println(s);
	}
	@Test(priority = 7)
    public void doublebeds() throws InterruptedException {
		
		d.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[1]/div[1]")).click();
		d.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[1]/div[2]/div/div/ul/li[2]/div[1]/label/input")).click();
		/*JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0,0)");*/
		//d.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[3]")).click();
		//Thread.sleep(1000);
		//d.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[3]/div[2]/div/div/div[1]/ul/li[1]/input")).click();
		//d.navigate().to("https://www.urbanladder.com/"); 
		//Thread.sleep(1000);
		
		//System.out.println(s);
		//Assert.assertEquals(s,"Double Beds");
	}
	/*@Test(priority = 8)
	public void size() {
		d.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[5]/div[1]")).click();
		d.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[5]/div[2]/div/div/div/ul/li[1]/input")).click();
		
	}*/
		
	

}