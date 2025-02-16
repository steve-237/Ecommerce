package de.sweetpeakdesign.com.order.domain.user.vo;

import de.sweetpeakdesign.com.shared.error.domain.Assert;

public record UserImageUrl(String value) {

  public UserImageUrl {
    Assert.field("value", value).maxLength(1000);
  }
}
