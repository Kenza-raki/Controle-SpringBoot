package raki.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import ma.projet.dao.IDao;
import raki.entities.Article;
import raki.entities.Categorie;
import raki.repositories.ArticleRepository;



@Service
public class ArticleService implements IDao<Article>{
	@Autowired
    ArticleRepository articleRepository;
 
 @Override
    public Article create(Article o) {
       return articleRepository.save(o);
    }

    @Override
    public List<Article> findAll() {
        return articleRepository.findAll();
    }

    @Override
    public Article update(Article o) {
        return articleRepository.save(o);
    }

    @Override
    public boolean delete(Article o) {
        try {
            articleRepository.delete(o);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    @Override
    public Article findById(Long id) {
        return articleRepository.findById(id).orElse(null);
    }
    
    public List<Article> getAllArticleJPQLByCategorie(Categorie categorie){
    	
    	return articleRepository.getAllArticleJPQLByCategorie(categorie);
    }

    public List<Article> findByDateProductionBetween(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateDebut,@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateFin) {
        return articleRepository.findByDateProductionBetween(dateDebut, dateFin);
    }

}
