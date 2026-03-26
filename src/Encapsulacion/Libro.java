package Encapsulacion;

public class Libro {
	String titulo;
	String autor;
	int paginas;

	public Libro(String tit, String aut, int pag) {
		titulo = tit;
		autor = aut;
		paginas = pag;
	}
	
	public boolean esLargo() {
		if (paginas > 300 ) {
			return true;
		} else {
			return false;
		}
	}
		public void mostrar() {
			System.out.println("LIBRO: " + titulo + " | AUTOR: " + autor + " | PAGINAS: " + paginas);
		}
	}

