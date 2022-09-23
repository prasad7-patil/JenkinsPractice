package org.practice;

import org.testng.annotations.Test;

public class Tc_003_practiceTest {
	@Test
	public void testcase1() {
		String browser = System.getProperty("browser");
		String url = System.getProperty("URL");
		
		System.out.println("BROWSER Name ===>"+browser);
		System.out.println("BROWSER Name ===>"+url);
	}
}


