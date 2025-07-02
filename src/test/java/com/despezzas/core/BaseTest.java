package com.despezzas.core;

import org.junit.After;
import org.junit.AfterClass;

public class BaseTest {

    @AfterClass
    public static void finalizaClasse(){
    }

    @After
    public void tearDown() {
        DriverFactory.killDriver();
    }
}
