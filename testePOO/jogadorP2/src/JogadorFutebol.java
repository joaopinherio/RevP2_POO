public class JogadorFutebol extends Jogador{
    private int idade;

    public JogadorFutebol(String n, double s){
        super(n, s);
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
}
