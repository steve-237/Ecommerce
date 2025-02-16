package de.sweetpeakdesign.com.order.domain.user.vo;

import de.sweetpeakdesign.com.shared.error.domain.Assert;

public record UserEmail(String value) {

  public UserEmail {
    Assert.field("value", value).maxLength(255);
  }
}
