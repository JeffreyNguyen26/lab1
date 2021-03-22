/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uintTest;

import java.util.List;
import junit.framework.TestCase;
import mainForm.DayMonthYearErr;
import mainForm.ValidDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jeff
 */
public class CheckDay extends TestCase {

    public CheckDay() {
    }

    public void testCheckDayLessThanZero() {

        ValidDate v = new ValidDate();
        v.checkDay("-1");
        assertEquals(v.err.contains("out of range"), true);
    }

    public void testCheckDayGreaterThan31() {

        ValidDate v = new ValidDate();
        v.checkDay("32");
        assertEquals(v.err.contains("out of range"), true);
    }

    public void testCheckDayInputString() {

        ValidDate v = new ValidDate();
        v.checkDay("asd");
        assertEquals(v.err.contains("incorrect format"), true);
    }
    
    public void testCheckDayInputStringNumber() {

        ValidDate v = new ValidDate();
        v.checkDay("123abc");
        assertEquals(v.err.contains("incorrect format"), true);
    }

    public void testCheckDay1() {

        ValidDate v = new ValidDate();
        v.checkDay("1");
        assertEquals(v.err, "");
    }

    public void testCheckDay31() {

        ValidDate v = new ValidDate();
        v.checkDay("31");
        assertEquals(v.err, "");
    }
}
