package com.pi.booking.hotel.room.model.service;

import com.pi.booking.hotel.room.model.dto.UserDTO;
import com.pi.booking.hotel.room.model.entity.UserEntity;

import java.util.List;

public interface IUserService {

    public List<UserDTO> findAll();

    public UserDTO save(UserDTO user);

    public UserDTO update(UserDTO user);

    public UserDTO delete(UserDTO user);

    public UserDTO findByCorreo(String correo);
}
