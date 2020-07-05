package br.com.ecl.projects;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        ApiFactory apiFactory = new ApiFactory();
        apiFactory.callUrl();
        apiFactory.handleRequest();

        GUIController controller = new GUIController();
        controller.function_1();
        controller.function_2();
        assertTrue( true );
    }
}
