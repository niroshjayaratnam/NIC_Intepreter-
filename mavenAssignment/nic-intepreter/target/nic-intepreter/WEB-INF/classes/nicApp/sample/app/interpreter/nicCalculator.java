/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nicApp.sample.app.interpreter;

import nicApp.mavelEexception;

/**
 *
 * @author Buddhika
 */
public class nicCalculator {
    private String nic;
    public nicApp.nicProp createNicProp(String nic)throws mavelEexception{
        try {
		return new nicApp.nicProp(nic);
		} catch(Exception ex) {
			throw new mavelEexception();
		}
    }
    public int calYear(nicApp.nicProp prop){
        nic = prop.getNic();
        int year = 0;
        
        return year;
    }
    public int calMonth(nicApp.nicProp prop){
        nic = prop.getNic();
        int month = 0;
        
        return month;
    }
    public int calDay(nicApp.nicProp prop){
        nic = prop.getNic();
        int day = 0;
        
        return day;
    }
    public String calGender(nicApp.nicProp prop){
        nic = prop.getNic();
        String gendor = "male";
        
        return gendor;
    }
    public boolean calIsvoter(nicApp.nicProp prop){
        nic = prop.getNic();
        boolean isVoter = true;
        
        return isVoter;
    }
    public int calRecordNumber(nicApp.nicProp prop){
        nic = prop.getNic();
        int recordNumber = 0;
        
        
        return recordNumber;
    }
    public String calResult(nicApp.nicProp prop){
        nic = prop.getNic();
        String result = "test";
        
        
        return result;
    }
        
    
}

