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
public class CheckNull extends TestCase{
    
    public CheckNull() {
    }

    public void testCheckNull1() {
        ValidDate v = new ValidDate();

        assertEquals(v.checkNull("", "", ""), false);

    }

    public void testCheckNull2() {
        ValidDate v = new ValidDate();

        assertEquals(v.checkNull("a", "", ""), false);

    }

    public void testCheckNull3() {
        ValidDate v = new ValidDate();

        assertEquals(v.checkNull("a", "a", ""), false);

    }

    public void testCheckNull4() {
        ValidDate v = new ValidDate();

        assertEquals(v.checkNull("a", "", "a"), false);

    }

    public void testCheckNull5() {
        ValidDate v = new ValidDate();

        assertEquals(v.checkNull("", "a", ""), false);

    }

    public void testCheckNull6() {
        ValidDate v = new ValidDate();

        assertEquals(v.checkNull("", "a", "a"), false);

    }

    public void testCheckNull7() {
        ValidDate v = new ValidDate();

        assertEquals(v.checkNull("", "", "a"), false);

    }

    public void testCheckNull8() {
        ValidDate v = new ValidDate();

        assertEquals(v.checkNull("a", "a", "a"), true);
    }
}
