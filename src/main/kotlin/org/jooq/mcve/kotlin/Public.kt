/*
 * This file is generated by jOOQ.
 */
package org.jooq.mcve.kotlin


import kotlin.collections.List

import org.jooq.Catalog
import org.jooq.Domain
import org.jooq.Table
import org.jooq.impl.SchemaImpl
import org.jooq.mcve.kotlin.domains.DOMAINTS
import org.jooq.mcve.kotlin.tables.FlywaySchemaHistory
import org.jooq.mcve.kotlin.tables.Test


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Public : SchemaImpl("PUBLIC", DefaultCatalog.DEFAULT_CATALOG) {
    companion object {

        /**
         * The reference instance of <code>PUBLIC</code>
         */
        val PUBLIC = Public()
    }

    /**
     * The table <code>PUBLIC.flyway_schema_history</code>.
     */
    val FLYWAY_SCHEMA_HISTORY get() = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY

    /**
     * The table <code>PUBLIC.TEST</code>.
     */
    val TEST get() = Test.TEST

    override fun getCatalog(): Catalog = DefaultCatalog.DEFAULT_CATALOG

    override fun getDomains(): List<Domain<*>> = listOf(
        DOMAINTS
    )

    override fun getTables(): List<Table<*>> = listOf(
        FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY,
        Test.TEST
    )
}
