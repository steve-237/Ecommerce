package de.sweetpeakdesign.com.order.domain.vo;

import de.sweetpeakdesign.com.shared.error.domain.Assert;

public record AuthorityName(String name) {

  public AuthorityName {
    Assert.field("name", name).notNull();
  }
}
