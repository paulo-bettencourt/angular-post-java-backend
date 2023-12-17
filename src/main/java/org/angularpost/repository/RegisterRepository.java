package org.angularpost.repository;

import org.angularpost.model.RegisterInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<RegisterInfo, Long> {

}
