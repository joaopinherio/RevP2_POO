public class JogadorFutebol extends Jogador{
    private int idade;
    private Origem origem;

    public JogadorFutebol(String n, double s, Origem origem){
        super(n, s);
        this.origem = origem;
    }

    public void setIdade (int idade) throws IdadeInvalidaException{
        if(idade < 16){
            throw new IdadeInvalidaException();
        }else{
            this.idade = idade;
        }
    }
    @Override
    public String geraCsv(){
        return getNome() + ";" + getSalario() + ";" + idade;
    }

    @Override
    public double calculaImposto(){
        if(origem == Origem.INTERNACIONAL){
            return salario * 0.25;
        }
        return 0;

    }
}
