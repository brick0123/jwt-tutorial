package com.woodcock.jwttutorial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
@Getter
@AllArgsConstructor
public class User {

  protected User() {
  }

  @Id
  @Column(name = "user_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long userId;

  @Column(name = "username", length = 50)
  private String username;

  @Column(name = "password", length = 100)
  private String password;

  @Column(name = "nickname", length = 50, unique = true)
  private String nickname;

  @Column(name = "activated")
  private boolean activated;
}
