/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.HashMap;

/**
 *
 * @author Jhonatan
 */
public class Time {
    private HashMap<String,Jogador> jogadores;

    public Time() 
    {
        jogadores = new HashMap<>();
    }
    
    public HashMap getJogadores()
    {
        return jogadores;
    }
    
    public void addJogador(String s, Jogador j)
    {
        jogadores.put(s, j);
    }
}
