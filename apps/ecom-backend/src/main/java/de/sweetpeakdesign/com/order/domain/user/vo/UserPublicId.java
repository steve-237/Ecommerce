package de.sweetpeakdesign.com.order.domain.user.vo;

import de.sweetpeakdesign.com.shared.error.domain.Assert;

import java.util.UUID;

public record UserPublicId(UUID value) {

  public UserPublicId {
    Assert.notNull("value", value);
  }
}
