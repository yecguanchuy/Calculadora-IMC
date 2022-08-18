import javax.swing.JOptionPane;

public class calculadora {

	// Desarrollado por: Joaquin Yecguanchuy
	public void proceso(){
		String est = JOptionPane.showInputDialog("Ingrese su estatura");
		String peso = JOptionPane.showInputDialog("Ingrese su peso");
		double p=Double.parseDouble(peso);
		double e=Double.parseDouble(est);
		double total=p/(e*e);
		
		if (total<18.50) {
			JOptionPane.showInternalMessageDialog(null, "Usted tiene un Peso bajo");
		}else if (total>=18.50 && total<=24.9){
			JOptionPane.showInternalMessageDialog(null, "Usted tiene un Peso Normal");
		}else if (total>=25.0 && total<=29.9){
			JOptionPane.showInternalMessageDialog(null, "Usted tiene un Peso superior al normal");
		}else if (total>=30.0){
			JOptionPane.showInternalMessageDialog(null, "Usted tiene obesidad");
		}
			System.exit(0);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculadora Masa = new calculadora();
		Masa.proceso();
	}

}