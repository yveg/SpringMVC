/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Lien;

/**
 *
 * @author admin
 */
public interface LienDAOcrud extends CrudRepository<Lien, Long>{
    
}
