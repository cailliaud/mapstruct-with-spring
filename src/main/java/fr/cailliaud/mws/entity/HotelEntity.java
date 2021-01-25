package fr.cailliaud.mws.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

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

  /**
   * Ajoute le responsable de l'hôtel
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
