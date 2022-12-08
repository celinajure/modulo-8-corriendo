
package com.Celi.Springboot.repository;

import com.Celi.Springboot.entity.HabilidadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabilidadRepository extends JpaRepository <HabilidadEntity, Long>{
    
}
