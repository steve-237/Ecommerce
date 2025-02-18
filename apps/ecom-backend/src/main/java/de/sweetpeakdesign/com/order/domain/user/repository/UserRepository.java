package de.sweetpeakdesign.com.order.domain.user.repository;

import de.sweetpeakdesign.com.order.domain.user.aggregate.User;
import de.sweetpeakdesign.com.order.domain.user.vo.UserAddressToUpdate;
import de.sweetpeakdesign.com.order.domain.user.vo.UserEmail;
import de.sweetpeakdesign.com.domain.user.vo.UserPublicId;

import java.util.Optional;

public interface UserRepository {

  void save(User user);

  Optional<User> get(UserPublicId userPublicId);

  Optional<User> getOneByEmail(UserEmail userEmail);

  void updateAddress(UserPublicId userPublicId, UserAddressToUpdate userAddress);

}
