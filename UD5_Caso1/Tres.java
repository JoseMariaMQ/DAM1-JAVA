import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Tres {
	
	static final String archDatos = "D:\\Documentos\\DAM 1º\\Programación\\Trabajos\\Unidad 5\\Caso1\\EjerciciosStreams\\datos.txt";
	static final String[] n = {"Nombre:", "Nombre:", "Nombre:"};
	static final String[] nombre = {"María López", "Antonio Hornero", "Veronica Izquierdo"};
	static final String[] t = {"Teléfono:", "Teléfono:", "Teléfono:"};
	static final int[] telefono = {955215263, 926840852, 952789123};
	//static final String[] contacto = {"Nombre:María López  Teléfono: 955215263\n", "Nombre:Antonio Hornero  Teléfono: 926840852\n", "Nombre:Veronica Izquierdo  Teléfono: 952789123\n"};
	
	public static void main(String[] args) throws IOException {
		DataOutputStream out = null;
		
		try {
			out = new DataOutputStream (new BufferedOutputStream(new FileOutputStream(archDatos)));
			for (int i = 0; i < n.length; i++) {
				out.writeUTF(n[i]);
				out.writeUTF(nombre[i]);
				out.writeUTF(t[i]);
				out.writeInt(telefono[i]);
				//out.writeUTF(contacto[i]);
			}
		} finally {
			out.close();
		}
		
		DataInputStream in = null;
		try {
			in = new DataInputStream (new BufferedInputStream(new FileInputStream(archDatos)));
			String n;
			String nombre;
			String t;
			int telefono;
			//String contacto;
			try {
				while(true) {
					n = in.readUTF();
					nombre = in.readUTF();
					t = in.readUTF();
					telefono = in.readInt();
					//contacto = in.readUTF();
					System.out.format("%s%s  %s %d%n", n, nombre, t, telefono);
					//System.out.format("%25s", contacto);
				}
			} catch (EOFException e) {
				
			} 
		} finally {
			in.close();
		}
	}
}