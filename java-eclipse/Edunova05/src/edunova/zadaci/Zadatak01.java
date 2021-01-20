package edunova.zadaci;

import javax.swing.JOptionPane;

public class Zadatak01 {
	
	// Upogonite smisleno svih 6 razlicitih nacina poziva metode
	// JOtionPane.showInputDialog
	
public static void ispisivanje(int x,int y) {
		
	JOptionPane.showInputDialog("Hello");
	JOptionPane.showInputDialog(null, "Hii");
	JOptionPane.showInputDialog("Hiii", 2);
	//JOptionPane.showInputDialog(parentComponent, message, initialSelectionValue);
	//JOptionPane.showInputDialog(parentComponent, message, title, messageType);
	//JOptionPane.showInputDialog(parentComponent, message, title, messageType, icon, selectionValues, initialSelectionValue);
	}

}
