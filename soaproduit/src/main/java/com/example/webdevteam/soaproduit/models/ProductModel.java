package com.example.webdevteam.soaproduit.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity   //     to find (generate) this table in the DB/ aandou table fl DB MatchModel
@Table(name="Products")    // set the name of the model in the DB
public class ProductModel {
	@Id      // ceci indique que id est la clé primaire de l'entité MatchModel
	@GeneratedValue(strategy = GenerationType.IDENTITY)    //   @GeneratedValue spécifie que la valeur de la clé primaire sera générée automatiquement 
	//   GenerationType.IDENTITY auto increment
	@Column(name="product_ID")      //   permet de spécifier le nom de la colonne correspondant à cet attribut dans la table de la base de données.
	private Long id;
	private String name;
	private String libelle;
	private float price;
	
	@ManyToOne    // La relation entre ProductModel et CategorieModel doit être annotée avec @ManyToOne et @JoinColumn
    @JoinColumn(name = "category_ID")   // Nom de la colonne de clé étrangère dans la table des produits
    private CategorieModel categorie;
	
	public ProductModel() {

	}

	public ProductModel(Long id, String name, String libelle, float price, CategorieModel categorie) {
		this.id = id;
		this.name = name;
		this.libelle = libelle;
		this.price = price;
		this.categorie = categorie;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public CategorieModel getCategorie() {
        return categorie;
    }

    public void setCategorie(CategorieModel categorie) {
        this.categorie = categorie;
    }

	@Override
	public String toString() {
		return "ProductModel [id=" + id + ", name=" + name + ", libelle=" + libelle + ", price=" + price
				+ ", categorie=" + categorie + "]";
	}
	
	
	
	

}
