package com.example.webguidemo;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.junit.Assert.*;

public class TelemanSteps {
	
	private final Pages pages;

	public TelemanSteps(Pages pages) {
		this.pages = pages;
	}
	
	@Given("user is on Home page")
    public void userIsOnHomePage(){        
        pages.home().open();        
    }
 
    @When("user opens selected drama")
    public void clicOnSelectedDrama(){        
        pages.home().searchDesAndOpen();
    }
 
    @Then("Drama page is shown")
    public void dramaPageIsShown(){
       assertEquals("Descendants of the Sun - 태양의 후예 - Watch Full Episodes Free - Korea - TV Shows - Viki", pages.drama().getTitle());
    }	
  
    //////////////////
    @When("user opens explore drama")
    public void clickexplore(){        
        pages.home().clickexploredramas();
    }
 
    @Then("drama explore page is shown")
    public void dramaexplore(){
       assertEquals("Explore thousands of shows and movies from around the world.", pages.home().textExploreDrama());
    }
    
    @Given("user is on SingUp page")
    public void userIsOnSingUpPage(){        
        pages.singup().open();        
    }
 
    @When("user filled incorrectly form")
    public void fillIncorrectlyForm(){        
        pages.singup().fillIncorrectlyForm();
    }
 
    @Then("validation information is shown")
    public void validationOccured(){
       String validationMessage = pages.singup().getValidationMessage();
       assertTrue(validationMessage.contains("This email is invalid"));
    }
 
    @Then("sing in button is blocked")
    public void blockedButton(){
    	System.out.print("czy bedzie true?  : "+ pages.singup().clickButton());
     assertTrue(pages.singup().clickButton());
    }
    
    //////////////
    
//    @Given("user is on ProjectFinder page")
//    public void openProjectFinderPage(){        
//      
//    }
// 
//    @When("user select filters to find drama to translate")
//    public void selectFilters(){        
//       pages.pf().selectFilter();
//    }
// 
//    @Then("available drama to translate are shown")
//    public void dramaToTranslate(){
//       assertEquals("Korea", pages.pf().aviableDramaToTranslate());
//    }
//    
//    @When("user select drama to translate")
//    public void chooseDrama(){        
//      pages.pf().openDrama();
//    }
// 
//    @Then("you need to log in is shown")
//    public void seeSelectedDrama(){
//    	assertEquals("login", pages.pf().needToLogin());
//    }

}
