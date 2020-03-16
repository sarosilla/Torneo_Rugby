package TorneoRugby;

public class Equipo {
	
	public String Pais;
	public Equipo Jugadores;
	public Equipo Entrena;
	
	public java.util.Collection Entrenador = new java.util.TreeSet();
	public java.util.Collection Partido = new java.util.TreeSet();
	public java.util.Collection Estadio = new java.util.TreeSet();
	public java.util.Collection Jugador = new java.util.TreeSet();
	
	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}

}
