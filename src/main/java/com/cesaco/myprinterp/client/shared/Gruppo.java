package com.cesaco.myprinterp.client.shared;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jboss.errai.common.client.api.annotations.Portable;


/**
 * Entity implementation class for Entity: Gruppo
 *
 */
@Entity
@Table(name="AT_GRUPPO")
@Portable
public class Gruppo implements Serializable {

	@Id @GeneratedValue
	private long id;
	
	
	@OneToMany(mappedBy="gruppo", fetch=FetchType.EAGER )
	protected List<Macchina> macchine;
	
	@NotNull
	private String cod_gruppo;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public List<Macchina> getMacchine() {
		return macchine;
	}
	public void setMacchine(List<Macchina> macchine) {
		this.macchine = macchine;
	}

	@NotNull
	@Size(min = 5, max = 20)
	private String des_gruppo;
	private static final long serialVersionUID = 1L;

	public Gruppo() {
		super();
	}   
	public String getCod_gruppo() {
		return this.cod_gruppo;
	}

	public void setCod_gruppo(String cod_gruppo) {
		this.cod_gruppo = cod_gruppo;
	}   
	public String getDes_gruppo() {
		return this.des_gruppo;
	}

	public void setDes_gruppo(String des_gruppo) {
		this.des_gruppo = des_gruppo;
	}
	
	public String getName() {
		return cod_gruppo;
	}
	
	public String getAbbr() {
		return cod_gruppo;
	}
   
}
