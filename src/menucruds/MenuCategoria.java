package src.menucruds;

import java.util.Scanner;

public class MenuCategoria {

	public void initMenuCategoria() {

		Scanner scan = new Scanner(System.in);
		int numero;

		System.out.println("\n");
		System.out.println("===CATEGORIA===\n");

		System.out.println("(1).Crear\n");
		System.out.println("(2).Actualizar\n");
		System.out.println("(3).Consultar\n");
		System.out.println("(4).Borrar\n");
		System.out.println("(5).Listar\n");

		System.out.println("Escoge una opcion: ");

		numero = (int) Integer.parseInt(scan.nextLine());

		switch (numero) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		}

	}
}
