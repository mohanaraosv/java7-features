package com.company.learning.java.features;

/**
 * @author mohanarao_sv
 *
 */
public class StringInSwitch {

    public int monthNameToDays(String s) {
        switch (s) {
        case "April":
        case "June":
        case "September":
        case "November":
            return 30;
        case "January":
        case "March":
        case "May":
        case "July":
        case "August":
        case "December":
            return 31;
        case "February":
            return 28;
        default:
            return 0;
        }
    }
}
