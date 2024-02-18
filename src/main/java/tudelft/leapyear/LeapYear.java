package tudelft.leapyear;

public class LeapYear {

    public boolean isLeapYear(int year) {
        //added negative if statements here
        //so if the num is neg the year is
        //invalid therefor it should return
        //false
        if (year < 0)
            return (false);
        if ( year % 400 == 0)
            return true;
        if ( year % 100 == 0)
            return false;
        return  ( year % 4 == 0 ) ? true : false;
    }
}
