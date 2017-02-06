package com.info.xpacknow.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity

@Table(name = "Produkty")
public class Product {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_Produkty" )
	private long idProdukty;
	
	//@NotEmpty
//	@NotNull
	@Column(name="Nazwa")
//	@Length(max=45)
	private String nazwa;
//	@NotNull
	@Column(name="Cena")
//	@Length(max=45)
	private BigDecimal cenaZaSztuke;
//	@NotNull
	@Column(name="Opis")
//	@Length(max=45)
	private String opis;
	
	//@NotNull
	@Column(name="Sztuk")
//	@Length(max=45)
	private long sztukWMagazynie;
	
//	@NotNull
	@Column(name="Stan")
//	@Length(max=45)
	private String stan;
	
	
	@Transient
	private MultipartFile zdjecie;
	
	
	
	
	public Product() {
		super();
}

	public Product(long idProdukty, String nazwa, BigDecimal cenaZaSztuke) {
		this.idProdukty = idProdukty;
		this.nazwa = nazwa;
		this.cenaZaSztuke = cenaZaSztuke;
	}

	
	

	public MultipartFile getZdjecie() {
		return zdjecie;
	}

	public void setZdjecie(MultipartFile zdjecie) {
		this.zdjecie = zdjecie;
	}

	public long getIdProdukty() {
		return idProdukty;
	}

	public void setIdProdukty(long idProdukty) {
		this.idProdukty = idProdukty;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public BigDecimal getCenaZaSztuke() {
		return cenaZaSztuke;
	}

	public void setCenaZaSztuke(BigDecimal cenaZaSztuke) {
		this.cenaZaSztuke = cenaZaSztuke;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public long getSztukWMagazynie() {
		return sztukWMagazynie;
	}

	public void setSztukWMagazynie(long sztukWMagazynie) {
		this.sztukWMagazynie = sztukWMagazynie;
	}

	public String getStan() {
		return stan;
	}

	public void setStan(String stan) {
		this.stan = stan;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cenaZaSztuke == null) ? 0 : cenaZaSztuke.hashCode());
		result = prime * result + (int) (idProdukty ^ (idProdukty >>> 32));
		result = prime * result + ((nazwa == null) ? 0 : nazwa.hashCode());
		result = prime * result + ((opis == null) ? 0 : opis.hashCode());
		result = prime * result + ((stan == null) ? 0 : stan.hashCode());
		result = prime * result + (int) (sztukWMagazynie ^ (sztukWMagazynie >>> 32));
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
		Product other = (Product) obj;
		if (cenaZaSztuke == null) {
			if (other.cenaZaSztuke != null)
				return false;
		} else if (!cenaZaSztuke.equals(other.cenaZaSztuke))
			return false;
		if (idProdukty != other.idProdukty)
			return false;
		if (nazwa == null) {
			if (other.nazwa != null)
				return false;
		} else if (!nazwa.equals(other.nazwa))
			return false;
		if (opis == null) {
			if (other.opis != null)
				return false;
		} else if (!opis.equals(other.opis))
			return false;
		if (stan == null) {
			if (other.stan != null)
				return false;
		} else if (!stan.equals(other.stan))
			return false;
		if (sztukWMagazynie != other.sztukWMagazynie)
			return false;
		return true;
	}

	
	
	
	
	
	
	
	
	
}
