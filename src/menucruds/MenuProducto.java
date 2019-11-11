package src.menucruds;

import java.util.Scanner;

public class MenuProducto {
	public void initMenuProducto() {

		Scanner scan = new Scanner(System.in);
		int numero;

		System.out.println("\n");
		System.out.println("===PRODUCTO===\n");

		System.out.println("(1).Crear\n");
		System.out.println("(2).Actualizar\n");
		System.out.println("(3).Consultar\n");
		System.out.println("(4).Borrar\n");
		System.out.println("(5).Listar\n");

		System.out.println("Escoge una opcion: ");

		numero = (int) Integer.parseInt(scan.nextLine());

		switch (numero) {
		case 1:
			CrudProducto.createProducto();
			break;
		case 2:
			CrudProducto.updateProducto();
			break;
		case 3:
			CrudProducto.readProducto();
			break;
		case 4:
			CrudProducto.deleteProducto();
			break;
		case 5:
			CrudProducto.listProducto();
			break;
		}

	}
}
