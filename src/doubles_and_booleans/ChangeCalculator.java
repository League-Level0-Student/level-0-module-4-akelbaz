package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String arby =JOptionPane.showInputDialog("HOW MANY NICKELS DO YOU HAVE >:( !!!!! <ANGER>");
double meat =Integer.parseInt(arby);
		// Ask the user how many dimes they have, and convert their answer
String arby2 =JOptionPane.showInputDialog("HOW MANY Dimes DO YOU HAVE >:( !!!!! <ANGER>");
double meat2 =Integer.parseInt(arby2);
		// Ask the user how many quarters they have, and convert their answer
String arby3 =JOptionPane.showInputDialog("HOW MANY QUARTERS DO YOU HAVE >:( !!!!! <ANGER>");
double meat3 =Integer.parseInt(arby3);
		// Calculate how much money the user has and save it in a double variable 
double arbeeeeeeeeee= meat*.05 + meat2*.10 + meat3*.25;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "You have " + arbeeeeeeeeee + " dollares");
	}
}

