package lt.neworld.roboelectric_android_unit_test_support;

import org.junit.runners.model.InitializationError;
import org.robolectric.RobolectricTestRunner;

import java.util.Properties;

/**
 * @author Andrius Semionovas
 * @since 2015-03-30
 */
public class MyTestRunner extends RobolectricTestRunner {
    /**
     * Creates a runner to run {@code testClass}. Looks in your working directory for your AndroidManifest.xml file
     * and res directory by default. Use the {@link Config} annotation to configure.
     *
     * @param testClass the test class to be run
     * @throws org.junit.runners.model.InitializationError if junit says so
     */
    public MyTestRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
    }

    @Override
    protected Properties getConfigProperties() {
        Properties properties = new Properties();
        properties.setProperty("manifest", "app/src/main/AndroidManifest.xml");
        properties.setProperty("emulateSdk", "18");

        return properties;
    }
}
