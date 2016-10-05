/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public interface FilmDaocrud extends CrudRepository<Film, Long>{
    public Film findoneByTitreandannee (String t, Long a);
    public  List<Film> findAllbyannee (long annee);   
    
}
