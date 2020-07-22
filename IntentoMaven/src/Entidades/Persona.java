package Entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Persona
 *
 */
@Entity

public class Persona implements Serializable {
	@Id
	private int id;
	private String nombre;
	

	
	private static final long serialVersionUID = 1L;

	public Persona() {
		super();
	}
   
}
