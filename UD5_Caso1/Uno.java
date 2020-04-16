import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Uno {
	
	public static void main(String[] args) {
		
		System.out.println("Comprobando que existe el archivo uno.txt...");
		File archivo = new File("D:\\Documentos\\DAM 1º\\Programación\\Trabajos\\Unidad 5\\Caso1\\EjerciciosStreams\\uno.txt");
		if (archivo.exists()) {
			System.out.println("Si existe");
			
			FileWriter fichero = null;
	        PrintWriter pw = null;
	        try {
	        	System.out.println("Escribiendo los números del 0 al 10 en uno.txt...");
	            fichero = new FileWriter("D:\\Documentos\\DAM 1º\\Programación\\Trabajos\\Unidad 5\\Caso1\\EjerciciosStreams\\uno.txt");
	            pw = new PrintWriter(fichero);

	            for (int i = 0; i <= 10; i++)
	                pw.println(i);
	            
	            System.out.println("Escritura con éxito");
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	           try {
	           //Aprovechamos el finally para asegurarnos que se cierra el fichero.
	           if (null != fichero)
	              fichero.close();
	           } catch (Exception e2) {
	              e2.printStackTrace();
	           }
	        } 
		} else {
			System.out.println("No existe uno.txt");
			System.out.println("Creando uno.txt...");
			try {
	            PrintWriter fichero1 = new PrintWriter("D:\\Documentos\\DAM 1º\\Programación\\Trabajos\\Unidad 5\\Caso1\\EjerciciosStreams\\uno.txt");
	            
	            fichero1.close();
	            
	            System.out.println("Archivo uno.txt creado");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
			
			FileWriter fichero = null;
	        PrintWriter pw = null;
	        try {
	        	System.out.println("Escribiendo los números del 0 al 10 en uno.txt...");
	            fichero = new FileWriter("D:\\Documentos\\DAM 1º\\Programación\\Trabajos\\Unidad 5\\Caso1\\EjerciciosStreams\\uno.txt");
	            pw = new PrintWriter(fichero);

	            for (int i = 0; i <= 10; i++)
	                pw.println(i);
	            
	            System.out.println("Escritura con éxito");
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	           try {
	           //Aprovechamos el finally para asegurarnos que se cierra el fichero.
	           if (null != fichero)
	              fichero.close();
	           } catch (Exception e2) {
	              e2.printStackTrace();
	           }
	        } 
		
		}
		
	}

}
