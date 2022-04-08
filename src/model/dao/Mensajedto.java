package model.dao;
import java.util.Calendar;

public class Mensajedto {
	
	private String contenido;	
	private Archivodto archivo;
	private Calendar fecha;
	
	public Mensajedto(String contenido, Archivodto archivo, Calendar fecha) {
		this.contenido = contenido;
		this.archivo = archivo;
		this.fecha = fecha;
	}
	
	
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public Archivodto getArchivo() {
		return archivo;
	}
	public void setArchivo(Archivodto archivo) {
		this.archivo = archivo;
	}
	public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}
	
	
	
	
	
	
	
	

}
