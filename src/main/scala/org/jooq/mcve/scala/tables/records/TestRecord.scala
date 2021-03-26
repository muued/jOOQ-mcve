/*
 * This file is generated by jOOQ.
 */
package org.jooq.mcve.scala.tables.records


import java.time.OffsetDateTime

import org.jooq.Field
import org.jooq.Record2
import org.jooq.Row2
import org.jooq.impl.TableRecordImpl
import org.jooq.mcve.scala.tables.Test


/**
 * This class is generated by jOOQ.
 */
class TestRecord extends TableRecordImpl[TestRecord](Test.TEST) with Record2[OffsetDateTime, OffsetDateTime] {

  /**
   * Setter for <code>PUBLIC.TEST.DOMAINTSVALUE</code>.
   */
  def setDomaintsvalue(value: OffsetDateTime): Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>PUBLIC.TEST.DOMAINTSVALUE</code>.
   */
  def getDomaintsvalue: OffsetDateTime = get(0).asInstanceOf[OffsetDateTime]

  /**
   * Setter for <code>PUBLIC.TEST.LOCALTSVALUE</code>.
   */
  def setLocaltsvalue(value: OffsetDateTime): Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>PUBLIC.TEST.LOCALTSVALUE</code>.
   */
  def getLocaltsvalue: OffsetDateTime = get(1).asInstanceOf[OffsetDateTime]

  // -------------------------------------------------------------------------
  // Record2 type implementation
  // -------------------------------------------------------------------------

  override def fieldsRow: Row2[OffsetDateTime, OffsetDateTime] = super.fieldsRow.asInstanceOf[ Row2[OffsetDateTime, OffsetDateTime] ]

  override def valuesRow: Row2[OffsetDateTime, OffsetDateTime] = super.valuesRow.asInstanceOf[ Row2[OffsetDateTime, OffsetDateTime] ]
  override def field1: Field[OffsetDateTime] = Test.TEST.DOMAINTSVALUE
  override def field2: Field[OffsetDateTime] = Test.TEST.LOCALTSVALUE
  override def component1: OffsetDateTime = getDomaintsvalue
  override def component2: OffsetDateTime = getLocaltsvalue
  override def value1: OffsetDateTime = getDomaintsvalue
  override def value2: OffsetDateTime = getLocaltsvalue

  override def value1(value: OffsetDateTime): TestRecord = {
    setDomaintsvalue(value)
    this
  }

  override def value2(value: OffsetDateTime): TestRecord = {
    setLocaltsvalue(value)
    this
  }

  override def values(value1 : OffsetDateTime, value2 : OffsetDateTime): TestRecord = {
    this.value1(value1)
    this.value2(value2)
    this
  }

  /**
   * Create a detached, initialised TestRecord
   */
  def this(domaintsvalue : OffsetDateTime, localtsvalue : OffsetDateTime) = {
    this()

    this.setDomaintsvalue(domaintsvalue)
    this.setLocaltsvalue(localtsvalue)
  }
}
