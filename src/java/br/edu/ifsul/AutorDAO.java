/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul;
import br.edu.ifsul.modelo.Autor;
import java.io.Serializable;

/**
 *
 * @author Emanuel
 * @param <TIPO>
 */
public class AutorDAO<TIPO> extends DAOGenerico<Autor> implements Serializable{
    
    public AutorDAO(){
        super();
        classePersistente = Autor.class;
    }
    
}
