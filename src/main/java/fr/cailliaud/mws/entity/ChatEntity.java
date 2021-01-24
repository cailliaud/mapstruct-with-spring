package fr.cailliaud.mws.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "chat")
@SequenceGenerator(
    name = "id_generateur_sequence",
    sequenceName = "chat_sequence",
    allocationSize = 1)
@Getter
@Setter
@ToString(callSuper = true)
public class ChatEntity extends BaseEntity {

  private String prenom;
  private short age;
  private String race;
}
