package com.example.demo2.repositories;

import com.example.demo2.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface UsuarioRepositori extends CrudRepository<UsuarioModel, Long> {
    public abstract ArrayList<UsuarioModel> findByprioridad(Integer prioridad);
}
