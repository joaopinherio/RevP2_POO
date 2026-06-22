import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Time timefut = new Time();
        JogadorFutebol j1 = new JogadorFutebol("vini jr", 36000);
        try{
            j1.setIdade(15);
        }
        catch(IdadeInvalidaException e){
            System.out.println(e);
        }

        System.out.println("foi");
        
        JogadorFutebol j2 = new JogadorFutebol("casemiro", 22000);
        j2.setIdade(32);


        JogadorFutebol j3 = new JogadorFutebol("ney", 22220);
        j3.setIdade(32);

        timefut.addJogador(j1);
        timefut.addJogador(j2);
        timefut.addJogador(j3);

        //timefut.printJogadoresBySalario(22001);

        //timefut.salvaJogadoresCSV();
        timefut.innerSalvaJogadores();

        Queue<Character> fila = new LinkedList<Character> ();
        Character[] filaAux = {'a','c', 'e', 'y', 'o', 'z', 'u'};
        fila.addAll(Arrays.asList(filaAux));

        ArrayList<Character> lista =  new ArrayList<Character>();
        ArrayList<Character> vogais = new ArrayList<>(Arrays.asList('a','e', 'i','o','u', 'A', 'E', 'I', 'O', 'U'));
        
        while(!(fila.isEmpty())){
            Character c = fila.poll();

            if(vogais.contains(c)){
                lista.add(c);
            }
        }

        lista.forEach(c -> System.out.println(c));

    }
}