import javax.swing.JOptionPane;


public class PesoIdealCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String genero = "";//genero de la persona
		
		do{
			genero = JOptionPane.showInputDialog("Introduzca genero (H/M), por favor.");
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
		int pesoIdeal=0;
		if(genero.equalsIgnoreCase("H")){
			pesoIdeal = altura-110;
		}
		
		else if(genero.equalsIgnoreCase("M")){
			pesoIdeal=altura-120;
		}
		
		System.out.println("Tu peso ideal es " + pesoIdeal + "kg.");

	}

}
