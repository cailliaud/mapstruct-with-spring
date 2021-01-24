package fr.cailliaud.mws.repository;

import fr.cailliaud.mws.entity.ChatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ChatRepository extends JpaRepository<ChatEntity, Long> {

  Set<ChatEntity> findByPrenomIgnoreCase(String prenom);
}
