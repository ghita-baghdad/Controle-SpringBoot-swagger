package baghdad.project.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import baghdad.project.entities.Article;
import baghdad.project.entities.Categorie;



@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
	
List<Article> findByCategorie(Categorie categorie);
	
@Query("SELECT a FROM Article a WHERE a.dateProduction BETWEEN :dateDebut AND :dateFin")
List<Article> findByDateProductionBetween(@Param("dateDebut") Date dateDebut, @Param("dateFin") Date dateFin);

	

}
