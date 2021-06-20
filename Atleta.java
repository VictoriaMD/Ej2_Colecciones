package Trabajo_Practico;

public class Atleta {

	private String nombre;
	private double tiempoCarrera;
	
	public Atleta(String nombre, double tiempoCarrera) {
		this.setNombre(nombre);
		this.setTiempoCarrera(tiempoCarrera);
	}
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getTiempoCarrera() {
		return tiempoCarrera;
	}
	private void setTiempoCarrera(double tiempoCarrera) {
		this.tiempoCarrera = tiempoCarrera;
	}
	
	public String mostrarAtleta(){
		return "Nombre del atleta= " +this.nombre+ ", segundos empleados= " + this.tiempoCarrera;
	}
}
