package edu.icet.demo.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.demo.dto.User;
import edu.icet.demo.entity.UserEntity;
import edu.icet.demo.repository.UserRepository;
import edu.icet.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ObjectMapper objectMapper;

    @Override
    public boolean login(User user) {
        return false;
    }

    @Override
    public String register(User user) {
        userRepository.save(objectMapper.convertValue(user, UserEntity.class));
        return "OK";
    }
}
