package _02_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {
public static void main(String[] args) {
	String a = JOptionPane.showInputDialog("What day is your birthday? (MM/DD, 0s are important)");
	if(a.equals("11/06")){
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
		
	}
	else{
		JOptionPane.showMessageDialog(null, "Have a very merry un-birthday!");
		
	}
}
}
