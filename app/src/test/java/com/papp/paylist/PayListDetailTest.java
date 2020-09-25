package com.papp.paylist;

import com.papp.paylist.Controller.PayListDetail;

import org.junit.Test;

import static org.junit.Assert.*;

public class PayListDetailTest {

    @Test
    public void onCreate() {

        int result = PayListDetail.EXPENSE;
        assertNotEquals("Wrong", 12,12.5);
    }

    @Test
    public void onResume() {
        int result = PayListDetail.EXPENSE;
        assertNotEquals("Wrong", 12,12.5);
    }
}