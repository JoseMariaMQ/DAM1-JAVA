
public class Informatico extends Empleado {
	//Atributos
	private String tipo_contrato;
	private int sueldo;
	private String jornada_laboral;
	//Constructor sin parámetros con atributos por defecto
	public Informatico() {
		super();
		this.tipo_contrato = "Temporal";
		this.sueldo = 6000;
		this.jornada_laboral = "Media jornada";
		
	}
	//Constructor con parámetros
	public Informatico(String nombre, String apellido1, String apellido2, String dni, int telefono, String direccion, String tipo_contrato, int sueldo, String jornada_laboral) {
		super(nombre, apellido1, apellido2, dni, telefono, direccion);
		this.tipo_contrato = tipo_contrato;
		this.sueldo = sueldo;
		this.jornada_laboral = jornada_laboral;
		
	}
	//Getter y setter
	public String getTipo_contrato() {
		return tipo_contrato;
	}

	public void setTipo_contrato(String tipo_contrato) {
		this.tipo_contrato = tipo_contrato;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public String getJornada_laboral() {
		return jornada_laboral;
	}

	public void setJornada_laboral(String jornada_laboral) {
		this.jornada_laboral = jornada_laboral;
	}
	//Metodo para devolver una cadena con los valores de los atributos de un determinado objeto
	@Override
	public String toString() {
		return "Informatico [tipo_contrato=" + tipo_contrato + ", sueldo=" + sueldo + ", jornada_laboral="
				+ jornada_laboral + ", nombre=" + getNombre() + ", apellido1=" + getApellido1() + ", apellido2=" + getApellido2()
				+ ", dni=" + getDni() + ", telefono=" + getTelefono() + ", direccion=" + getDireccion() + "]";
	}
}
