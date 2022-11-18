package com.pi.booking.hotel.room.model.service;

import com.pi.booking.hotel.room.model.dto.RoleDTO;

import java.util.List;

public interface IRoleService {

    public List<RoleDTO> findAll();

    public RoleDTO save(RoleDTO role);

    public RoleDTO update(RoleDTO role);

    public RoleDTO delete(RoleDTO role);
}
