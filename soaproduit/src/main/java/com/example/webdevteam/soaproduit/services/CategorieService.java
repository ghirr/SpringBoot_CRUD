package com.example.webdevteam.soaproduit.services;

import java.util.List;

import com.example.webdevteam.soaproduit.models.CategorieModel;
import com.example.webdevteam.soaproduit.models.ProductModel;

public interface CategorieService {
    List<CategorieModel> getAllCategories();

    CategorieModel getCategoryById(Long categorieId);

    CategorieModel addCategory(CategorieModel categorie);

    void deleteCategoryById(Long categorieId);

    List<ProductModel> getCategoryProducts(Long categoryID);

    CategorieModel updateCategory(CategorieModel updatedCategory);
}
