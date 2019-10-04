package org.etsy.stepdefination;

import org.etsy.objectrep.Pojo;
import org.etsy.resoueces.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logic extends Base{
	
	@Given("search the browser and goto etsy website and search for anniversary gifts")
	public void search_the_browser_and_goto_etsy_website_and_search_for_anniversary_gifts() {
		launch("https://www.etsy.com/");
		Pojo p=new Pojo();
		send(p.getSearchbox(),"anniversary gifts");
		clk(p.getSearch());
	    
	}

	@When("click the wooden watch and add it to basket")
	public void click_the_wooden_watch_and_add_it_to_basket() {
		Pojo p=new Pojo();
		clk(p.getAdd());
	    
	
	   
	}

	@Then("click and add to basket")
	public void click_and_add_to_basket() {
		Pojo p=new Pojo();
		clk(p.getAdd());
	   
	}



}
