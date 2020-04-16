import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Dos {
	
	private double base;
	private double altura;
	private double area;
	
	public Dos() {
		this.base = 0;
		this.altura = 0;
	}
	
	public Dos(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public void areaTriangulo(double base, double altura) {
		this.area = (base*altura)/2;
	}
	
	public String toString() {
		return "(base*altura)/2 =" +" ("+base+"*"+altura+")/2 = " + area;
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce la base: ");
		int b = entrada.nextInt();
		System.out.println("Introduce la altura: ");
		int h = entrada.nextInt();
		
		Dos area = new Dos(b, h);
		area.areaTriangulo(b, h);
		System.out.println(area);
		
		System.out.println("Comprobando que existe el archivo dos.txt...");
		File archivo = new File("D:\\Documentos\\DAM 1º\\Programación\\Trabajos\\Unidad 5\\Caso1\\EjerciciosStreams\\dos.txt");
		if (archivo.exists()) {
			System.out.println("Si existe");
			
			FileWriter fichero = null;
	        PrintWriter pw = null;
	        try {
	        	System.out.println("Escribiendo calculo área triangulo en dos.txt...");
	            fichero = new FileWriter("D:\\Documentos\\DAM 1º\\Programación\\Trabajos\\Unidad 5\\Caso1\\EjerciciosStreams\\dos.txt");
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
			System.out.println("No existe dos.txt");
			System.out.println("Creando dos.txt...");
			try {
	            PrintWriter fichero1 = new PrintWriter("D:\\Documentos\\DAM 1º\\Programación\\Trabajos\\Unidad 5\\Caso1\\EjerciciosStreams\\dos.txt");
	            
	            fichero1.close();
	            
	            System.out.println("Archivo dos.txt creado");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
			
			FileWriter fichero = null;
	        PrintWriter pw = null;
	        try {
	        	System.out.println("Escribiendo calculo área triangulo en dos.txt...");
	            fichero = new FileWriter("D:\\Documentos\\DAM 1º\\Programación\\Trabajos\\Unidad 5\\Caso1\\EjerciciosStreams\\dos.txt");
	            pw = new PrintWriter(fichero);

	            pw.println(area);
	            
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
		
		entrada.close();
	}
	
	
}