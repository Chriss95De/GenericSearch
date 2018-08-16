package de.oster.generic.test.parser;

import de.oster.generic.StaticConfiguration;
import de.oster.generic.search.parser.StatementParser;
import org.junit.Before;
import org.junit.Test;

public class ParserTest {

    @Before
    public void before(){
        new StaticConfiguration();
    }

    @Test
    public void parseTest(){

        new StatementParser().parse("wasdasd.like(blub, wasd, 1234)");

    }

}
