package com.info.xpacknow.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.hibernate.validator.constraints.Length;


@Entity
@Table(name = "Klienci")
public class Client {

	
	
	
	
	@Id
	@TableGenerator(name="generatorklienci", table="hibernate_klienci", valueColumnName="wartosc",pkColumnName="id", initialValue=0)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="generatorklienci")
	@Column(name="ID_Klient")
	private int idKlient;
	
	@Column(name="Login")
	@Length(max=45)	
	private String login;
	@Column(name="Hasło")
	@Length(max=128)	
	private String haslo;
	@Column(name="Imie")
	@Length(max=45)	
	private String imie;
	@Column(name="Nazwisko")
	@Length(max=45)	
	private String nazwisko;
	@Length(max=45)	
	private String regon;
	@Length(max=45)	
	private String nip;
	@Length(max=45)	
	private String nazwaFirmy; 
	@Column(name="Rodzaj")
	@Length(max=45)	
	private String rodzajKlient;

	
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ID_Kontakty")
	private Contact idKontakty;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ID_Adres")
	private Adress idAdres;

	////////////////////////////////////////////////////
	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name="klienci_roles",
		joinColumns = {@JoinColumn(name="klienci_id", referencedColumnName="ID_Klient")},
		inverseJoinColumns = {@JoinColumn(name="role_id", referencedColumnName="id")}
	)
	private Role role;

	
	
	

	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}
////////////////////

	public int getIdKlient() {
		return idKlient;
	}


	public void setIdKlient(int idKlient) {
		this.idKlient = idKlient;
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


	public String getRegon() {
		return regon;
	}


	public void setRegon(String regon) {
		this.regon = regon;
	}


	public String getNip() {
		return nip;
	}


	public void setNip(String nip) {
		this.nip = nip;
	}


	public String getNazwaFirmy() {
		return nazwaFirmy;
	}


	public void setNazwaFirmy(String nazwaFirmy) {
		this.nazwaFirmy = nazwaFirmy;
	}


	public String getRodzajKlient() {
		return rodzajKlient;
	}


	public void setRodzajKlient(String rodzajKlient) {
		this.rodzajKlient = rodzajKlient;
	}


	public Contact getIdKontakty() {
		return idKontakty;
	}


	public void setIdKontakty(Contact idKontakty) {
		this.idKontakty = idKontakty;
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
		result = prime * result + ((haslo == null) ? 0 : haslo.hashCode());
		result = prime * result + ((idAdres == null) ? 0 : idAdres.hashCode());
		result = prime * result + idKlient;
		result = prime * result + ((idKontakty == null) ? 0 : idKontakty.hashCode());
		result = prime * result + ((imie == null) ? 0 : imie.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((nazwaFirmy == null) ? 0 : nazwaFirmy.hashCode());
		result = prime * result + ((nazwisko == null) ? 0 : nazwisko.hashCode());
		result = prime * result + ((nip == null) ? 0 : nip.hashCode());
		result = prime * result + ((regon == null) ? 0 : regon.hashCode());
		result = prime * result + ((rodzajKlient == null) ? 0 : rodzajKlient.hashCode());
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
		Client other = (Client) obj;
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
		if (idKlient != other.idKlient)
			return false;
		if (idKontakty == null) {
			if (other.idKontakty != null)
				return false;
		} else if (!idKontakty.equals(other.idKontakty))
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
		if (nazwaFirmy == null) {
			if (other.nazwaFirmy != null)
				return false;
		} else if (!nazwaFirmy.equals(other.nazwaFirmy))
			return false;
		if (nazwisko == null) {
			if (other.nazwisko != null)
				return false;
		} else if (!nazwisko.equals(other.nazwisko))
			return false;
		if (nip == null) {
			if (other.nip != null)
				return false;
		} else if (!nip.equals(other.nip))
			return false;
		if (regon == null) {
			if (other.regon != null)
				return false;
		} else if (!regon.equals(other.regon))
			return false;
		if (rodzajKlient == null) {
			if (other.rodzajKlient != null)
				return false;
		} else if (!rodzajKlient.equals(other.rodzajKlient))
			return false;
		return true;
	}
	
	
	
	
	


		
	
	
	
	
	
	
	
	
}
