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

	            salir = 0;

	            switch (numero) {
	                case 1:
	                	return e=Estado.CLIENTE;
	                	break;
	                case 2:
	                	
	                case 3:
	                	
	                case 4:
	                	                               
	                case 5:
	                    
	                    System.out.println("\n");
	                    System.out.println("===FINALIZADO===\n");
	                    salir = 1;

	                    break;
	                default:
	                    System.out.println("\n");
	                    System.out.println("Opcion no valida\n");
	                    break;
	            }
	        } while (salir != 1);*/
	}
	
	
}
