package stringexamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples {
    public static void main(String[] args) {
        //get all countries in a list that end with stan
        String s = "afghanistan, argentina, burkina faso, pakistan, turkmenistan";
        Pattern p = Pattern.compile("[a-z]+stan");
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.print(s.substring(m.start(), m.end()) + "*");
        }
        
        //make sure a date has been passed in
        //the dd/mm/yyyy format
        s = "10/31/1980";
        
        p = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)");
        /*explanation
        0? - that just means something that 0 occurs once or not at all. So it takes into account folks writing 06/07 and folks writing 6/7
        the day is either in less than 10 in which case 0?[1-9] will match
        or the day is 10 through 29 in which case [12][0-9], which mean either 1 or 2 and then followed by something from 0 to 9
        or the day is 30 or 31.
        the month is either less than 10 in which case the same 0?[1-9] pattern applies
        if the month is >= 10 it can only be 10,11 or 12 which is what 1[012] will match
        finally the assumption here is that we only care about writing dates in the 20th or 21st century. 
        so the date begins with 19 or 20 and then is followed by 2 digits.*/
        m = p.matcher(s);
        System.out.println(m.matches());
    }
}
