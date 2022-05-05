import javax.swing.JOptionPane;

class countPhone {
	public static void main(String[] args) {
		double x = 100.00;
		double y = 50.00;
		double z = Double.parseDouble(JOptionPane.showInputDialog("Total minute used of the plan: "));
		if(z > x)
		{
			y += (z - x) * 2.00;
			System.out.printf("\nYou used %.1f min of the phone in value of: U$%.2f\n\n", z, y + z);
		}	
	}
}

