package raki.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import raki.entities.Article;
import raki.entities.Categorie;




public interface ArticleRepository extends JpaRepository<Article, Long>{
	
	@Query("select a from Article a where a.categorie = :c ")
	List<Article> getAllArticleJPQLByCategorie(@Param("c") Categorie categorie);

	
	List<Article> findByDateProductionBetween(Date dateDebut, Date dateFin);
}
