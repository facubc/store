package com.store.v1.model.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "USERS")
@Getter
@Setter
public class User {

  @Column(name = "FIRST_NAME", nullable = false)
  private String firsName;

  @Column(name = "LAST_NAME", nullable = false)
  private String lastName;

  @Column(name = "EMAIL", nullable = false)
  private String email;

  @Column(name = "PASSWORD", nullable = false)
  private String password;

  @Column(name = "SOFT_DELETE")
  private Boolean softDelete = false;

  @OneToMany
  @JoinColumn(name = "ROLE_ID", nullable = false)
  private List<Role> roles;
}
