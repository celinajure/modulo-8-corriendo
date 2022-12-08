
package com.Celi.Springboot.repository;

import com.Celi.Springboot.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository <PersonaEntity, Long>{
    
}
