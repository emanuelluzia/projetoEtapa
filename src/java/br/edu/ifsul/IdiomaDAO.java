/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul;
import br.edu.ifsul.modelo.Idioma;
import java.io.Serializable;

/**
 *
 * @author Emanuel
 */
public class IdiomaDAO<TIPO> extends DAOGenerico<Idioma> implements Serializable{
    
    public IdiomaDAO(){
        super();
        classePersistente = Idioma.class;
    }
    
}
