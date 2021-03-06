package fr.cailliaud.mws.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
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
@EqualsAndHashCode(callSuper = true)
public class ChatEntity extends BaseEntity {

  @Column(nullable = false)
  private String prenom;

  @Column(nullable = false)
  private short age;

  @Column(nullable = false)
  private String race;
}
