package Trabajo_Practico;

public class TestCarrera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carrera miCarrera = new Carrera("Ciclismo");
		miCarrera.agregarAtleta("Juan", 23.32);
		miCarrera.agregarAtleta("Jos�", 19.57);
		miCarrera.agregarAtleta("Diego", 13.21);
		miCarrera.agregarAtleta("Pedro", 19.57);
		miCarrera.buscarGanadorPorTerna(miCarrera.getAtletas());
	}

	
}
