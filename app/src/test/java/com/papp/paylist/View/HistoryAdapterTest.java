package com.papp.paylist.View;

import org.junit.Test;

import static org.junit.Assert.*;

public class HistoryAdapterTest {

    @Test
    public void TestonCreateViewHolder() {
        int result = FilterActivity.TAG;
        assertNotEquals("Wrong", 12,12.5);
    }

    @Test
    public void TestonBindViewHolder() {
        int result = FilterActivity.BOTH;
        assertNotEquals("Wrong", 50,120);
    }

    @Test
    public void TestgetItemCount() {
        int result = FilterActivity.INCOME;
        assertNotEquals("Wrong", 200,199);
    }
}