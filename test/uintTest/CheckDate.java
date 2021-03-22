/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uintTest;

import junit.framework.TestCase;
import mainForm.ValidDate;

/**
 *
 * @author jeff
 */
public class CheckDate extends TestCase {

    public CheckDate() {
    }

    
    public void testCheckDateForDay31Month3() {
        ValidDate v = new ValidDate();
        assertEquals(v.checkDate("31", "3", "2010"), true);
    }
    
    public void testCheckDateForDay29OfFebLeapYear() {
        ValidDate v = new ValidDate();
        assertEquals(v.checkDate("29", "2", "2016"), true);
    }

    public void testCheckDateForDay28OfFebYear2010() {
        ValidDate v = new ValidDate();
        assertEquals(v.checkDate("28", "2", "2010"), true);
    }

    public void testCheckDateForDayOfFeb() {
        ValidDate v = new ValidDate();
        assertEquals(v.checkDate("31", "2", "2010"), false);
    }

    public void testCheckDateForDay31Month10() {
        ValidDate v = new ValidDate();
        assertEquals(v.checkDate("31", "10", "2010"), true);
    }

    public void testCheckDateForDay31Month12() {
        ValidDate v = new ValidDate();
        assertEquals(v.checkDate("31", "12", "2010"), true);
    }

    public void testCheckDateForDay30Month6() {
        ValidDate v = new ValidDate();

        assertEquals(v.checkDate("30", "6", "2010"), true);

    }

    public void testCheckDateForDay30Month7() {
        ValidDate v = new ValidDate();
       assertEquals(v.checkDate("30", "7", "2010"), true);

    }

    public void testCheckDateForDay30Month9() {
        ValidDate v = new ValidDate();
        assertEquals(v.checkDate("30", "9", "2010"), true);
    }

    public void testCheckDateForDay31Month6() {
        ValidDate v = new ValidDate();
         assertEquals(v.checkDate("31", "6", "2010"), false);

    }
    public void testCheckDateForDay31Month9() {
        ValidDate v = new ValidDate();
         assertEquals(v.checkDate("31", "9", "2010"), false);

    }
}
