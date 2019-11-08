package src.models.comun;

import java.util.Scanner;

public class Menu {

	public Menu() {

	}

	public void initMenu() {

		Scanner scan = new Scanner(System.in);
		int numero;
		int salir = 0;
		do {
			System.out.println("\n");
			System.out.println("===MI TIENDA===\n");

			System.out.println("\n");

			System.out.println("(1).Clientes\n");
			System.out.println("(2).Categorias\n");
			System.out.println("(3).Productos\n");
			System.out.println("(4).Facturas\n");
			System.out.println("(5).Salir\n");

			System.out.println("\n");

			System.out.println("Escoge una opcion: ");

			numero = (int) Integer.parseInt(scan.nextLine());

			switch (numero) {
			case 1:

			case 2:

			case 3:

			case 4:

			case 5:
				salir = 1;
			default:

			}
		} while (salir != 1);
	}

}
