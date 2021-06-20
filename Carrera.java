package Trabajo_Practico;
import java.util.ArrayList;
public class Carrera {

	private String especialidad;
	private ArrayList<Atleta> atletas;
	private double segundos;
	
	
	public Carrera(String especialidad) {
		this.setEspecialidad(especialidad);
		this.atletas = new ArrayList<Atleta>();
		this.setSegundos(segundos);
	}


	public ArrayList<Atleta> getAtletas() {
		return atletas;
	}


	public String getEspecialidad() {
		return especialidad;
	}


	private void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public double getSegundos() {
		return segundos;
	}


	private void setSegundos(double segundos) {
		this.segundos = segundos;
	}
	
	public void agregarAtleta(String nombre, double tiempo){
	     Atleta atletaParaAgregar = this.buscarAtleta(nombre);
		if (atletaParaAgregar == null){
			this.atletas.add(new Atleta(nombre, tiempo));
			System.out.println("Se ha ingresado a "+ nombre + " y su tiempo de= " + tiempo + " segundos.");
		} else {
			System.out.println("Ya existe un atleta con ese nombre.");
		}
	}
	
	
	private Atleta buscarAtleta(String nombre){
		Atleta atletaBuscado = null;
		int i = 0;
		while(i < this.atletas.size() && atletaBuscado == null){
			if (this.atletas.get(i).getNombre().equals(nombre)){
				atletaBuscado = this.atletas.get(i);
			}
			i++;
		}
		return atletaBuscado;
	}
	

	public void mostrarAtletas(){
		System.out.println("Lista de atletas participantes:");
		for (Atleta atl : this.atletas){
			System.out.println(atl.mostrarAtleta());
		}
	}
	
	public ArrayList<Atleta> buscarGanador(ArrayList<Atleta>participantes){
		ArrayList<Atleta> ganadores = new ArrayList<Atleta>();
		double tiempoMin = 0;
		for (Atleta atl : participantes){
			if (atl.getTiempoCarrera() < tiempoMin || tiempoMin == 0){
				tiempoMin = atl.getTiempoCarrera();
			}
		}
		for (Atleta atle : participantes){
			if (atle.getTiempoCarrera() == tiempoMin){
				ganadores.add(atle);
			}
		}
		for (Atleta atleta : ganadores){
			 System.out.println(atleta.mostrarAtleta());

		}
		return ganadores;
	}
	
	public void buscarGanadorPorTerna(ArrayList<Atleta> participantes){
		participantes = new ArrayList<Atleta>();
		participantes.addAll(this.atletas);
		System.out.println("El primer lugar es para:");
		ArrayList<Atleta>primeros = this.buscarGanador(participantes);
		participantes.removeAll(primeros);
		System.out.println("El segundo lugar es para:");
		ArrayList<Atleta>segundos = this.buscarGanador(participantes);
		participantes.removeAll(segundos);
		System.out.println("El tercer lugar es para: ");
		ArrayList<Atleta>terceros = this.buscarGanador(participantes);
		participantes.removeAll(terceros);
	}
}
