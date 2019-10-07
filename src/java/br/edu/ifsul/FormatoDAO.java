/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul;
import br.edu.ifsul.modelo.Formato;
import java.io.Serializable;

/**
 *
 * @author Emanuel
 */
public class FormatoDAO<TIPO> extends DAOGenerico<Formato> implements Serializable{
    
    public FormatoDAO(){
        super();
        classePersistente = Formato.class;
    }
    
}
