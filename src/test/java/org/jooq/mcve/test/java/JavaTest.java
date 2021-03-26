package org.jooq.mcve.test.java;

import org.jooq.impl.DSL;
import org.jooq.mcve.java.public_.enums.Enumdomain;
import org.junit.Test;

import static org.jooq.mcve.java.mcve.Tables.TEST;

public class JavaTest extends AbstractTest {

    @Test
    public void mcveTest() {
        ctx.select(DSL.case_(TEST.PROBLEMCOLUMN).when(Enumdomain.x, Enumdomain.y).else_(Enumdomain.x))
           .from(TEST)
           .fetch();
    }
}
