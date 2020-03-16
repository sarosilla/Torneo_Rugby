package TorneoRugby;

public class Partido {
	
	public int puntosLocal;
	public int puntosVisitante;
	public int bonusLocal;
	public int bonusVisitante;
	public Partido Visitante;
	public Partido Local;
	public Partido Arbitra;
	public Jornada jornada;
	
	
	public java.util.Collection Estadio = new java.util.TreeSet();
	public java.util.Collection Equipo = new java.util.TreeSet();
	public java.util.Collection Arbitro = new java.util.TreeSet();
	
	public Partido() {
		jornada = new Jornada();
	}
	
	public void resultado() {
		
	}
	
	public int getPuntosLocal() {
		return puntosLocal;
	}
	public void setPuntosLocal(int puntosLocal) {
		this.puntosLocal = puntosLocal;
	}
	public int getPuntosVisitante() {
		return puntosVisitante;
	}
	public void setPuntosVisitante(int puntosVisitante) {
		this.puntosVisitante = puntosVisitante;
	}
	public int getBonusLocal() {
		return bonusLocal;
	}
	public void setBonusLocal(int bonusLocal) {
		this.bonusLocal = bonusLocal;
	}
	public int getBonusVisitante() {
		return bonusVisitante;
	}
	public void setBonusVisitante(int bonusVisitante) {
		this.bonusVisitante = bonusVisitante;
	}
	

}
