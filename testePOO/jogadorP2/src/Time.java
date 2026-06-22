import java.util.*;
import java.nio.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;

public class Time {
    private List<Jogador> equipe;

    public Time(){
        this.equipe = new ArrayList<Jogador>();
    }

    public void addJogador(Jogador j){
        equipe.add(j);
    }

    public void printJogadores(){
        equipe.forEach(j -> System.out.println(j));
    }

    public void printJogadoresBySalario(double s){
        equipe.stream()
        .filter(j -> j.getSalario() > s)
        .forEach(j -> System.out.println(j.geraCsv()));
    }

    public void salvaJogadoresCSV(){
        Path arq = Paths.get("jogadores.csv");
        BufferedWriter writer = null;
        String line = "";

        try{
            writer = new BufferedWriter(new FileWriter(arq.toFile()));
            writer.append("Nome" + ";" + "Salario" + ";" + "Idade");
            for(Jogador j : equipe){
                line = j.geraCsv();
                writer.append(line + "\n");
            }
            writer.close();
        } catch(Exception e){
            System.out.println(e);
        }

    }

    public void innerSalvaJogadores(){
        Path arq = Paths.get("jogadores.csv");
        BufferedWriter writer = null;
        String line = "";

        try{
            writer = new BufferedWriter(new FileWriter(arq.toFile()));
            writer.append("Nome" + ";" + "Salario" + "\n");
            for(Jogador j : equipe){
                Jogador jAux = new Jogador(j.getNome(), j.getSalario()){
                    @Override
                    public String geraCsv(){
                        return j.getNome() + ";" + j.getSalario() + "\n";
                    }
                };
                writer.append(jAux.geraCsv());
            }
            writer.close();
        } catch(Exception e){
            System.out.println(e);
        }

    }
}
