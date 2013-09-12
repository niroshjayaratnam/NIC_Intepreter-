/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nicApp;

/**
 *
 * @author Buddhika
 */
public class nicCalculator {
    private String nic;
    public nicProp createNicProp(String nic)throws mavelEexception{
        try {
		return new nicProp(nic);
		} catch(Exception ex) {
			throw new mavelEexception();
		}
    }
    public int calYear(nicProp prop){
        nic = prop.getNic();
        int year = 0;
        
        return year;
    }
    public int calMonth(nicProp prop){
        nic = prop.getNic();
        int month = 0;
        
        return month;
    }
    public int calDay(nicProp prop){
        nic = prop.getNic();
        int day = 0;
        
        return day;
    }
    public String calGender(nicProp prop){
        nic = prop.getNic();
        String gendor = "male";
        
        return gendor;
    }
    public boolean calIsvoter(nicProp prop){
        nic = prop.getNic();
        boolean isVoter = true;
        
        return isVoter;
    }
    public int calRecordNumber(nicProp prop){
        nic = prop.getNic();
        int recordNumber = 0;
        
        
        return recordNumber;
    }
    public String calResult(nicProp prop){
        nic = prop.getNic();
        String result = "test";
        
        
        return result;
    }
        
    
}
