package baghdad.project.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import baghdad.project.entities.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

	//List<Categorie> findByCategorie(Categorie categorie);

}
