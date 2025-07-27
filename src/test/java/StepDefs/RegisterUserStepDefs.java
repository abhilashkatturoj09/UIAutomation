package StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegisterUserStepDefs {

    @Given("I open {string}")
    public void i_open(String string) {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("in I open {string}");
    }

    @When("Click on {string}")
    public void click_on(String string) {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("Click on {string}");
    }

    @When("Set Input {string} with value {string}")
    public void set_input_with_value(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("Set Input {string} with value {string}");
    }

    @When("Click on Button {string}")
    public void click_on_button(String string) {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("Click on Button {string}");
    }
}
