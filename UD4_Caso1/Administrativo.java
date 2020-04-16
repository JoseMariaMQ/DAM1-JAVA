
public class Administrativo extends Empleado {
	//Atributos
	private String tipo_contrato;
	//Constructor sin parámetros con atributos por defecto
	public Administrativo() {
		super();
		this.tipo_contrato = "Temporal";
		
	}
	//Constructor con parámetros
	public Administrativo(String nombre, String apellido1, String apellido2, String dni, int telefono,
			String direccion, String tipo_contrato) {
		super(nombre, apellido1, apellido2, dni, telefono, direccion);
		this.tipo_contrato = tipo_contrato;
	}
	//Getter y setter
	public String getTipo_contrato() {
		return tipo_contrato;
	}

	public void setTipo_contrato(String tipo_contrato) {
		this.tipo_contrato = tipo_contrato;
	}
		
	//Metodo para devolver una cadena con los valores de los atributos de un determinado objeto
	@Override
	public String toString() {
		return "Administrativo [tipo_contrato=" + tipo_contrato + ", nombre=" + getNombre() + ", apellido1=" + getApellido1()
				+ ", apellido2=" + getApellido2() + ", dni=" + getDni() + ", telefono=" + getTelefono() + ", direccion=" + getDireccion()
				+ "]";
	}
}
