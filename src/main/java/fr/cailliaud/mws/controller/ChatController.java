package fr.cailliaud.mws.controller;

import fr.cailliaud.mws.dto.Chat;
import fr.cailliaud.mws.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/api/chats")
@RequiredArgsConstructor
public class ChatController {

  private final ChatService chatService;

  @GetMapping
  public Set<Chat> findAll(
      @RequestParam(value = "prenom", required = false) Optional<String> prenom) {
    return prenom.map(chatService::findChatParPrenom).orElseGet(chatService::findChats);
  }
}
