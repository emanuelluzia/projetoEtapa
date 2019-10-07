/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul;
import br.edu.ifsul.modelo.Livro;
import java.io.Serializable;

/**
 *
 * @author Emanuel
 */
public class LivroDAO<TIPO> extends DAOGenerico<Livro> implements Serializable{
    
    public LivroDAO(){
        super();
        classePersistente = Livro.class;
    }
    
}
