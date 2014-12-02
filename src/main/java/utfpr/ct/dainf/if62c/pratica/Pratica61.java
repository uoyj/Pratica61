package utfpr.ct.dainf.if62c.pratica;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica61 {
    public static void main(String[] args) {
        Time c1 = new Time();
        Time c2 = new Time();
                
        c1.addJogador("Goleiro", new Jogador(10, "José"));
        c1.addJogador("Lateral", new Jogador(5, "João"));
        c1.addJogador("Atacante", new Jogador(9, "Mario"));
        
        c2.addJogador("Goleiro", new Jogador(7, "Jack"));
        c2.addJogador("Lateral", new Jogador(6, "John"));
        c2.addJogador("Atacante", new Jogador(3, "Luigi"));
        
        System.out.println("Posição    Time 1        Time 2");
        
        if (c1.getJogadores().size() == c2.getJogadores().size())
        {
            for(Object c : c1.getJogadores().keySet())
            {
                System.out.println(c + " " +
                                c1.getJogadores().get(c).toString() + " " +
                                c2.getJogadores().get(c).toString());
            }
        }
        
        
        /*if (c1.getJogadores().size() == c2.getJogadores().size())
        {
            for(Object c : c1.getJogadores().keySet())
            {
                for(Object k : c2.getJogadores().keySet())
                {
                    if (c.equals(k))
                    {
                        System.out.println(c + " " +
                                c1.getJogadores().get(k).toString() + " " +
                                c2.getJogadores().get(k).toString());
                    }
                }
            }
        }*/
    }
}
