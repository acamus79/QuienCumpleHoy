
package com.aec.cumple.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author acamus
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cumple implements Serializable {
    
    @Id @GeneratedValue
    private Integer id;
    private char sexo;
    private String nombres;
    private String apellidos;
    private int dia;
    private int mes;
    private int anio;
    private String email;
            
    
}
