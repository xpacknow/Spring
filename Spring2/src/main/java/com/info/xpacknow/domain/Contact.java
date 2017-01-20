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
@Table(name="Kontakty")
public class Contact {

	
	
	@Id
	@TableGenerator(name="generatorkontakty", table="hibernate_Kontakty", valueColumnName="wartosc",pkColumnName="id", initialValue=0)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="generatorkontakty")
	@Column(name="ID_Kontakty")	
private int idKontakty; 
	@Column(name="Telefon")
	@Length(max=45)
private String tel;
	@Column(name="Strona")
	@Length(max=45)
private String strona;
	public int getIdKontakty() {
		return idKontakty;
	}
	public void setIdKontakty(int idKontakty) {
		this.idKontakty = idKontakty;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getStrona() {
		return strona;
	}
	public void setStrona(String strona) {
		this.strona = strona;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idKontakty;
		result = prime * result + ((strona == null) ? 0 : strona.hashCode());
		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
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
		Contact other = (Contact) obj;
		if (idKontakty != other.idKontakty)
			return false;
		if (strona == null) {
			if (other.strona != null)
				return false;
		} else if (!strona.equals(other.strona))
			return false;
		if (tel == null) {
			if (other.tel != null)
				return false;
		} else if (!tel.equals(other.tel))
			return false;
		return true;
	}


	
	
	
	
	
	
	
	
	
	
	
}
