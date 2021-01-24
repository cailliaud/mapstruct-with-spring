package fr.cailliaud.mws.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@ToString
public class Hotel {

  private String nom;
  private Responsable responsable;
  private Set<Chat> pensionnaires;
  private boolean estComplet;
}
