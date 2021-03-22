/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainForm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jeff
 */
public class ValidDate implements Serializable {

    public String err;

    public ValidDate() {
    }

    public boolean checkNull(String day, String month, String year) {
        String mess = "";
        boolean checkErr = true;
        if (day.isEmpty()) {
            checkErr = false;
            mess += "Input data for Day cannot null!\n";
        }
        if (month.isEmpty()) {
            checkErr = false;
            mess += "Input data for Month cannot null!\n";
        }
        if (year.isEmpty()) {
            checkErr = false;
            mess += "Input data for Year cannot null!\n";
        }
        if (!checkErr) {
            JOptionPane.showMessageDialog(null, mess, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return checkErr;
    }
    List<DayMonthYearErr> listErr;

    public List<DayMonthYearErr> getListErr() {
        return listErr;
    }

    public void checkDay(String day) {

        err = "";
        //Debug since 26/10/2018
//        try {
            int dayConvert = Integer.parseInt(day);

            if (dayConvert >= 1) {
                if (dayConvert > 31) {

                    if (this.listErr == null) {
                        this.listErr = new ArrayList<>();
                    }
                    err = "Input data for Day is out of range! Day must able from 1 to 31";
                    this.listErr.add(new DayMonthYearErr(err));

                }
            } else {
                if (this.listErr == null) {
                    this.listErr = new ArrayList<>();
                }
                err = "Input data for Day is out of range! Day must able from 1 to 31";
                this.listErr.add(new DayMonthYearErr(err));

            }
//        } catch (NumberFormatException e) {
//            if (this.listErr == null) {
//                this.listErr = new ArrayList<>();
//            }
//            err = "Input data for Day is incorrect format!";
//            this.listErr.add(new DayMonthYearErr(err));
//
//        }

    }

    public void checkYear(String year) {
        err = "";
        try {
            int yearConvert = Integer.parseInt(year);
            if (yearConvert >= 1000) {
                if (yearConvert > 3000) {

                    if (this.listErr == null) {
                        this.listErr = new ArrayList<>();
                    }
                    err = "Input data for Year is out of range! Year must able from 1000 to 3000";
                    this.listErr.add(new DayMonthYearErr(err));

                }
            } else {
                if (this.listErr == null) {
                    this.listErr = new ArrayList<>();
                }
                err = "Input data for Year is out of range! Year must able from 1000 to 3000";
                this.listErr.add(new DayMonthYearErr(err));

            }
        } catch (NumberFormatException e) {
            if (this.listErr == null) {
                this.listErr = new ArrayList<>();
            }
            err = "Input data for Year is incorrect format!";
            this.listErr.add(new DayMonthYearErr(err));

        }

    }

    public void checkMonth(String month) {
        err = "";
        try {
            int monthConvert = Integer.parseInt(month);
            if (monthConvert >= 1) {
                if (monthConvert > 12) {

                    if (this.listErr == null) {
                        this.listErr = new ArrayList<>();
                    }
                    err = "Input data for Month is out of range! Month must able from 1 to 12";
                    this.listErr.add(new DayMonthYearErr(err));

                }
            } else {
                if (this.listErr == null) {
                    this.listErr = new ArrayList<>();
                }
                err = "Input data for Month is out of range! Month must able from 1 to 12";
                this.listErr.add(new DayMonthYearErr(err));

            }
        } catch (NumberFormatException e) {
            if (this.listErr == null) {
                this.listErr = new ArrayList<>();
            }
            err = "Input data for Month is incorrect format!";
            this.listErr.add(new DayMonthYearErr(err));

        }

    }

    public int checkDayInMonth(String month, String year) {
        int dayLimit = 0;
        int monthConvert = Integer.parseInt(month);
        int yearConvert = Integer.parseInt(year);

        switch (monthConvert) {
            case 1:
                dayLimit = 31;
                break;
            case 2:
                if (yearConvert % 400 == 0) {
                    dayLimit = 29;
                } else if (yearConvert % 100 == 0) {
                    dayLimit = 28;
                } else if (yearConvert % 4 == 0) {
                    dayLimit = 29;
                } else {
                    dayLimit = 28;
                }
                break;
            case 3:
                dayLimit = 31;
                break;
            case 4:
                dayLimit = 30;
                break;
            case 5:
                dayLimit = 31;
                break;
            case 6:
                dayLimit = 30;
                break;
            case 7:
                dayLimit = 31;
                break;
            case 8:
                dayLimit = 31;
                break;
            case 9:
                dayLimit = 30;
                break;
            case 10:
                dayLimit = 31;
                break;
            case 11:
                dayLimit = 30;
                break;
            case 12:
                dayLimit = 31;
                break;

            default:
                break;
        }
        return dayLimit;
    }

    public boolean checkDate(String day, String month, String year) {
        int dayConvert = Integer.parseInt(day);
        int dayInMonthCheck = checkDayInMonth(month, year);
        //debug since 6/11/2018
        if (dayConvert >= dayInMonthCheck) {
            return true;
        }
        return false;
    }
}
