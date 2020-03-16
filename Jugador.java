package TorneoRugby;

public class Jugador extends Persona {

	public String posicion;
	public Jugador capitan;
	
	public java.util.Collection Equipo = new java.util.TreeSet();
	public java.util.Collection Jugador = new java.util.TreeSet();
	
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
}
