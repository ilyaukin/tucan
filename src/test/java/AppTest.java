/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import tucan.compiler.Compiler;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        Compiler classUnderTest = new Compiler();
        assertNotNull("app should have a greeting", classUnderTest.getHelpMessage());
    }
}
