/*
 * This file is generated by jOOQ.
 */
package org.jooq.mcve.java.tables.records;


import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;
import org.jooq.mcve.java.tables.Test;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestRecord extends TableRecordImpl<TestRecord> implements Record2<OffsetDateTime, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>PUBLIC.TEST.DOMAINTSVALUE</code>.
     */
    public void setDomaintsvalue(OffsetDateTime value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.TEST.DOMAINTSVALUE</code>.
     */
    public OffsetDateTime getDomaintsvalue() {
        return (OffsetDateTime) get(0);
    }

    /**
     * Setter for <code>PUBLIC.TEST.LOCALTSVALUE</code>.
     */
    public void setLocaltsvalue(OffsetDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.TEST.LOCALTSVALUE</code>.
     */
    public OffsetDateTime getLocaltsvalue() {
        return (OffsetDateTime) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<OffsetDateTime, OffsetDateTime> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<OffsetDateTime> field1() {
        return Test.TEST.DOMAINTSVALUE;
    }

    @Override
    public Field<OffsetDateTime> field2() {
        return Test.TEST.LOCALTSVALUE;
    }

    @Override
    public OffsetDateTime component1() {
        return getDomaintsvalue();
    }

    @Override
    public OffsetDateTime component2() {
        return getLocaltsvalue();
    }

    @Override
    public OffsetDateTime value1() {
        return getDomaintsvalue();
    }

    @Override
    public OffsetDateTime value2() {
        return getLocaltsvalue();
    }

    @Override
    public TestRecord value1(OffsetDateTime value) {
        setDomaintsvalue(value);
        return this;
    }

    @Override
    public TestRecord value2(OffsetDateTime value) {
        setLocaltsvalue(value);
        return this;
    }

    @Override
    public TestRecord values(OffsetDateTime value1, OffsetDateTime value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TestRecord
     */
    public TestRecord() {
        super(Test.TEST);
    }

    /**
     * Create a detached, initialised TestRecord
     */
    public TestRecord(OffsetDateTime domaintsvalue, OffsetDateTime localtsvalue) {
        super(Test.TEST);

        setDomaintsvalue(domaintsvalue);
        setLocaltsvalue(localtsvalue);
    }
}
