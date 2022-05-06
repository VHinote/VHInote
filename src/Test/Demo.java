package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Demo {
	
	@DataProvider(name= "TestData")
	public Object [] [] data(){
		return new Object[] [] {{30,20,40},{50,10,10}};
	}
	
	@Test(dataProvider = "TestData")
	public void sample(int a, int b, int c) {
		System.out.println(a+b+c);
		
	}
	
	@Test
	@Parameters({"first","secound","Third"})
	public void addtion(int a, int b, String c) {
		System.out.println(a+b);
		System.out.println(c);
	}

}
