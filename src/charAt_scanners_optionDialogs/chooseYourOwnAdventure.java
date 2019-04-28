package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class chooseYourOwnAdventure {
public static void main(String[] args) {
String name = JOptionPane.showInputDialog("Hallo, hallo, Welcome to Moth kingdom-What is your name, dear moth hero <make it a moth pun>");	
int town = JOptionPane.showOptionDialog(null, "Where will you journey to,", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
		new String[] { "Mothville", " a pit of lava that totaly isnt dangerous", "WERE IN THE ENDGAME NOW!!!!!!!!!!!!!!!!!!!!!!!!" }, null);
if(town==0) {
	int choice1 = JOptionPane.showOptionDialog(null, "what to do", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "EAT CHEESE", " buy a thanos car", "WERE IN THE ENDGAME NOW!!!!!!!!!!!!!!!!!!!!!!!!" }, null);	
	if(choice1==1) {
		int choice2 = JOptionPane.showOptionDialog(null, "lets drive that car!!!!", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "get gas", " snap your fingers", "WERE IN THE ENDGAME NOW!!!!!!!!!!!!!!!!!!!!!!!!" }, null);	
			if(choice2==0) {
				JOptionPane.showMessageDialog(null, "YAY YOUR COOL");
			}	
			else {
				JOptionPane.showMessageDialog(null, "YOU DEAD!!!!");
				}
	}
	else {
		JOptionPane.showMessageDialog(null, "YOU DEAD!!!!");
		}
	
	
}else {
	JOptionPane.showMessageDialog(null, "YOU DEAD!!!!");
	}
}
}
