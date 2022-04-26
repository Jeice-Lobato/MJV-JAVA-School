import java.util.Scanner;

public class CondicaoTernaria {

	//CONDIÇÃO TERNÁRIA

	//(Condição 1)
	public static void main(String[] args) {
		
	        Scanner sc1 = new Scanner(System.in);

	        System.out.println("Escolha o Dia ");
	        System.out.println(" 1 - Domingo  ");
	        System.out.println(" 2 - 2ª Feira ");
	        System.out.println(" 3 - 3ª Feira ");
	        System.out.println(" 4 - 4ª Feira ");
	        System.out.println(" 5 - 5ª Feira ");
	        System.out.println(" 6 - 6ª Feira ");
	        System.out.println(" 7 - Sábado   ");

	        int calendario = sc1.nextInt();

	        String dia = calendario == 7 ? "Sábado" : "Que dia é hoje?";
	        System.out.println(dia);

	        sc1.close();

	    }



	//(Condição 2)

	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Escolha o Dia ");
	        System.out.println(" 1 - Domingo  ");
	        System.out.println(" 2 - 2ª Feira ");
	        System.out.println(" 3 - 3ª Feira ");
	        System.out.println(" 4 - 4ª Feira ");
	        System.out.println(" 5 - 5ª Feira ");
	        System.out.println(" 6 - 6ª Feira ");
	        System.out.println(" 7 - Sábado   ");

	        int calendario = sc.nextInt();


	        String dia = calendario ==7 ? "Sábado" : calendario >5 && calendario <7 ? "6ª Feira" : "Dia de Trabalho";
	        System.out.println(dia);

	        sc.close();

	    }
}
