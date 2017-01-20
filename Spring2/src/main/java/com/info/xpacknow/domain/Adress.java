package com.info.xpacknow.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="Adresy")
public class Adress {

	@Id
	@TableGenerator(name="generatoradresy", table="hibernate_Adresy", valueColumnName="wartosc",pkColumnName="id", initialValue=0)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="generatoradresy")
	@Column(name="ID_Adres")	
private int idAdres; 
	@Column(name="Miasto")
	@Length(max=45)
private String miasto;
	@Column(name="Powiat")
	@Length(max=45)
private String powiat;
	@Column(name="Kod_Pocztowy")
	@Length(max=45)
private String kodPocztowy;
	@Column(name="Ulica")
	@Length(max=45)
private String ulica;
	@Column(name="Nr_Domu")
	@Length(max=45)
private String nrDomu;
	@Column(name="Nr_Lokalu")
	@Length(max=45)
private String nrLokalu;






	public int getIdAdres() {
		return idAdres;
	}
	public void setIdAdres(int idAdres) {
		this.idAdres = idAdres;
	}
	public String getMiasto() {
		return miasto;
	}
	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}
	public String getPowiat() {
		return powiat;
	}
	public void setPowiat(String powiat) {
		this.powiat = powiat;
	}
	public String getKodPocztowy() {
		return kodPocztowy;
	}
	public void setKodPocztowy(String kodPocztowy) {
		this.kodPocztowy = kodPocztowy;
	}
	public String getUlica() {
		return ulica;
	}
	public void setUlica(String ulica) {
		this.ulica = ulica;
	}
	public String getNrDomu() {
		return nrDomu;
	}
	public void setNrDomu(String nrDomu) {
		this.nrDomu = nrDomu;
	}
	public String getNrLokalu() {
		return nrLokalu;
	}
	public void setNrLokalu(String nrLokalu) {
		this.nrLokalu = nrLokalu;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idAdres;
		result = prime * result + ((kodPocztowy == null) ? 0 : kodPocztowy.hashCode());
		result = prime * result + ((miasto == null) ? 0 : miasto.hashCode());
		result = prime * result + ((nrDomu == null) ? 0 : nrDomu.hashCode());
		result = prime * result + ((nrLokalu == null) ? 0 : nrLokalu.hashCode());
		result = prime * result + ((powiat == null) ? 0 : powiat.hashCode());
		result = prime * result + ((ulica == null) ? 0 : ulica.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adress other = (Adress) obj;
		if (idAdres != other.idAdres)
			return false;
		if (kodPocztowy == null) {
			if (other.kodPocztowy != null)
				return false;
		} else if (!kodPocztowy.equals(other.kodPocztowy))
			return false;
		if (miasto == null) {
			if (other.miasto != null)
				return false;
		} else if (!miasto.equals(other.miasto))
			return false;
		if (nrDomu == null) {
			if (other.nrDomu != null)
				return false;
		} else if (!nrDomu.equals(other.nrDomu))
			return false;
		if (nrLokalu == null) {
			if (other.nrLokalu != null)
				return false;
		} else if (!nrLokalu.equals(other.nrLokalu))
			return false;
		if (powiat == null) {
			if (other.powiat != null)
				return false;
		} else if (!powiat.equals(other.powiat))
			return false;
		if (ulica == null) {
			if (other.ulica != null)
				return false;
		} else if (!ulica.equals(other.ulica))
			return false;
		return true;
	}

	
	
	
	
	
	
	
	
}
