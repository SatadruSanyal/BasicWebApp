package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutImperial() throws Exception {
        assertThat(queryProcessor.process("Imperial"),
                containsString("university"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutDimSum() throws Exception {
        assertThat(queryProcessor.process("dimsum"),
                containsString("Chinese"));
    }

    @Test
    public void knowsAboutUSA() throws Exception {
        assertThat(queryProcessor.process("america"),
                containsString("country"));
    }

    @Test
    public void knowsAboutCanada() throws Exception {
        assertThat(queryProcessor.process("canada"),
                containsString("north"));
    }

    @Test
    public void canAddNumbers() throws Exception {
        assertThat(queryProcessor.process("what is 2020 plus 30"),
                containsString("2050"));
    }

    @Test
    public void canReturnGreaterNumber() throws Exception {
        assertThat(queryProcessor.process("which of the following numbers is largest: 2020 2030"),
                containsString("2030"));
    }

    @Test
    public void canMultiplyNumbers() throws Exception {
        Integer x = 2020 * 30;
        assertThat(queryProcessor.process("what is 2020 multiplied by 30"),
                containsString(x.toString()));
    }

    @Test
    public void bothSquareAndCube() throws Exception {
        assertThat(queryProcessor.process("which of the following numbers is both a square and a cube: 20950, 971, 2116, 676"),
                containsString("none"));
    }

}
