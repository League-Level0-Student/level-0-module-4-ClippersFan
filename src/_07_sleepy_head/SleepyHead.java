package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
        int wee = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        int vac = JOptionPane.showConfirmDialog(null,"Are you on vacation?", "Sleep In", JOptionPane.YES_NO_OPTION);
        if(vac == 0) {
    		isVacation = true;
    	}else {
    		isVacation = false;
    	}
    	if(wee == 0) {
    		isWeekday = true;
    	}else {
    		isWeekday = false;
    	}
    	if(!isWeekday || isVacation) {
    		JOptionPane.showMessageDialog(null, "Sleep In!");
    	}else if(isWeekday && isVacation) {
    		JOptionPane.showMessageDialog(null, "Sleep In!");
    	}else if(isWeekday) {
    		JOptionPane.showMessageDialog(null, "Get Up Lazybones");
    	}
    	
        	
        	

        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }

	
	}

