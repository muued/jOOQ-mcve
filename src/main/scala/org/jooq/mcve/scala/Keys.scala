/*
 * This file is generated by jOOQ.
 */
package org.jooq.mcve.scala


import org.jooq.TableField
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.mcve.scala.tables.FlywaySchemaHistory
import org.jooq.mcve.scala.tables.records.FlywaySchemaHistoryRecord


/**
 * A class modelling foreign key relationships and constraints of tables in 
 * PUBLIC.
 */
object Keys {

  // -------------------------------------------------------------------------
  // UNIQUE and PRIMARY KEY definitions
  // -------------------------------------------------------------------------

  val FLYWAY_SCHEMA_HISTORY_PK: UniqueKey[FlywaySchemaHistoryRecord] = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, DSL.name("flyway_schema_history_pk"), Array(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK).asInstanceOf[Array[TableField[FlywaySchemaHistoryRecord, _] ] ], true)
}
