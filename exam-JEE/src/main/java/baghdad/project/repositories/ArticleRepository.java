package baghdad.project.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import baghdad.project.entities.Article;
import baghdad.project.entities.Categorie;



@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
	
List<Article> findByCategorie(Categorie categorie);
	
List<Article> findByDateArticles(Date dateDebut, Date dateFin);
	

}
