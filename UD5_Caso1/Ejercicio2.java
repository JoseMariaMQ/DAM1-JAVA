import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		System.out.println("Comprobando que existe el archivo uno.java...");
		File archivo = new File("D:\\Documentos\\DAM 1º\\Programación\\Trabajos\\Unidad 5\\Caso1\\EjerciciosStreams\\uno.java");
		if (archivo.exists()) {
			System.out.println("Si existe");
			
			FileWriter fichero = null;
	        PrintWriter pw = null;
	        try {
	        	System.out.println("Escribiendo los números del 0 al 10 en uno.java...");
	            fichero = new FileWriter("D:\\Documentos\\DAM 1º\\Programación\\Trabajos\\Unidad 5\\Caso1\\EjerciciosStreams\\uno.java");
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
		else {
		    System.out.println("OJO: ¡¡No existe el archivo de uno.java!!");
		}
	}

}
