package raki.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import raki.entities.Article;
import raki.entities.Categorie;
import raki.service.ArticleService;

@RestController
@RequestMapping("/api/v1/article")
public class ArticleController {

	 @Autowired
	private ArticleService service;
	 
	 @GetMapping
	    public List<Article> findAllArticleessseurs() {
	        return service.findAll();
	    }
	
	 @GetMapping("/{id}")
	    public ResponseEntity<Object> findById(@PathVariable Long id) {
	        Article article = service.findById(id);
	        if (article == null) {
	            return new ResponseEntity<Object>("Articleessseur avec Id " + id + " nexiste pas", HttpStatus.BAD_REQUEST);

	        } else {
	            return ResponseEntity.ok(article);
	        }
	    }
	 
	 @PostMapping
	    public Article creatArticleessseur(@RequestBody Article article) {
	        article.setId(0L);
	        return service.create(article);
	    }
	 
	  @DeleteMapping("/{id}")
	    public ResponseEntity<Object> deletArticle(@PathVariable Long id) {
	        Article article = service.findById(id);
	        if (article == null) {
	            return new ResponseEntity<Object>("Articleessseur avec Id " + id + " nexiste pas", HttpStatus.BAD_REQUEST);
	        } else {
	            service.delete(article);
	            return ResponseEntity.ok("article avec id " + id + " suprime");
	        }
	    }
	  @PutMapping("/{id}")
	    public ResponseEntity<Object> updateArticleessseur(@PathVariable Long id, @RequestBody Article newarticle) {

	        Article oldArticle = service.findById(id);
	        if (oldArticle == null) {
	            return new ResponseEntity<Object>("articleesseur avec id" + id + "nexiste pas ", HttpStatus.BAD_REQUEST);

	        } else {
	            newarticle.setId(id);
	            return ResponseEntity.ok(service.update(newarticle));
	        }
	    }
	  
	  @GetMapping("/categorie")
	  public List<Article> getAllArticleJPQLByCategorie(Categorie categorie){
	    	
	    	return service.getAllArticleJPQLByCategorie(categorie);
	    }
	  
	  @GetMapping("/filterByDate")
	    public List<Article> findByDateProductionBetween(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateDebut,@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateFin) {
	        return service.findByDateProductionBetween(dateDebut, dateFin);
	    }
}
