package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday=false, isVacation=false;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
        int lazy = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        int lazy2 = JOptionPane.showConfirmDialog(null, "Is it a vacation?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        System.out.println(lazy2);
        if(lazy==0) {
isWeekday=true;
}else if(lazy==1) {
isWeekday=false;
} if(lazy2==0) {
isVacation=true;
}else if(lazy2==1) {
isVacation=false;
}
if( (!isWeekday) || isVacation ) {
	JOptionPane.showMessageDialog(null, "sleep in");
}else if(isWeekday&&isVacation) {
	JOptionPane.showMessageDialog(null, "sleep in");
}else if(isWeekday) {
		JOptionPane.showMessageDialog(null, "GET UP LAZY BONES!!!!!!!!");
}
    }
}
        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
