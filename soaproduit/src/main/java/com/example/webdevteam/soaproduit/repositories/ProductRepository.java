package com.example.webdevteam.soaproduit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.webdevteam.soaproduit.models.ProductModel;

@Repository      // ywafarli fi des queries hadhrin
public interface ProductRepository extends JpaRepository<ProductModel, Long> {
    List<ProductModel> findByCategorie_CategorieId(Long categorieId);
	//   ProductModel indique que cette interface est associée à l'entité ProductModel que vous souhaitez persister dans la base de données.
		//   Long indique le type de la clé primaire de l'entité ProductModel. Dans ce cas, il s'agit d'une clé primaire de type Long.

}
