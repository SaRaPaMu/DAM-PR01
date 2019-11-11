package src.menucruds;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import src.models.Categoria;
import src.models.Producto;
import src.models.comun.DbObject;

public class CrudCategoria {
	public static void createCategoria() {
		Categoria cat = new Categoria();
		Scanner scan = new Scanner(System.in);
		String valores;	
			
		System.out.println("Dame el nombre de la categoria");
		valores = scan.nextLine();
		cat.setNombre(valores);
		System.out.println("\n");
		
		cat.save();

	}

	public static void readCategoria() {
		Categoria cat = new Categoria();
		Scanner scan = new Scanner(System.in);

		System.out.println("Dame el id de la categoria que quieres consultar \n");
		int valores = (int) Integer.parseInt(scan.nextLine());
		cat=(Categoria)cat.getByid(valores);
		
		System.out.println(cat.toString());

	}

	public static void updateCategoria() {
		Categoria cat = new Categoria();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dame el id de la categoria que quieres editar \n");
		int valor = (int) Integer.parseInt(scan.nextLine());
		cat = (Categoria)cat.getByid(valor);
		
		System.out.println("Cambiar nombre ? si/no");
		String valores = scan.nextLine();
		if(valores=="si") {
			System.out.println("Nombre:");
			valores = scan.nextLine();
			cat.setNombre(valores);
			System.out.println("\n");	
		}
						
		cat.save();
		
		
	}
	
	public static void deleteCategoria() {
		Categoria cat = new Categoria();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dame el id de la categoria que quieres borrar \n");
		int valor = (int) Integer.parseInt(scan.nextLine());
		cat=(Categoria)cat.getByid(valor);
		
		
		cat.delete();
	}
	
	public static void listCategoria() {
		Categoria cat = new Categoria();
			
		List<DbObject> categorias = cat.list();
		
		for (DbObject categoria : categorias) {
			cat=(Categoria) categoria;
			System.out.println(cat.getId()+""+cat.toString());
		}
		
	}
	public static ArrayList<Integer> listCategoriaIds() {
		Categoria cat = new Categoria();
			
		List<DbObject> categorias = cat.list();
		ArrayList<Integer> ids = new ArrayList<Integer>();
		
		for (DbObject categoria : categorias) {
			cat=(Categoria) categoria;
			ids.add(cat.getId());
		}
		
		return ids;
	}
}
