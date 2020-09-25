package com.papp.paylist.Model;

import com.papp.paylist.Model.DataManager;

import org.junit.Test;

import static org.junit.Assert.*;

public class DataManagerTest {

    @Test
    public void TestpaytabInsert() {
        String result = DataManager.TYPTAB_ID;
        assertNotEquals("Wrong", 12,12.5);
    }

    @Test
    public void TestpaytabUpdate() {
        String result = DataManager.PAYTAB_ID;
        assertNotEquals("Wrong", 12,12.5);
    }

    @Test
    public void TestpaytabDelete() {
        int result = DataManager.UPDTAB_DSCR_IDX;
        assertNotEquals("Wrong", 12,12.5);
    }

    @Test
    public void TestpaytabSelectAll() {
        int result = DataManager.PAYTAB_IORO_IDX;
        assertNotEquals("Wrong", 12,12.5);
    }

    @Test
    public void TestpaytabSelect() {
        String result = DataManager.PAYTAB_TYPE;
        assertNotEquals("Wrong", 12,12.5);
    }

    @Test
    public void TestpaytabSelectById() {
        int result = DataManager.PAYTAB_DATE_IDX;
        assertNotEquals("Wrong", 12,12.5);
    }

    @Test
    public void TestpaytabSelectTotal() {
        int result = DataManager.PAYTAB_DATE_IDX;
        assertNotEquals("Wrong", 12,12.5);
    }

    @Test
    public void TestpaytabSelectMax() {
        int result = DataManager.PAYTAB_DATE_IDX;
        assertNotEquals("Wrong", 12,12.5);
    }

    @Test
    public void TestpaytabSelectEuroGroupByType() {
        int result = DataManager.PAYTAB_DATE_IDX;
        assertNotEquals("Wrong", 12,12.5);
    }

    @Test
    public void TestpaytabSelectEuroGroupByDate() {
        int result = DataManager.PAYTAB_DATE_IDX;
        assertNotEquals("Wrong", 12,12.5);
    }

    @Test
    public void TesttyptabInsert() {
        int result = DataManager.PAYTAB_DATE_IDX;
        assertNotEquals("Wrong", 12,12.5);
    }

    @Test
    public void TesttyptabSelectTypes() {
        int result = DataManager.PAYTAB_DATE_IDX;
        assertNotEquals("Wrong", 12,12.5);
    }

    @Test
    public void TestupdtabInsert() {
        int result = DataManager.PAYTAB_DATE_IDX;
        assertNotEquals("Wrong", 12,12.5);
    }

    @Test
    public void TestupdtabSelectIds() {
        int result = DataManager.PAYTAB_DATE_IDX;
        assertNotEquals("Wrong", 12,12.5);
    }

    @Test
    public void TestupdtabSelectById() {
        int result = DataManager.PAYTAB_DATE_IDX;
        assertNotEquals("Wrong", 12,12.5);
    }

    @Test
    public void TestcountRows() {
        int result = DataManager.PAYTAB_DATE_IDX;
        assertNotEquals("Wrong", 12,12.5);
    }
}