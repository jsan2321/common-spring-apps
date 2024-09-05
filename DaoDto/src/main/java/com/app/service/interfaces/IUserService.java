package com.app.service.interfaces;

import com.app.presentation.dto.UserDTO;

import java.util.List;

public interface IUserService {
    List<UserDTO> findAll();
    UserDTO findById(Long id);
    UserDTO createUser(UserDTO userDTO);
    UserDTO updateUser(UserDTO userDTO, Long id);
    String deleteUser(Long id);
}
