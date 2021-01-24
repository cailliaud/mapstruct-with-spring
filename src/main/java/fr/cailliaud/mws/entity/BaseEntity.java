package fr.cailliaud.mws.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@MappedSuperclass
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public abstract class BaseEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generateur_sequence")
  @Column(name = "id", updatable = false, nullable = false)
  @Getter
  @EqualsAndHashCode.Include
  private Long id;

  @Column(name = "creation_time", updatable = false, nullable = false)
  @Getter
  private Timestamp creationTime;

  @Column(name = "modification_time")
  @Getter
  private Timestamp modificationTime;

  @Version @Getter private int version;

  @PreUpdate
  public final void preUpdate() {
    modificationTime = new Timestamp(System.currentTimeMillis());
  }

  @PrePersist
  public final void prePersist() {
    creationTime = new Timestamp(System.currentTimeMillis());
    modificationTime = new Timestamp(System.currentTimeMillis());
  }
}
