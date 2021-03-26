package org.jooq.mcve.test.java;

import org.junit.Test;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import static org.jooq.mcve.java.Tables.TEST;

public class JavaTest extends AbstractTest {

    @Test
    public void mcveTest() {
        final OffsetDateTime instant = OffsetDateTime.of(2021, 1, 1, 1, 1, 1, 1, ZoneOffset.UTC);

        ctx.insertInto(TEST)
           .columns(TEST.DOMAINTSVALUE, TEST.LOCALTSVALUE)
           .values(instant, instant)
           .execute();

        ctx.update(TEST)
           .set(TEST.LOCALTSVALUE, instant.plus(Duration.ofHours(2)))
           .where(TEST.DOMAINTSVALUE.eq(instant))
           .execute();
    }
}
