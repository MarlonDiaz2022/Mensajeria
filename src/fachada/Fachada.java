package fachada;

import java.util.ArrayList;

import model.dao.Estudiantedto;
import model.dao.Personadto;

public class Fachada {
		
private ArrayList<Personadto> integrantes;
private static Fachada instance;
private Estudiantedto estudiantedto;


public static Fachada getInstance() {
	if(instance==null)
		instance = new Fachada();
	
	return instance;
}

public ArrayList<Personadto> getIntegrantes() {
	return integrantes;
}

public void setIntegrantes(ArrayList<Personadto> integrantes) {
	this.integrantes = integrantes;
}	
	
public Estudiantedto registrarse(String nombre, String apellido, String correo, int edad, String nickname, String clave) {
	
		Estudiantedto dto = new Estudiantedto(nombre, apellido, correo, edad,nickname,clave);

	       return(dto);
									
}

public void añadirIntegrante(Estudiantedto integrante) {

	integrantes.add(integrante);	
}

public void enviarMensaje(String nickname) {
	
estudiantedto.enviarMensaje(nickname);	
	
}


public void añadirAmigo(String nickname) {
	
estudiantedto.agregarAmigo(nickname);	
	
}

public  ArrayList<Personadto> listaIntegrantes(){
	
	return integrantes;
	
	
}
	

}
