/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul;

import br.edu.ifsul.jpa.EntityManagerUtil;
import java.util.List;

/**
 *
 * @author Emanuel
 */
public class DAOGenerico<TIPO> {
    private List<TIPO> listaObjetos;
    private List<TIPO> listaTodos;
    protected EntityManagerUtilnager em;
    protected Class classePersistente;
    protected String mensagem;
    
    
}
