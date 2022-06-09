package ec.edu.espe.arquitectura.examen.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import ec.edu.espe.arquitectura.examen.model.UsuarioEspacio;
import ec.edu.espe.arquitectura.examen.model.UsuarioEspacioPK;

public interface UsuarioEspacioRepository extends Repository<UsuarioEspacio, UsuarioEspacioPK> {
    UsuarioEspacio findByPkCodUsuarioAndPkCodEspacio(Integer codUsuario, Integer codEspacio);
    List<UsuarioEspacio> findByPkCodUsuarioOrderByPkCodEspacio(Integer codUsuario);
}

