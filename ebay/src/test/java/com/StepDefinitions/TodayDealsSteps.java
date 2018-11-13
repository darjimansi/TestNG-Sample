package com.StepDefinitions;

import com.PagesObject.TodayDealsPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TodayDealsSteps extends TodayDealsPage {

		@Given ("^I want to open a \"(.*)\" browser$")
		public static void want_open_browser (String browser) {
			
			openBrowser(browser);
		}
		
		@Then ("^I want to launch the application$")
		public static void want_launch_application ( ) {
			UrlNavigate();
		}
		
		@And ("^I want to select an item \"(.*)\" from \"(.*)\"$")
		public static void want_select_item (String value,String xpath) {
			enterText(xpath, value);
		}
		
		@Then ("^I want to click Search button \"(.*)\"$") 
		public static void want_click_search (String xpath) {
			clickButton(xpath);
		}
		
		@And ("^I want to close the browser$")
		public static void close_browser() {
			closeBrowser();
		}
	
}
