import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Cuatro {
	
	static final String archDatos = "D:\\Documentos\\DAM 1º\\Programación\\Trabajos\\Unidad 5\\Caso1\\EjerciciosStreams\\datos.txt";
	
	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = null;
		DataInputStream in = null;
		try {
			in = new DataInputStream (new BufferedInputStream(new FileInputStream(archDatos)));
			String n;
			String nombre;
			String t;
			int telefono;
			rf = new RandomAccessFile("D:\\Documentos\\DAM 1º\\Programación\\Trabajos\\Unidad 5\\Caso1\\EjerciciosStreams\\datosAleatorio.dat", "rw");

			try {
				while(true) {
					n = in.readUTF();
					nombre = in.readUTF();
					t = in.readUTF();
					telefono = in.readInt();
					
					rf.writeUTF(n);
					rf.writeUTF(nombre);
					rf.writeUTF(t);
					rf.writeInt(telefono);
						
				}
			} catch (EOFException e) {
				
			} 
		} finally {
			in.close();
			rf.close();
		}
		
		try {
			rf = new RandomAccessFile("D:\\Documentos\\DAM 1º\\Programación\\Trabajos\\Unidad 5\\Caso1\\EjerciciosStreams\\datosAleatorio.dat", "r");
			rf.seek(0);
			System.out.print("Puntero en: "+rf.getFilePointer()+" ");
			String n = rf.readUTF();
			String nombre = rf.readUTF();
			String t = rf.readUTF();
			int telefono = rf.readInt();
			System.out.format("Valor: %s%s  %s %d%n", n, nombre, t, telefono);
			System.out.print("Puntero en: "+rf.getFilePointer()+" ");
		} catch (IOException e) {
			System.out.println("Error de E/S:\n"+e.getMessage());
		} finally {
			rf.close();
		}
	}

}
