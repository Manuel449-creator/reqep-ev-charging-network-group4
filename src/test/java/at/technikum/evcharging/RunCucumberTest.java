package at.technikum.evcharging;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

/**
 * Runs all feature files (one per Epic) in src/test/resources/at/technikum/evcharging/features.
 *
 * <p>{@code failIfNoTests = false} keeps the build green while the feature files
 * do not contain Scenarios yet.</p>
 */
@Suite(failIfNoTests = false)
@IncludeEngines("cucumber")
@SelectPackages("at.technikum.evcharging.features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "at.technikum.evcharging.steps")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
public class RunCucumberTest {
}
