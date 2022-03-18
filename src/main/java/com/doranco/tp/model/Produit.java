package com.doranco.tp.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;

@Entity
public class Produit  implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true, nullable = false)
	private String titre;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "id_categorie",referencedColumnName = "id")
	private Categorie categorie;
	
	private String description;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 10,nullable = false)
	private Livraison livraison;

	public Produit(Long id, String titre, Categorie categorie, String description, Livraison livraison) {
		super();
		this.id = id;
		this.titre = titre;
		this.categorie = categorie;
		this.description = description;
		this.livraison = livraison;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", titre=" + titre + ", categorie=" + categorie + ", description=" + description
				+ ", livraison=" + livraison + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Livraison getLivraison() {
		return livraison;
	}

	public void setLivraison(Livraison livraison) {
		this.livraison = livraison;
	}
	
	
	

}
