package org.fazlan.jbehave.exmaple.stories;

import org.fazlan.jbehave.exmaple.steps.AddTwoNumbersSteps;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import static org.jbehave.core.reporters.Format.CONSOLE;
import static org.jbehave.core.reporters.Format.TXT;

public class CalculatorStories extends JUnitStory {

    @Override
    public Configuration configuration() {
        return super.configuration()
                .useStoryReporterBuilder(
                        new StoryReporterBuilder()
                                .withDefaultFormats()
                                .withFormats(CONSOLE, TXT));
    }

    // Here we specify the steps classes
    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new AddTwoNumbersSteps());
    }
}