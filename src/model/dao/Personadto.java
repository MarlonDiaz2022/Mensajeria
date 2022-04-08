package model.dao;

public class Personadto {

private String nombre;	
private String apellido;
private String correo;
private int edad;


public Personadto(String nombre, String apellido, String correo, int edad) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.correo = correo;
	this.edad = edad;
}



public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}

	
	
	
	
	
}
