package com.woodcock.jwttutorial.entity;

import com.woodcock.jwttutorial.entity.UserAuthority.UserAuthorityId;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@IdClass(UserAuthorityId.class)
public class UserAuthority {

  @NoArgsConstructor
  @EqualsAndHashCode
  public static class UserAuthorityId implements Serializable {
    private Long user;
    private String authority;
  }

  @Id
  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;


  @Id
  @ManyToOne
  @JoinColumn(name = "authority_name")
  private Authority authority;
}
