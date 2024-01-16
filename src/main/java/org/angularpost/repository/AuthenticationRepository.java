package org.angularpost.repository;

import org.angularpost.model.AuthenticationInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthenticationRepository extends JpaRepository<AuthenticationInfo, Long> {

}
