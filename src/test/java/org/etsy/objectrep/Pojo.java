package org.etsy.objectrep;

import org.etsy.resoueces.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends Base {
	public Pojo() {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="(//input[@id='global-enhancements-search-query'])[1]")
	private WebElement searchbox;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement search;
	@FindBy(xpath="(//h2[@class='text-gray text-truncate mb-xs-0 text-body'])[12]")
	private WebElement product;
	@FindBy(xpath="((//button[@type='submit'])[2]")
	private WebElement add;
	public WebElement getSearchbox() {
		return searchbox;

}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getProduct() {
		return product;
	}
	public WebElement getAdd() {
		return add;
	}
}