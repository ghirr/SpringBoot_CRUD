package com.example.webdevteam.soaproduit.services;

import java.util.List;

import com.example.webdevteam.soaproduit.models.ProductModel;


public interface ProductService {
	
	// Méthode pour obtenir la liste de tous les produits
    public List<ProductModel> getAllProducts();

    // Méthode pour obtenir un produit spécifique par son identifiant
    public ProductModel getProductById(Long id);

    // Méthode pour supprimer un produit en fonction de son identifiant
    public void deleteProductById(Long id);

    // Méthode pour ajouter un nouveau produit
    public ProductModel addProduct(ProductModel p);

    // Méthode pour mettre à jour les informations d'un produit existant
    public ProductModel updateProduct(ProductModel p);

}
