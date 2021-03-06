package fr.cailliaud.mws.service;

import fr.cailliaud.mws.dto.Chat;
import fr.cailliaud.mws.mapper.ConversionServiceAdapter;
import fr.cailliaud.mws.repository.ChatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ChatService {

  private final ChatRepository chatRepository;
  private final ConversionServiceAdapter conversionServiceAdapter;

  @Transactional(readOnly = true)
  public Set<Chat> findChats() {
    return chatRepository.findAll().stream()
        .map(conversionServiceAdapter::mapChatEntityToChat)
        .collect(Collectors.toSet());
  }

  @Transactional(readOnly = true)
  public Set<Chat> findChatParPrenom(String prenom) {
    return chatRepository.findByPrenomIgnoreCase(prenom).stream()
        .map(conversionServiceAdapter::mapChatEntityToChat)
        .collect(Collectors.toSet());
  }
}
