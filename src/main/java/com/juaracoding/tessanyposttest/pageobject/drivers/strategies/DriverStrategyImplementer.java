package com.juaracoding.tessanyposttest.pageobject.drivers.strategies;

import com.juaracoding.tessanyposttest.pageobject.utils.Constants;

public class DriverStrategyImplementer {
    public static DriverStrategy chooseStrategy(String strategy) {
        switch (strategy) {
            case Constants.CHROME:
                return new Chrome();


            default:
                return null;
        }
    }
}
