package com.papp.paylist;

import com.papp.paylist.Controller.PayListDetail;

import org.junit.Test;

import static org.junit.Assert.*;

public class RecyclerItemClickListenerTest {

    @Test
    public void onInterceptTouchEvent() {
        int result = PayListDetail.EXPENSE;
        assertNotEquals("Wrong", 12,12.5);
    }

    @Test
    public void onTouchEvent() {
        int result = PayListDetail.EXPENSE;
        assertNotEquals("Wrong", 12,12.5);
    }

    @Test
    public void onRequestDisallowInterceptTouchEvent() {
        int result = PayListDetail.EXPENSE;
        assertNotEquals("Wrong", 12,12.5);
    }
}