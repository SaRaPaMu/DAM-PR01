package src.menucruds;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import src.models.Clientes;
import src.models.comun.DbController;
import src.models.comun.DbObject;

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
		cli=(Clientes)cli.getByid(valores);
		
		System.out.println(cli.toString());

	}

	public static void updateCliente() {
		Clientes cli = new Clientes();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dame el id del cliente que quieres editar \n");
		int valor = (int) Integer.parseInt(scan.nextLine());
		cli = (Clientes)cli.getByid(valor);
		
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
		//Pattern patron = Pattern.compile("[^A-Za-z0-9.@_-~#]+");
		//patron.matches("[^A-Za-z0-9.@_-~#]+", valores);
					
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
		cli=(Clientes)cli.getByid(valor);
		
		
		cli.delete();
	}
	
	public static void listClientes() {
		Clientes cli = new Clientes();
			
		List<DbObject> clientes = cli.list();
		
		for (DbObject cliente : clientes) {
			cli=(Clientes) cliente;
			System.out.println(cli.getId()+""+cli.toString());
		}
		
	}
	
}
