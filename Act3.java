package Actividad3;

public class Act3 {
	public static void main(String[]args) {
		int palos = (int) (Math.random()* 4+1);
		String palosb = "";
		
		if(palos == 1 ) {
			palosb = "Picas";
		}
		if(palos == 2 ) {
			palosb = "Corazones";
		}
		if(palos == 3 ) {
			palosb = "Diamantes";
		}
		if(palos == 4 ) {
			palosb = "Treboles";
		}
		int numeros = (int) (Math.random()* 13+1);
		String numerosb = "";
		
		if(numeros==1) {
			numerosb= "AS";
		}
		if(numeros==2) {
			numerosb= "Dos";
		}
		if(numeros==3) {
			numerosb= "Tres";
		}
		if(numeros==4) {
			numerosb= "Cuatro";
		}
		if(numeros==5) {
			numerosb= "Cinco";
		}
		if(numeros==6) {
			numerosb= "Seis";
		}
		if(numeros==7) {
			numerosb= "Siete";
		}
		if(numeros==8) {
			numerosb= "Ocho";
		}
		if(numeros==9) {
			numerosb= "Nueve";
		}
		if(numeros==10) {
			numerosb= "Diez";
		}
		if(numeros==11) {
			numerosb= "Jota";
		}
		if(numeros==12) {
			numerosb= "Reina";
		}
		if(numeros==13) {
			numerosb= "Rey";
		
		}
System.out.println(numerosb + " De " + palosb);
	}

}
