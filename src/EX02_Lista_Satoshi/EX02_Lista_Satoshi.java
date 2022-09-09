package EX02_Lista_Satoshi;
import javax.swing.JOptionPane;
public class EX02_Lista_Satoshi {

	public static void main(String[] args) {
	
		double salario,ajuste,aux;
		
		salario=Double.parseDouble(JOptionPane.showInputDialog("informe valor do Salario"));
		ajuste= Double.parseDouble(JOptionPane.showInputDialog("informe valor do ajuste"));
		
		aux= (salario*(ajuste/100));
		salario= (aux+salario);
		{
			JOptionPane.showMessageDialog(null, "Valor do novo Sálario é: " + salario);
		}
	}

}
