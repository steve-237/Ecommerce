package de.sweetpeakdesign.com.order.infrastructure.primary;

import de.sweetpeakdesign.com.order.domain.user.aggregate.Authority;
import org.jilt.Builder;

import java.util.Set;
import java.util.stream.Collectors;

@Builder
public record RestAuthority(String name) {

  public static Set<String> fromSet(Set<Authority> authorities) {
    return authorities.stream()
      .map(authority -> authority.getName().name())
      .collect(Collectors.toSet());
  }

}
