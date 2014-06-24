/*
 * The MIT License
 *
 * Copyright (c) <2012> <Bruno P. Kinoshita>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package jenkins.plugins.testlink.examples;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
//import org.junit.*;
import static org.junit.Assert.*;
import org.testng.Assert;
//import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//import org.testng.annotations.Test;

//import java.util.Date;
//import com.thoughtworks.selenium.*;
//import org.testng.Reporter;
//import org.testng.annotations.*;
import testlink.api.java.client.TestLinkAPIResults;

/**
 * Tests System.currentTimeMillis()
 * 
 * @author Bruno P. Kinoshita - http://www.kinoshita.eti.br
 * @since 0.3
 */
public class TestCurrentTime3
{
	private String resultado = null;
	  private String nota = null;
	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	@Test
	public void testCurrentTime3() 
	{
		Assert.assertNotNull( System.currentTimeMillis() );
		
		Assert.assertTrue( System.currentTimeMillis() > 0 );
		System.out.println("TestCurrentTime3 working");
		System.out.println(id);
		driver = new FirefoxDriver();
	    baseUrl = "http://cu156.cloud.maa.collab.net/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
}
