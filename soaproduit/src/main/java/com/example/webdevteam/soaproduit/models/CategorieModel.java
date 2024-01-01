package com.example.webdevteam.soaproduit.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Categories")
public class CategorieModel {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_ID")
    private Long categorieId; 
    
    //private Long id;

    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "categorie" , cascade = CascadeType.ALL)     // Annotation pour définir une relation "un-à-plusieurs" avec ProductModel
    // Cascade permet de propager les opérations (par exemple, la suppression) aux entités associées) 
    private List<ProductModel> products;
    
    public void addProduct(ProductModel product) {
        if (products == null) {
            products = new ArrayList<>();
        }
        products.add(product);
        product.setCategorie(this); // Make sure to set the category in the product as well
    }

    public CategorieModel() {
    }

    public CategorieModel(Long categorieId, String name, List<ProductModel> products) {
    	this.categorieId = categorieId;
        this.name = name;
        this.products = products;
    }

    public Long getCategorieId() {
		return categorieId;
	}

	public void setCategorieId(Long categorieId) {
		this.categorieId = categorieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ProductModel> getProducts() {
		return products;
	}

	public void setProducts(List<ProductModel> products) {
		this.products = products;
	}

	@Override
    public String toString() {
        return "CategorieModel [categorieId=" + categorieId + ", name=" + name + ", products=" + products + "]";
    }
}
