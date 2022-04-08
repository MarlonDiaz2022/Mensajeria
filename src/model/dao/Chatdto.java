package model.dao;

import java.util.ArrayList;

public class Chatdto {
	
	private ArrayList<Estudiantedto> participantes;	
	private ArrayList<Mensajedto> mensaje;
	
	
	
	
	public Chatdto(ArrayList<Estudiantedto> participantes, ArrayList<Mensajedto> mensaje) {
		this.participantes = participantes;
		this.mensaje = mensaje;
	}
	
	
	public void mostarParticipante() {
		
	for(int i=0; i<participantes.size();i++){
		
	System.out.println("los participante del chat son"+participantes.get(i).getNickmane());	
	
	    }	
	}
	
	
	
	
	public void canalprivado(String nickname, Mensajedto mensaje) {
		
		for(int i=0; i<participantes.size();i++){
			
			if(nickname.equals(participantes.get(i).getNickmane())) {
				
				
				
				
			}
			
			    }
		
		
	}
	
	
	

}
