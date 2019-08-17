package br.com.bcp.tdd.application.bdd;

import java.util.List;
import java.util.Locale;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.failures.FailingUponPendingStep;
import org.jbehave.core.i18n.LocalizedKeywords;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.parsers.RegexStoryParser;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

public class AccessControlJbehave extends JUnitStory {
	
	// Here we specify the configuration, starting from default MostUsefulConfiguration, 
	// and changing only what is needed
	@Override
    public Configuration configuration() {
        LocalizedKeywords keywords = new LocalizedKeywords(new Locale("en"));
		return new MostUsefulConfiguration()
            // where to find the stories
            .useStoryLoader(new LoadFromClasspath(this.getClass()))
            
            //.useStoryParser(storyParser)
            .usePendingStepStrategy(new FailingUponPendingStep())
            .useKeywords(keywords)
            .useStoryParser(new RegexStoryParser(keywords))
            
            // CONSOLE and TXT reporting
            .useStoryReporterBuilder(new StoryReporterBuilder()
            							.withDefaultFormats()
            							.withFormats(Format.CONSOLE, Format.TXT)
            							.withKeywords(keywords)
            						);
    }
 
    // Here we specify the steps classes
    @Override
    public List<CandidateSteps> candidateSteps() {       
        // varargs, can have more that one steps classes
        return new InstanceStepsFactory(configuration(), new AccessControlSteps()).createCandidateSteps();
    }

}
