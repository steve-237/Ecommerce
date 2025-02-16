package de.sweetpeakdesign.com.order.domain.vo;

import de.sweetpeakdesign.com.shared.error.domain.Assert;
import org.jilt.Builder;

@Builder
public record UserAddressToUpdate(PublicId userPublicId, UserAddress userAddress) {

  public UserAddressToUpdate {
    Assert.field("userPublicId", userPublicId).notNull();
    Assert.field("userAddress", userAddress).notNull();
  }
}
