import javax.swing.JOptionPane;

public class testScores {
public static void main(String[] args) {
String terrible = JOptionPane.showInputDialog("What did you get on your test? [Hmmf i bet you failed again >:(]");	
double evenWorse = Double.parseDouble(terrible);
if(evenWorse>=90) {
JOptionPane.showMessageDialog(null, "Wow-I'm impressed-you didn't fail-and got an great score - " + evenWorse);
}else if(evenWorse>=70 && evenWorse<90) {
	JOptionPane.showMessageDialog(null, "you barely passed chump-I've got my eyes on you with that " + evenWorse);
	}else if(evenWorse>=90) {
	JOptionPane.showMessageDialog(null, "Wow-I'm impressed-you didn't fail-and got an great score - " + evenWorse);
	}else if(evenWorse<70 && evenWorse>=0) {
		JOptionPane.showMessageDialog(null, "What can I say- I'm not suprised-you were a failure all along with that " + evenWorse);
	}else if(evenWorse>101||evenWorse<0) {
		JOptionPane.showMessageDialog(null, "Wow-making things up again-your a trouble maker and I don't like it- " + evenWorse+ "isn't even a score unless you got extra credit or points deducted-i suspect the former ");
	}
}
}
