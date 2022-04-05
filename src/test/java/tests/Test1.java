package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Test1 
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriverManager driver=new ChromeDriverManager();

	}

}
