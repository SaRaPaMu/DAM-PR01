package src.models.comun;

import java.util.Scanner;

public class Menu {
	
	enum Estado {
		CLIENTE,
		PRODUCTO,
		FACTURA,
		CATEGORIA,
		SALIR
	}
	private Estado e;
	
	
	
	public Menu(){
		
	}
	
	public Estado initMenu() {
		
		 Scanner scan = new Scanner(System.in);
	        int numero;
	        
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
	                	return e=Estado.CLIENTE;	                	
	                case 2:
	                	return e=Estado.CATEGORIA;
	                case 3:
	                	return e=Estado.PRODUCTO;
	                case 4:
	                	return e=Estado.FACTURA;                               
	                case 5:
	                	return e=Estado.SALIR;
	                default:
	                	return null;
	                	
	            }
	        
	}
	
	
}
