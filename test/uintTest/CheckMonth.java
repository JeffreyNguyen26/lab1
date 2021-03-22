/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uintTest;

import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
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
public class CheckMonth extends TestCase {

    public CheckMonth() {
    }

    public void testCheckMonth1() {

        ValidDate v = new ValidDate();

        v.checkMonth("0");
        assertEquals(v.err.contains("out of range"), true);
        v.err = "";

    }

    public void testCheckMonth2() {

        ValidDate v = new ValidDate();

        v.checkMonth("13");
        assertEquals(v.err.contains("out of range"), true);
        v.err = "";

    }

    public void testCheckMonth3() {

        ValidDate v = new ValidDate();

        v.checkMonth("asd");
        assertEquals(v.err.contains("incorrect format"), true);
        v.err = "";

    }

    public void testCheckMonth4() {

        ValidDate v = new ValidDate();

        v.checkMonth("123abc");
        assertEquals(v.err.contains("incorrect format"), true);
        v.err = "";
    }

    public void testCheckMonth5() {

        ValidDate v = new ValidDate();

        v.checkMonth("1");
        assertEquals(v.err, "");
        v.err = "";

    }

    public void testCheckMonth6() {

        ValidDate v = new ValidDate();

        v.checkMonth("12");
        assertEquals(v.err, "");
    }
}
