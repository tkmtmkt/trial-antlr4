/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.github.tkmtmkt;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testGetParser() {
        App sut = new App();

        ExprParser result = sut.getParser("3+2*4");
        assertNotNull(result);
    }
}
