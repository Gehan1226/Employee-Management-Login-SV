package edu.icet.demo.repository;

import edu.icet.demo.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<UserEntity, Long> {
}
