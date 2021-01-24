package fr.cailliaud.mws.controller;

import fr.cailliaud.mws.dto.Responsable;
import fr.cailliaud.mws.service.ResponsableService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api/responsables")
@RequiredArgsConstructor
public class ResponsableController {

  private final ResponsableService responsableService;

  @GetMapping
  public Set<Responsable> findAll() {
    return responsableService.findAll();
  }
}
