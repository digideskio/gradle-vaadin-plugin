package fi.jasoft.plugin.integration

import org.junit.Test

import static org.testng.Assert.assertTrue

/**
 * Created by john on 1/6/15.
 */
class PluginRestrictionsTest extends IntegrationTest {

    @Test void 'No Vaadin 6 support'() {
        buildFile << """
            vaadin {
                version '6.8.0'
            }
        """.stripMargin()

        assertTrue runFailureExpected().contains('Plugin no longer supports Vaadin 6')
    }
}
