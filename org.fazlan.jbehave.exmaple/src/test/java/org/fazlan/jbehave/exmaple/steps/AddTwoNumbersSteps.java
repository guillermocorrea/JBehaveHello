package org.fazlan.jbehave.exmaple.steps;

import org.fazlan.jbehave.exmaple.Calculator;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


public class AddTwoNumbersSteps {
    private Calculator calculator;

    @Given("a calculator")
    public void givenACalculator() {
        calculator = new Calculator();
    }

    @When("I add <number1> and <number2>")
    public void whenIAddNumber1AndNumber2(@Named("number1")int number1, @Named("number2")int number2) {
        calculator.add(number1, number2);
    }

    @Then("the outcome should <result>")
    public void thenTheOutcomeShould(@Named("result")int result) {
        assert calculator.getResult() == result;
    }
}
