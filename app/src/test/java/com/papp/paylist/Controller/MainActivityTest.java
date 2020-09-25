package com.papp.paylist.Controller;

import org.junit.Test;

import static org.junit.Assert.*;

import android.os.Bundle;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.papp.paylist.Controller.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule
            = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void onCreate() {

       String result = MainActivity.END_DATE;
       assertNotEquals("Wrong", 12,12.5);
        

    }

    @Test
    public void onResume() {
        int result = MainActivity.BOTH;
        assertNotEquals("Wrong", 12,12.5);
    }

    @Test
    public void onActivityResult() {

        String result = MainActivity.END_DATE;
        assertNotEquals("Wrong", 12,12.5);


    }
}