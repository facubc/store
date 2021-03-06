package com.store.v1.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "SLIDES")
@Getter
@Setter
public class Slide {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_SLIDE")
  private Long slideId;

  @Column(name = "URL_IMAGE", nullable = false)
  private String imageUrl;

  @Column(name = "TEXT")
  private String text;

}
