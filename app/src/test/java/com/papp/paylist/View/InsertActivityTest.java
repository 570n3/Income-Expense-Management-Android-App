package com.papp.paylist.View;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertActivityTest {

    @Test
    public void TestonCreate() {
        int result = InsertActivity.RESULT_OK;
        assertNotEquals("Wrong", 100,12.5);
    }

    @Test
    public void TestonResume() {
        int result = InsertActivity.BIND_AUTO_CREATE;
        assertNotEquals("Wrong", 120,125);
    }
}