
public class Empleado {
	//Atributos
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private int telefono;
	private String direccion;
	
	//Constructor sin parámetros con atributos por defecto
	public Empleado() {
		super();
		this.nombre = "Desconocido";
		this.apellido1 = "Desconocido";
		this.apellido2 = "Desconocido";
		this.dni = "00000000A";
		this.telefono = 000000000;
		this.direccion = "Desconocido";
		
	}
	//Constructor con parámetros
	public Empleado(String nombre, String apellido1, String apellido2, String dni, int telefono, String direccion) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	//Getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	//Metodo para devolver una cadena con los valores de los atributos de un determinado objeto
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni=" + dni
				+ ", teléfono=" + telefono + ", dirección=" + direccion + "]";
	}
	
}


