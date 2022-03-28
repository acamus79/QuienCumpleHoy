package com.aec.cumple.repository;

import com.aec.cumple.model.Cumple;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author acamus
 */
public interface CumpleRepository extends JpaRepository<Cumple, String>{
    
    @Query("SELECT c from Cumple c WHERE c.dia = :dia AND c.mes = :mes")
    List<Cumple> buscaCumplesHoy(@Param("mes") int mes, @Param("dia") int dia);
    
}
