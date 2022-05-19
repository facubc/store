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
@Table(name = "ORGANIZATIONS")
@Getter
@Setter
public class Organization {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_ORGANIZATION")
  private Long organizationId;

  @Column(name = "NAME", nullable = false)
  private String name;

  @Column(name = "IMAGE", nullable = false)
  private String image;

  @Column(name = "ABOUT_US_TEXT")
  private String aboutUsText;

  @Column(name = "ADDRESS")
  private String address;

  @Column(name = "EMAIL", nullable = false)
  private String email;

  @Column(name = "FACEBOOK_URL")
  private String facebook;

  @Column(name = "INSTAGRAM_URL")
  private String instagram;

  @Column(name = "PINTEREST_URL")
  private String pinterest;

  @Column(name = "PHONE")
  private Integer phone;
}
