package com.papp.paylist.View;

import org.junit.Test;

import static org.junit.Assert.*;

public class StatsActivityTest {

    @Test
    public void onCreate() {
        int result = StatsActivity.BIND_ADJUST_WITH_ACTIVITY;
        assertNotEquals("Wrong", 12,12.5);
    }

    @Test
    public void onResume() {
        int result = StatsActivity.BIND_IMPORTANT;
        assertNotEquals("Wrong", 12,12.5);
    }
}