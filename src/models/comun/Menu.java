package src.models.comun;

import java.util.Scanner;

import src.menucruds.MenuCategoria;
import src.menucruds.MenuCliente;
import src.menucruds.MenuFactura;
import src.menucruds.MenuProducto;

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
				MenuCliente cli = new MenuCliente();
				cli.initMenuCliente();
				break;
			case 2:
				MenuCategoria cat = new MenuCategoria();
				cat.initMenuCategoria();
				break;
			case 3:
				MenuProducto prod = new MenuProducto();
				prod.initMenuProducto();
				break;
			case 4:
				MenuFactura fac = new MenuFactura();
				fac.initMenuFactura();
				break;
			case 5:
				salir = 1;
				break;
			default:
				break;

			}
		} while (salir != 1);
	}

}
