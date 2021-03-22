/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uintTest;

import java.util.Scanner;
import junit.framework.TestCase;
import mainForm.ValidDate;

/**
 *
 * @author jeff
 */
public class CheckDayInMonth extends TestCase {

    public CheckDayInMonth() {
    }

    public void testCheckDayInMonth1() {
        ValidDate v = new ValidDate();
        assertEquals(v.checkDayInMonth("1", "2010"), 31);

    }

    public void testCheckDayInMonth2() {
        ValidDate v = new ValidDate();
        assertEquals(v.checkDayInMonth("2", "2010"), 28);

    }

    public void testCheckDayInMonth3() {
        ValidDate v = new ValidDate();
        assertEquals(v.checkDayInMonth("3", "2010"), 31);
    }

    public void testCheckDayInMonth4() {
        ValidDate v = new ValidDate();
        assertEquals(v.checkDayInMonth("4", "2010"), 30);

    }

    public void testCheckDayInMonth5() {
        ValidDate v = new ValidDate();
        assertEquals(v.checkDayInMonth("5", "2010"), 31);

    }

    public void testCheckDayInMonth6() {
        ValidDate v = new ValidDate();
        assertEquals(v.checkDayInMonth("6", "2010"), 30);

    }

    public void testCheckDayInMonth7() {
        ValidDate v = new ValidDate();
        assertEquals(v.checkDayInMonth("7", "2010"), 31);

    }

    public void testCheckDayInMonth8() {
        ValidDate v = new ValidDate();
        assertEquals(v.checkDayInMonth("8", "2010"), 31);

    }

    public void testCheckDayInMonth9() {
        ValidDate v = new ValidDate();
        assertEquals(v.checkDayInMonth("9", "2010"), 30);

    }

    public void testCheckDayInMonth10() {
        ValidDate v = new ValidDate();
        assertEquals(v.checkDayInMonth("10", "2010"), 31);

    }

    public void testCheckDayInMonth11() {
        ValidDate v = new ValidDate();
        assertEquals(v.checkDayInMonth("11", "2010"), 30);

    }

    public void testCheckDayInMonth12() {
        ValidDate v = new ValidDate();
        assertEquals(v.checkDayInMonth("12", "2010"), 31);
    }
    
    public void testCheckDayInMonthLeapYear() {
        ValidDate v = new ValidDate();
        assertEquals(v.checkDayInMonth("2", "2012"), 29);
    }
}
