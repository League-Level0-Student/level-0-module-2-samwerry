package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class lotterynumbers {
public static void main(String[] args) {
	
 int number1 = new Random().nextInt(10);
 int number2 = new Random().nextInt(10);
 int number3 = new Random().nextInt(10);
 int number4 = new Random().nextInt(10);	
 int number5 = new Random().nextInt(10);
 
 
 JOptionPane.showMessageDialog(null, number1 + ""+number2+""+ number3+""+number4+""+number5 );
	
	
	
	
	
	
	
}
}
