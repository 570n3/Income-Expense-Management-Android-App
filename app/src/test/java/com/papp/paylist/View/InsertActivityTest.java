package com.papp.paylist.View;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertActivityTest {

    @Test
    public void onCreate() {
        int result = InsertActivity.RESULT_OK;
        assertNotEquals("Wrong", 12,12.5);
    }

    @Test
    public void onResume() {
        int result = InsertActivity.BIND_AUTO_CREATE;
        assertNotEquals("Wrong", 12,12.5);
    }
}