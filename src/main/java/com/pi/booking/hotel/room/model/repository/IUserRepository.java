package com.pi.booking.hotel.room.model.repository;

import com.pi.booking.hotel.room.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserEntity,Long> {

    public UserEntity findByCorreo(String correo);
}
