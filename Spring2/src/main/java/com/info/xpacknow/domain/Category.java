package com.info.xpacknow.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "Kategoria")
public class Category {

	
	
	@Id
	@TableGenerator(name="generatorkategorie", table="hibernate_klienci", valueColumnName="wartosc",pkColumnName="id", initialValue=0)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="generatorkategorie")
	@Column(name = "ID_Kategoria")
	private int idKategoria;

	@Column(name = "Nazwa_Kategori")
	@Length(max = 45)
	private String nazwaKategoria;
	
	@OneToMany
	@JoinColumn(name= "Produkty")
	private List<Product> produktyKtegoria;
	
	
	

	public List<Product> getProdukty() {

		return produktyKtegoria;
	}

	public void setProdukty(List<Product> product) {
		this.produktyKtegoria = product;
	}

	public int getIdKategoria() {
		return idKategoria;
	}

	public void setIdKategoria(int idKategoria) {
		this.idKategoria = idKategoria;
	}

	public String getNazwaKategoria() {
		return nazwaKategoria;
	}

	public void setNazwaKategoria(String nazwaKategoria) {
		this.nazwaKategoria = nazwaKategoria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idKategoria;
		result = prime * result + ((nazwaKategoria == null) ? 0 : nazwaKategoria.hashCode());
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
		Category other = (Category) obj;
		if (idKategoria != other.idKategoria)
			return false;
		if (nazwaKategoria == null) {
			if (other.nazwaKategoria != null)
				return false;
		} else if (!nazwaKategoria.equals(other.nazwaKategoria))
			return false;
		return true;
	}

}
