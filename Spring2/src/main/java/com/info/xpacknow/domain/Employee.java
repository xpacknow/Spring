package com.info.xpacknow.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;


import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="Pracownicy")
public class Employee {

	
@Id
@TableGenerator(name="generatorpracownicy", table="hibernate_Pracownicy", valueColumnName="wartosc",pkColumnName="id", initialValue=0)
@GeneratedValue(strategy=GenerationType.TABLE, generator="generatorpracownicy")
@Column(name="ID_Pracownika")
private int idPracownika;	

@Column(name="ID_Kontakt")
private int idKontakt;
@Column(name="Login")
private String login;
@Column(name="Haslo")
private String haslo;
@Column(name="Imie")
private String imie;
@Column(name="Nazwisko")
private String nazwisko;
@Column(name="Uprawnienia")
private int uprawnienia;
@Column(name="Aktywnosc")
private boolean aktywneKonto;
@Column(name="Zatrudnienie")
private java.sql.Timestamp dataZatrudnienia;
@Column(name="Zwolnienie")
private java.sql.Timestamp dataZwonienia;

@Transient
private MultipartFile zdjecie;




@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="Adres")
private	Adress idAdres;



public MultipartFile getZdjecie() {
	return zdjecie;
}
public void setZdjecie(MultipartFile zdjecie) {
	this.zdjecie = zdjecie;
}

public int getIdPracownika() {
	return idPracownika;
}
public void setIdPracownika(int idPracownika) {
	this.idPracownika = idPracownika;
}

public int getIdKontakt() {
	return idKontakt;
}
public void setIdKontakt(int idKontakt) {
	this.idKontakt = idKontakt;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getHaslo() {
	return haslo;
}
public void setHaslo(String haslo) {
	this.haslo = haslo;
}
public String getImie() {
	return imie;
}
public void setImie(String imie) {
	this.imie = imie;
}
public String getNazwisko() {
	return nazwisko;
}
public void setNazwisko(String nazwisko) {
	this.nazwisko = nazwisko;
}
public int getUprawnienia() {
	return uprawnienia;
}
public void setUprawnienia(int uprawnienia) {
	this.uprawnienia = uprawnienia;
}
public boolean isAktywneKonto() {
	return aktywneKonto;
}
public void setAktywneKonto(boolean aktywneKonto) {
	this.aktywneKonto = aktywneKonto;
}
public java.sql.Timestamp getDataZatrudnienia() {
	return dataZatrudnienia;
}
public void setDataZatrudnienia(java.sql.Timestamp dataZatrudnienia) {
	this.dataZatrudnienia = dataZatrudnienia;
}
public java.sql.Timestamp getDataZwonienia() {
	return dataZwonienia;
}
public void setDataZwonienia(java.sql.Timestamp dataZwonienia) {
	this.dataZwonienia = dataZwonienia;
}
public Adress getIdAdres() {
	return idAdres;
}
public void setIdAdres(Adress idAdres) {
	this.idAdres = idAdres;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (aktywneKonto ? 1231 : 1237);
	result = prime * result + ((dataZatrudnienia == null) ? 0 : dataZatrudnienia.hashCode());
	result = prime * result + ((dataZwonienia == null) ? 0 : dataZwonienia.hashCode());
	result = prime * result + ((haslo == null) ? 0 : haslo.hashCode());
//	result = prime * result + ((idAdres == null) ? 0 : idAdres.hashCode());
	result = prime * result + idKontakt;
	result = prime * result + idPracownika;
	result = prime * result + ((imie == null) ? 0 : imie.hashCode());
	result = prime * result + ((login == null) ? 0 : login.hashCode());
	result = prime * result + ((nazwisko == null) ? 0 : nazwisko.hashCode());
	result = prime * result + uprawnienia;
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
	Employee other = (Employee) obj;
	if (aktywneKonto != other.aktywneKonto)
		return false;
	if (dataZatrudnienia == null) {
		if (other.dataZatrudnienia != null)
			return false;
	} else if (!dataZatrudnienia.equals(other.dataZatrudnienia))
		return false;
	if (dataZwonienia == null) {
		if (other.dataZwonienia != null)
			return false;
	} else if (!dataZwonienia.equals(other.dataZwonienia))
		return false;
	if (haslo == null) {
		if (other.haslo != null)
			return false;
	} else if (!haslo.equals(other.haslo))
		return false;
	if (idAdres == null) {
		if (other.idAdres != null)
			return false;
	} else if (!idAdres.equals(other.idAdres))
		return false;
	if (idKontakt != other.idKontakt)
		return false;
	if (idPracownika != other.idPracownika)
		return false;
	if (imie == null) {
		if (other.imie != null)
			return false;
	} else if (!imie.equals(other.imie))
		return false;
	if (login == null) {
		if (other.login != null)
			return false;
	} else if (!login.equals(other.login))
		return false;
	if (nazwisko == null) {
		if (other.nazwisko != null)
			return false;
	} else if (!nazwisko.equals(other.nazwisko))
		return false;
	if (uprawnienia != other.uprawnienia)
		return false;
	return true;
}















}
