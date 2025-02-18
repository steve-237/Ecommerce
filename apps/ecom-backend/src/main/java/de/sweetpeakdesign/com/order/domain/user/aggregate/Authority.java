package de.sweetpeakdesign.com.order.domain.user.aggregate;

import de.sweetpeakdesign.com.order.domain.user.vo.AuthorityName;
import de.sweetpeakdesign.com.shared.error.domain.Assert;
import org.jilt.Builder;

@Builder
public class Authority {

  private AuthorityName name;

  public Authority(AuthorityName authorityName) {
    Assert.notNull("name", authorityName);
    this.name = authorityName;
  }

  public AuthorityName getName() {
    return name;
  }
}
