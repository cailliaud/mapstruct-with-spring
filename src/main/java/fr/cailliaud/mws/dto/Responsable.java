package fr.cailliaud.mws.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Responsable {
  private String prenom;
  private String nom;
  private String mail;
}
