
public class Segmento {
	//Atributos
	private Punto puntoIZ;
	private Punto puntoDE;
	//Constructores
	public Segmento() {
		this.puntoIZ = new Punto();
		this.puntoDE = new Punto();
	}
	//En este constructor se compara que punto corresponde al izquierdo y al derecho
	public Segmento(Punto punto1, Punto punto2) {
				
		if (punto1.getX() < punto2.getX()) //punto1 será el punto izquierdo
		{
			this.puntoIZ = punto1.copia();
			this.puntoDE = punto2.copia();
		}
		else //punto2 será el punto izquierdo
		{
			this.puntoIZ = punto2.copia();
			this.puntoDE = punto1.copia();
		}
	}
	//Getter y setter
	public Punto getPuntoIZ() {
		return puntoIZ;
	}
	public void setPuntoIZ(Punto puntoIZ) {
		this.puntoIZ = puntoIZ;
	}
	public Punto getPuntoDE() {
		return puntoDE;
	}
	public void setPuntoDE(Punto puntoDE) {
		this.puntoDE = puntoDE;
	}
	//Devuelve un String con la cadena que queremos que se muestre
	@Override
	public String toString() {
		return "Segmento: puntoIZ = " + puntoIZ + ", puntoDE = " + puntoDE;
		
	}
	//Devuelve la pendiente del segmento → (Y2–Y1)/(X2-X1)
	public double pendiente() {
		return (puntoDE.getY()-puntoIZ.getY()) / (puntoDE.getX()-puntoIZ.getX());
	}
	//Devuelve true si el segmento que se le pasa como argumento empieza en el mismo punto donde acaba el original	
	public boolean sonConsecutivos(Segmento s) {
		return puntoDE.sonIguales(s.getPuntoIZ());
	}
	//Devuelve true si ambos empiezan y terminan en los mismos puntos
	public boolean sonIguales(Segmento s) {
		return (puntoIZ.sonIguales(s.getPuntoIZ()) && puntoDE.sonIguales(s.getPuntoDE()));
		
	}

}
