package de.sweetpeakdesign.com.order.domain.user.service;

import de.sweetpeakdesign.com.order.domain.user.aggregate.User;
import de.sweetpeakdesign.com.order.domain.user.repository.UserRepository;
import de.sweetpeakdesign.com.order.domain.user.vo.UserEmail;
import de.sweetpeakdesign.com.order.domain.user.vo.UserPublicId;
import de.sweetpeakdesign.com.order.infrastructure.secondary.entity.UserEntity;

import java.util.Optional;

public class UserReader {

  private final UserRepository userRepository;

  public UserReader(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public Optional<User> getByEmail(UserEmail userEmail) {
    return userRepository.getOneByEmail(userEmail);
  }

  public Optional<User> getByPublicId(UserPublicId userPublicId) {
    return userRepository.get(userPublicId);
  }
}
