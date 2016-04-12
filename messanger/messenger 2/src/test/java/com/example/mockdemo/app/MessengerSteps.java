package com.example.mockdemo.app;

import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.example.mockdemo.messenger.MessageServiceSimpleImpl;

public class MessengerSteps {
private Messenger messenger;

	@Given("a messenger")
	public void messengerSetup(){
		messenger = new Messenger(new MessageServiceSimpleImpl());
	}

	    
		@When("set arguments to $server and $message")
		public void setArguments(String server, String message){
			messenger.setServerM(server);
			messenger.setMessageM(message);
		}
		
	    @Then("result should return $result")
		public void shouldReturn(int result){
			assertEquals(result, messenger.sendMessage());
		}
	    
	    @Then("result should either return $result1 or $result2")
		public void shouldReturnEither(int result1, int result2){
			assertThat(messenger.sendMessage(),either(equalTo(result1)).or(equalTo(result2)));
		}
		 
	    @When("set arguments to $server2")
			public void setArguments2(String server2){
				messenger.setServerM(server2);
			}
			
	    @Then("sending should return $result2")
			public void shouldReturn2(int result2){
				assertEquals(result2, messenger.testConnection());
			}
	    
    
   
}
