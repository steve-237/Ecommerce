package de.sweetpeakdesign.com.order.application;

import de.sweetpeakdesign.com.order.domain.user.aggregate.User;
import de.sweetpeakdesign.com.order.domain.user.repository.UserRepository;
import de.sweetpeakdesign.com.order.domain.user.service.UserReader;
import de.sweetpeakdesign.com.order.domain.user.service.UserSynchronizer;
import de.sweetpeakdesign.com.order.domain.user.vo.UserAddressToUpdate;
import de.sweetpeakdesign.com.order.domain.user.vo.UserEmail;
import de.sweetpeakdesign.com.order.infrastructure.secondary.service.kinde.KindeService;
import de.sweetpeakdesign.com.shared.authentication.application.AuthenticatedUser;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsersApplicationService {

  private final UserSynchronizer userSynchronizer;
  private final UserReader userReader;

  public UsersApplicationService(UserRepository userRepository, KindeService kindeService) {
    this.userSynchronizer = new UserSynchronizer(userRepository, kindeService);
    this.userReader = new UserReader(userRepository);
  }

  @Transactional
  public User getAuthenticatedUserWithSync(Jwt jwtToken, boolean forceResync) {
    userSynchronizer.syncWithIdp(jwtToken, forceResync);
    return userReader.getByEmail(new UserEmail(AuthenticatedUser.username().get()))
      .orElseThrow();
  }

  @Transactional(readOnly = true)
  public User getAuthenticatedUser() {
    return userReader.getByEmail(new UserEmail(AuthenticatedUser.username().get()))
      .orElseThrow();
  }

  @Transactional
  public void updateAddress(UserAddressToUpdate userAddressToUpdate) {
    userSynchronizer.updateAddress(userAddressToUpdate);
  }

}
