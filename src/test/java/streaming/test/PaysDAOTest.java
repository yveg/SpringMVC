/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import streaming.spring.SpringConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import streaming.dao.PaysDAO;
//import streaming.dao.FilmDAO;
import streaming.entity.Film;
import streaming.entity.Pays;

/**
 *
 * @author ETY
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=SpringConfig.class)
public class PaysDAOTest {
    
    @Autowired
    private PaysDAO dao;
    
    @Test
    public void test(){
        //dao.ajouter(new Pays());
        Pays p=new Pays();
        p.setNom("France");
        dao.ajouter(p);
    }
    
}
