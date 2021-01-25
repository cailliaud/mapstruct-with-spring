package fr.cailliaud.mws.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "responsable")
@SequenceGenerator(
    name = "id_generateur_sequence",
    sequenceName = "responsable_sequence",
    allocationSize = 1)
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ResponsableEntity extends BaseEntity {
  @Column(nullable = false)
  private String prenom;

  @Column(nullable = false)
  private String nom;

  @Column(nullable = false)
  private String email;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "hotel_id", nullable = false)
  @ToString.Exclude
  private HotelEntity hotel;
}
