public abstract class Jogador {
    private String nome;
    private double salario;

    public Jogador(String n, double s){
        this.nome = n;
        this.salario = s;
    }

    public double getSalario(){
        return salario;
    }

    public String getNome(){
        return nome;
    }

    public abstract String geraCsv();
}
