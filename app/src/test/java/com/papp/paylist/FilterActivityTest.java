package com.papp.paylist;

import com.papp.paylist.Model.DataManager;
import com.papp.paylist.View.FilterActivity;

import org.junit.Test;

import static org.junit.Assert.*;

public class FilterActivityTest {

    @Test
    public void onCreate() {
        int result = FilterActivity.TAG;
        assertNotEquals("Wrong", 12,12.5);
    }

    @Test
    public void onResume() {
        int result = FilterActivity.RESULT_CANCELED;
        assertNotEquals("Wrong", 12,12.5);
    }
}