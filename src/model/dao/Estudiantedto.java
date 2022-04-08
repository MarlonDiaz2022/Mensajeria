package model.dao;
import java.util.ArrayList;

import fachada.Fachada;

public class Estudiantedto extends Personadto{
	private String nombre;	
	private String apellido;
	private String correo;
	private int edad;
	private String nickmane;
	private String contraseña;
	private ArrayList<Estudiantedto> amigos;
	

public Estudiantedto(String nombre, String apellido, String correo, int edad, String nickmane, String contraseña) {
		super(nombre, apellido, correo, edad);
		this.nickmane = nickmane;
		this.contraseña = contraseña;
}


	public String getNickmane() {
		return nickmane;
	}
	public void setNickmane(String nickmane) {
		this.nickmane = nickmane;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public ArrayList<Estudiantedto> getAmigo() {
		return amigos;
	}
	public void setAmigo(ArrayList<Estudiantedto> amigo) {
		this.amigos = amigo;
	}
	
	
public void agregarAmigo(String nickname){
	
	Fachada obj = Fachada.getInstance();
	
	for(int i=0; i<obj.listaIntegrantes().size();i++) {
	  
		if(nickname.equals(getNickmane())) {
		
		amigos.add(((Estudiantes)obj).listaIntegrantes().get(i));	
	}
	
		
	}
	
	

}
	

public void enviarMensaje(String nickname){
	

}	
	
	
	
	
	
}
