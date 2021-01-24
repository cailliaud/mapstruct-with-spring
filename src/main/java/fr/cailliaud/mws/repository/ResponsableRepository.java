package fr.cailliaud.mws.repository;

import fr.cailliaud.mws.entity.ResponsableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsableRepository extends JpaRepository<ResponsableEntity, Long> {}
