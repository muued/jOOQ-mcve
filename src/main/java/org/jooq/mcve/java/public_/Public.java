/*
 * This file is generated by jOOQ.
 */
package org.jooq.mcve.java.public_;


import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;
import org.jooq.mcve.java.DefaultCatalog;
import org.jooq.mcve.java.public_.tables.FlywaySchemaHistory;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>PUBLIC</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>PUBLIC.flyway_schema_history</code>.
     */
    public final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * No further instances allowed
     */
    private Public() {
        super("PUBLIC", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY);
    }
}
