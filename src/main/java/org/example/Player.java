package org.example;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "players")
public class Player {
  private Long player_id;
  private String short_name;
  private String long_name;
  private String player_positions;

  public Player(Long player_id, String short_name, String long_name, String player_positions) {
    this.player_id = player_id;
    this.short_name = short_name;
    this.long_name = long_name;
    this.player_positions = player_positions;
  }

  public Long getPlayer_id() {
    return player_id;
  }

  public String getShort_name() {
    return short_name;
  }

  public String getLong_name() {
    return long_name;
  }

  public String getPlayer_positions() {
    return player_positions;
  }
}
