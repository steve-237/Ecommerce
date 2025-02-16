package de.sweetpeakdesign.com.order.domain.user.vo;

import de.sweetpeakdesign.com.shared.error.domain.Assert;

public record UserFirstname(String value) {

  public UserFirstname {
    Assert.field("value", value).maxLength(255);
  }
}
