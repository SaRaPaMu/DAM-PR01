package src.menucruds;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import src.models.Producto;
import src.models.comun.DbController;
import src.models.comun.DbObject;

public class CrudProducto {
	public static void createProducto() {
		Producto prod = new Producto();
		ArrayList<Integer> ids = CrudCategoria.listCategoriaIds();
		Scanner scan = new Scanner(System.in);
		String valores;
		int valor;
		
		System.out.println("Dame los datos del producto \n");
		
		do {
		System.out.println("Nombre:");
		valores = scan.nextLine();
		prod.setNombre(valores);
		System.out.println("\n");
		}while(valores.matches("[a-zA-Z]*|[0-9]*|\\s*"));
		
		
		System.out.println("precio:");
		valor =(int) Integer.parseInt(scan.nextLine());
		prod.setPrecio(valor);
		System.out.println("\n");
		
			
		
		System.out.println("stock:");
		valor =(int) Integer.parseInt(scan.nextLine());
		prod.setStock(valor);
		System.out.println("\n");
		
		
		CrudCategoria.listCategoria();
		System.out.println("escoge el id de una de estas categorias");
		do {
		System.out.println("Categoria:");
		valor =(int) Integer.parseInt(scan.nextLine());	
		prod.setId_categoria(valor);
		}while(ids.contains(valor));
		
		System.out.println("\n");

		prod.save();

	}

	public static void readProducto() {
		Producto prod = new Producto();
		Scanner scan = new Scanner(System.in);

		System.out.println("Dame el id del producto que quieres consultar \n");
		int valores = (int) Integer.parseInt(scan.nextLine());
		prod=(Producto)prod.getByid(valores);
		
		System.out.println(prod.toString());

	}

	public static void updateProducto() {
		Producto prod = new Producto();
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> ids = CrudCategoria.listCategoriaIds();
		
		System.out.println("Dame el id del producto que quieres editar \n");
		int valor = (int) Integer.parseInt(scan.nextLine());
		prod = (Producto)prod.getByid(valor);
		
		System.out.println("Dame los datos que quieres cambiar\n");
		
		System.out.println("Cambiar nombre ? si/no");
		String valores = scan.nextLine();
		if(valores=="si") {
			do {
			System.out.println("Nombre:");
			valores = scan.nextLine();
			prod.setNombre(valores);
			System.out.println("\n");
			}while(valores.matches("[a-zA-Z]*|[0-9]*"));
			
		}
		
		System.out.println("Cambiar precio? si/no");
		valores = scan.nextLine();
		if(valores=="si") {
			System.out.println("precio:");
			valor =(int) Integer.parseInt(scan.nextLine());
			prod.setPrecio(valor);
			System.out.println("\n");
		}
		
		System.out.println("Cambiar stock? si/no");
		valores = scan.nextLine();
		if(valores=="si") {
			System.out.println("stock:");
			valor =(int) Integer.parseInt(scan.nextLine());
			prod.setStock(valor);
			System.out.println("\n");
		}
		
		System.out.println("Cambiar categoria? si/no");
		valores = scan.nextLine();
		
		
		if(valores=="si") {
			CrudCategoria.listCategoria();
			System.out.println("escoge el id de una de estas categorias");
			do {
				System.out.println("Categoria:");
				valor =(int) Integer.parseInt(scan.nextLine());	
				prod.setId_categoria(valor);
				}while(ids.contains(valor));
		}
				
		prod.save();
		
		
	}
	
	public static void deleteProducto() {
		Producto prod = new Producto();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dame el id del producto que quieres borrar \n");
		int valor = (int) Integer.parseInt(scan.nextLine());
		prod=(Producto)prod.getByid(valor);
		
		
		prod.delete();
	}
	
	public static void listProducto() {
		Producto prod = new Producto();
			
		List<DbObject> productos = prod.list();
		
		for (DbObject producto : productos) {
			prod=(Producto) producto;
			System.out.println(prod.getId()+""+prod.toString());
		}
		
	}
	
	public static void listProductoByIdCategoria() {
		Producto prod = new Producto();
		Scanner scan = new Scanner(System.in);
		
		CrudCategoria.listCategoria();
		System.out.println("escoge el id de una de estas categorias");
		int id = (int) Integer.parseInt(scan.nextLine());
				
		List<DbObject> productos = DbController.getInstance().listByCategoria(prod, id);
		
		for (DbObject producto : productos) {
			prod=(Producto) producto;
			System.out.println(prod.getId()+""+prod.toString());
		}
		
	}
	
	
}
