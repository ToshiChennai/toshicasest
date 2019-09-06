package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case1 {
	WebDriver driver;
	@Given("user opens the TestMeApp")
	public void user_opens_the_TestMeApp() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Toshiba\\Drivers\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://10.232.237.143:443/TestMeApp");
	   
	}

	@And("click on sign up")
	public void click_on_sign_up()  {
	    driver.findElement(By.xpath("//*[@id=\'header\']/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	    
	}

	@When("user enters username {string} in the username field")
	public void user_enters_username_in_the_username_field(String uname) {
	   //driver.findElement(By.xpath("//*[@id=\'userName\']")).click();
	   driver.findElement(By.xpath("//*[@id=\'userName\']")).sendKeys(uname);
	   
	}

	@And("user enters first name {string}")
	public void user_enters_first_name(String fname)  {
		//driver.findElement(By.xpath("//*[@id=\'firstName\']")).click();
		driver.findElement(By.xpath("//*[@id=\'firstName\']")).sendKeys(fname);
		
	}

	@And("user enters last name {string}")
	public void user_enters_last_name(String lname)  {
		//driver.findElement(By.xpath("//*[@id=\'lastName\']")).click();
		driver.findElement(By.xpath("//*[@id=\'lastName\']")).sendKeys(lname);
	
	}

	@And("user enters password {string}")
	public void user_enters_password(String passwd)  {
		//driver.findElement(By.xpath("//*[@id=\'password\']")).click();
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys(passwd);
	
	    
	}

	@And("user enters confirm password {string}")
	public void user_enters_confirm_password(String conpass) {
		//driver.findElement(By.xpath("//*[@id=\'pass_confirmation\']")).click();
		driver.findElement(By.xpath("//*[@id=\'pass_confirmation\']")).sendKeys(conpass);
	
	}

	@When("user selects the gender")
	public void user_selects_the_gender() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[2]")).click();
	}

	@And("user enters E-Mail {string}")
	public void user_enters_E_Mail(String email){
		driver.findElement(By.xpath("//*[@id=\'emailAddress\']")).sendKeys(email);
	
	}

	@And("user enters Mobile Number {string}")
	public void user_enters_Mobile_Number(String mno)  {
		//driver.findElement(By.xpath("//*[@id=\'mobileNumber\']")).click();
		driver.findElement(By.xpath("//*[@id=\'mobileNumber\']")).sendKeys(mno);
		
	}

	
	@When("user enters dob {string}")
	public void user_enters_dob(String date) {
		driver.findElement(By.xpath("//*[@id=\'dob\']")).click();
		driver.findElement(By.xpath("//*[@id=\'dob\']")).sendKeys(date);  
	}

	@And("user enters Address {string}")
	public void user_enters_Address(String add) {
		driver.findElement(By.xpath("//*[@id=\'address\']")).sendKeys(add);
	}

	@When("user selects the Security Question")
	public void user_selects_the_Security_Question() {
		WebElement security=driver.findElement(By.xpath("//*[@id='securityQuestion']"));
		Select question= new Select(security);
		question.selectByIndex(0);
	}

	@And("user enters Answer {string}")
	public void user_enters_Answer(String ans) {
		driver.findElement(By.xpath("//*[@id=\'answer\']")).sendKeys(ans);
	}

	@Then("user clicks register button")
	public void user_clicks_register_button() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	}
}
