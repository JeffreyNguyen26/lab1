/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainForm;

import java.io.Serializable;

/**
 *
 * @author jeff
 */
public class DayMonthYearErr implements Serializable{
    private String error;

    public DayMonthYearErr() {
    }

    public DayMonthYearErr(String error) {
        this.error = error;
    }

    /**
     * @return the error
     */
    public String getError() {
        return error;
    }

    /**
     * @param error the error to set
     */
    public void setError(String error) {
        this.error = error;
    }
    
}
