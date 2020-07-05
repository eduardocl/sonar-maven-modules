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
        CoreController core = new CoreController();
        core.coreFunction1();
        core.coreFunction2();
        core.coreFunction3();
        core.coreFunction5();
        assertTrue( true );
    }
}
