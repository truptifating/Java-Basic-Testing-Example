package com.test;

//import org.openqa.selenium.By;

public class XpathLearning {

	public static void main(String[] args) {
		// CReating the xpth for Free CRM
	//	public static final By UserName= By.xpath("//*[@id=\"email\"]");
		
		
		//url =HYR tutorials
		
//		xpath of text box of email-
		//label[text()='Email']/following-sibling::input[@type='text'] Or
		//label[text()='Email']/following-sibling::input[1]
		
		
		//label[text()='Email']/following-sibling::input[1]/parent::div or
		//label[text()='Email']/parent::div                             or
		//div[@class='container']/child::input[@type='text']
		
//		xpath for checking the checkbox-
		//td[text()='Maria Anders']/preceding-sibling::td/child::input
		
//		xpath for checking the button
		//div[@class='container']/descendant::button[@type='submit']
		
		
		//div[@class='buttons']/ancestor::div
		//div[@class='buttons']/ancestor-or-self::div
		
		///label[text()='Password']/following::input[1]
		//span[text()='Redmi']/parent::a/descendant::label/child::input[@type='checkbox']
		
		//a[(@title='Cart')and(@class='_1krdK5 _3jeYYh')]
		//div[@class='suthUA']/child::select[@class='Gn+jFg']/child::option[@value='10000']
		//div[@class='suthUA']/descendant::option[@value='10000']
		
// Note- ancestor-or-self  OR descendant-or-self will include the current div tag
		
		// Differance between preceding-sibling and preceding is when we say preceding-sibling means only sibling before that element
		// and preceding means not only sibling but all the element before that element
	}
//tagname[@locator='value']/following-sibling::tagname[@locator='value']
}
