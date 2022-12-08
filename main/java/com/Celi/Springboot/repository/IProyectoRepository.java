
package com.Celi.Springboot.repository;

import com.Celi.Springboot.entity.ProyectoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectoRepository extends JpaRepository <ProyectoEntity, Long>{
    
}
