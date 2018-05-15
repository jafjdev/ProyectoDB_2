package com.mycompany.ultimoproyectoplsfuncional;

public class Stream {
	private Long id;
	private int viewers;
	private String languaje;
	
	public Stream (Long id, int viewers, String languaje) {
		this.id = id;
		this.viewers = viewers;
		this.languaje = languaje;
	}

	public Long getId() {
		return id;
	}
	
	public int getViewers() {
		return viewers;
	}

	public String getLanguaje() {
		return languaje;
	}
	
	

}
