package fr.cailliaud.mws.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "hotel")
@SequenceGenerator(
    name = "id_generateur_sequence",
    sequenceName = "hotel_sequence",
    allocationSize = 1)
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class HotelEntity extends BaseEntity {

  @Column(nullable = false)
  private String nom;

  @OneToOne(mappedBy = "hotel", fetch = FetchType.LAZY)
  @ToString.Exclude
  private ResponsableEntity responsable;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "hotel_id")
  @Setter(AccessLevel.NONE)
  private Set<ChatEntity> chats = new HashSet<>();

  /** AJouter un nouveau chat comme pensionnaire de l'hôtel */
  public void addChat(ChatEntity chatEntity) {}

  /**
   * Méthode pour définir le responsable de l'hôtel
   *
   * @param responsable Responsable de l'hôtel
   */
  public void setResponsable(ResponsableEntity responsable) {
    if (responsable == null) {
      if (this.responsable != null) {
        this.responsable.setHotel(null);
      }
    } else {
      responsable.setHotel(this);
    }
    this.responsable = responsable;
  }
}
