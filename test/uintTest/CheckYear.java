/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uintTest;

import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import mainForm.ValidDate;

/**
 *
 * @author jeff
 */
public class CheckYear extends TestCase {

    public CheckYear() {
    }

    public void testCheckYear1() {

        ValidDate v = new ValidDate();

        v.checkYear("-1");
        assertEquals(v.err.contains("out of range"), true);
        v.err = "";
    }

    public void testCheckYear2() {

        ValidDate v = new ValidDate();

        v.checkYear("3001");
        assertEquals(v.err.contains("out of range"), true);
        v.err = "";

    }

    public void testCheckYear3() {

        ValidDate v = new ValidDate();

        v.checkYear("asd");
        assertEquals(v.err.contains("incorrect format"), true);
        v.err = "";

    }
    
    public void testCheckYear4() {

        ValidDate v = new ValidDate();

        v.checkYear("123abc");
        assertEquals(v.err.contains("incorrect format"), true);
        v.err = "";

    }

    public void testCheckYear5() {

        ValidDate v = new ValidDate();

        v.checkYear("1000");
        assertEquals(v.err, "");
        v.err = "";

    }

    public void testCheckYear6() {

        ValidDate v = new ValidDate();

        v.checkYear("3000");
        assertEquals(v.err, "");
    }

}
