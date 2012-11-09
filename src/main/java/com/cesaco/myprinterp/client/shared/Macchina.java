package com.cesaco.myprinterp.client.shared;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.jboss.errai.common.client.api.annotations.Portable;


/**
 * Entity implementation class for Entity: Macchina
 *
 */

@Entity
@Table(name="AT_MACCHINA")
@Portable
public class Macchina implements Serializable {

	@Id @GeneratedValue
	private long id;
	
	@NotNull
	private String cod_macchina;
	private String cod_art_gest;
	private String des_macchina;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private Gruppo gruppo;
	

	private static final long serialVersionUID = 1L;

	public Macchina() {
		super();
	}   
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	

	
	public Gruppo getGruppo() {
		return gruppo;
	}

	public void setGruppo(Gruppo gruppo) {
		this.gruppo = gruppo;
	}

	public String getCod_macchina() {
		return this.cod_macchina;
	}

	public void setCod_macchina(String cod_macchina) {
		this.cod_macchina = cod_macchina;
	}   
	public String getCod_art_gest() {
		return this.cod_art_gest;
	}

	public void setCod_art_gest(String cod_art_gest) {
		this.cod_art_gest = cod_art_gest;
	}   
	public String getDes_macchina() {
		return this.des_macchina;
	}

	public void setDes_macchina(String des_macchina) {
		this.des_macchina = des_macchina;
	}
   
}
