import java.io.File;
import java.io.PrintWriter;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		System.out.println("Creando directorio EjerciciosStreams...");
		File directorio = new File("D:\\Documentos\\DAM 1º\\Programación\\Trabajos\\Unidad 5\\Caso1\\EjerciciosStreams");
		if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }
		
		System.out.println("Creando tres ficheros denominados uno.java, dos.java y tres.java");
		try {
            PrintWriter fichero1 = new PrintWriter("D:\\Documentos\\DAM 1º\\Programación\\Trabajos\\Unidad 5\\Caso1\\EjerciciosStreams\\Uno.java");
            PrintWriter fichero2 = new PrintWriter("D:\\Documentos\\DAM 1º\\Programación\\Trabajos\\Unidad 5\\Caso1\\EjerciciosStreams\\Dos.java");
            PrintWriter fichero3 = new PrintWriter("D:\\Documentos\\DAM 1º\\Programación\\Trabajos\\Unidad 5\\Caso1\\EjerciciosStreams\\Tres.java");
            fichero1.close();
            fichero2.close();
            fichero3.close();
            System.out.println("Ficheros Uno.java, Dos.java y Tres.java creados");
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}