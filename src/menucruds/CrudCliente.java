package src.menucruds;

import java.util.Scanner;

import src.models.Clientes;
import src.models.comun.DbController;

public class CrudCliente {

	public static void createCliente() {
		Clientes cli = new Clientes();
		Scanner scan = new Scanner(System.in);

		System.out.println("Dame los datos del cliente \n");

		System.out.println("Nombre:");
		String valores = scan.nextLine();
		cli.setNombre(valores);
		System.out.println("\n");

		System.out.println("Dni:");
		valores = scan.nextLine();
		cli.setDni(valores);
		System.out.println("\n");

		System.out.println("Direccion:");
		valores = scan.nextLine();
		cli.setDireccion(valores);
		System.out.println("\n");

		System.out.println("Telefono:");
		valores = scan.nextLine();
		cli.setTelefono(valores);
		System.out.println("\n");

		System.out.println("Email:");
		valores = scan.nextLine();
		cli.setEmail(valores);
		System.out.println("\n");

		cli.save();

	}

	public static void readCliente() {
		Clientes cli = new Clientes();
		Scanner scan = new Scanner(System.in);

		System.out.println("Dame el id del cliente que quieres consultar \n");
		int valores = (int) Integer.parseInt(scan.nextLine());
		cli.getByid(valores);

	}

	public static void updateCliente() {
		Clientes cli = new Clientes();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dame el id del cliente que quieres editar \n");
		int valor = (int) Integer.parseInt(scan.nextLine());
		cli.getByid(valor);
		
		System.out.println("Dame los datos que quieres cambiar en caso de no cambiar un dato dejelo en blanco\n");
		
		System.out.println("Nombre:");
		String valores = scan.nextLine();
		if(valores=="") {
			
		}else {
		cli.setNombre(valores);
		System.out.println("\n");
		}
		
		System.out.println("Dni:");
		valores = scan.nextLine();
		if(valores=="") {
			
		}else {
		cli.setDni(valores);
		System.out.println("\n");
		}
		
		System.out.println("Direccion:");
		valores = scan.nextLine();
		if(valores=="") {
			
		}else {
		cli.setDireccion(valores);
		System.out.println("\n");
		}
		
		System.out.println("Telefono:");
		valores = scan.nextLine();
		if(valores=="") {
			
		}else {
		cli.setTelefono(valores);
		System.out.println("\n");
		}
		
		System.out.println("Email:");
		valores = scan.nextLine();
		if(valores=="") {
			
		}else {
		cli.setEmail(valores);
		System.out.println("\n");
		}
		
		cli.save();
		
		
	}
	
	public static void deleteCliente() {
		Clientes cli = new Clientes();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dame el id del cliente que quieres borrar \n");
		int valor = (int) Integer.parseInt(scan.nextLine());
		cli.getByid(valor);
		
		
		cli.delete();
	}
	
	public static void listClientes() {
		Clientes cli = new Clientes();
			
		cli.list();
	}
	
}
