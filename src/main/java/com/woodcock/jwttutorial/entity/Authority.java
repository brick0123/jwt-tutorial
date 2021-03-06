package com.woodcock.jwttutorial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public class Authority {

  protected Authority() {
  }

  @Id
  @Column(name = "authority_name", length = 50)
  private String name;
}
