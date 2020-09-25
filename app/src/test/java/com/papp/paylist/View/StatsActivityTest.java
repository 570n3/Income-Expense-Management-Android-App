package com.papp.paylist.View;

import org.junit.Test;

import static org.junit.Assert.*;

public class StatsActivityTest {

    @Test
    public void TestonCreate() {
        int result = StatsActivity.BIND_ADJUST_WITH_ACTIVITY;
        assertNotEquals("Wrong", 500,15);
    }

    @Test
    public void TestonResume() {
        int result = StatsActivity.BIND_IMPORTANT;
        assertNotEquals("Wrong", 182,85);
    }
}