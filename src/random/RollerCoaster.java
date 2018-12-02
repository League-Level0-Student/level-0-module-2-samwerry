package random;

import javax.swing.JOptionPane;

public class RollerCoaster { public static void main(String[] args) {
	
	
	
	 String hieght= JOptionPane.showInputDialog("How tall are you (in inches)");
	int h = Integer.parseInt(hieght);{
	if(h>48) {
		JOptionPane.showMessageDialog(null, "You may ride the roller coaster");
	}
	if (h<48){
		JOptionPane.showMessageDialog(null, "You are not tall enough to ride the roller coaster");
	
	}
	if(h<90) {
		JOptionPane.showMessageDialog(null, "Sorry no giants allowed");
	}
	
	}
	
	

}

}
