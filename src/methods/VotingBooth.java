package methods;

import javax.swing.JOptionPane;

public class VotingBooth {public static void main(String[] args) {
	
	
	String age = JOptionPane.showInputDialog("How old are you?");
	
	int h = Integer.parseInt(age);
	
if(h>18) {
	JOptionPane.showMessageDialog(null, "Who should be the next president");
}
if(h<18) {
	JOptionPane.showMessageDialog(null, "Nobody cares what you think");
}




}
}


