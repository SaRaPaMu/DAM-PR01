package src.menucruds;

import java.util.Scanner;

public class MenuCliente {

	public void initMenuCliente() {

		Scanner scan = new Scanner(System.in);
		int numero;

		System.out.println("\n");
		System.out.println("===CLIENTES===\n");

		System.out.println("(1).Crear\n");
		System.out.println("(2).Actualizar\n");
		System.out.println("(3).Consultar\n");
		System.out.println("(4).Borrar\n");
		System.out.println("(5).Listar\n");

		System.out.println("Escoge una opcion: ");

		numero = (int) Integer.parseInt(scan.nextLine());

		switch (numero) {
		case 1:
			CrudCliente.createCliente();
			break;
		case 2:
			CrudCliente.updateCliente();
			break;
		case 3:
			CrudCliente.readCliente();
			break;
		case 4:
			CrudCliente.deleteCliente();
			break;
		case 5:
			CrudCliente.listClientes();
			break;
		}

	}
}
