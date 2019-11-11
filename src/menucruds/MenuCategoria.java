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
			CrudCategoria.createCategoria();
			break;
		case 2:
			CrudCategoria.updateCategoria();
			break;
		case 3:
			CrudCategoria.readCategoria();
			break;
		case 4:
			CrudCategoria.deleteCategoria();
			break;
		case 5:
			CrudCategoria.listCategoria();
			break;
		}

	}
}
