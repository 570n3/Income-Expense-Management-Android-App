package com.papp.paylist;

import com.papp.paylist.Controller.PayListDetail;
import com.papp.paylist.Model.BaseActivity;

import org.junit.Test;

import static org.junit.Assert.*;

public class BaseActivityTest {

    @Test
    public void getAppFormatDate() {
        int result = BaseActivity.BOTH;
        assertNotEquals("Wrong", 12,12.5);
    }

    @Test
    public void getDbFormatDate() {
        int result = BaseActivity.INCOME;
        assertNotEquals("Wrong", 12,12.5);
    }
}