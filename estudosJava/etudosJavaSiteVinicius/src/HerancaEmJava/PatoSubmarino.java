package HerancaEmJava;

public class PatoSubmarino extends Pato{    //"extends" extende a classe "Pato" para essa classe, permitindo assim herdar os seus atributos e métodos

    //DECLARAÇÃO DE VARIÁVEIS
    private double velocidade;

    //CONSTRUCTOR
    public PatoSubmarino(String aNome, int aAno, double aVelocidade){
        super(aNome, aAno); //chama o construtor do método de onde você herdou a classe, aproveitando o que já é fornecido pela superclasse
        this.velocidade = aVelocidade;
    }

    //Override irá sobrescrever de forma a seguir a proposta da classe, que é modelar um objeto "PatoSubmarino"
    @Override
    public void nada(){
        System.out.println("Nada com uma velocidade de " + this.velocidade);
    }

    //Override irá sobrescrever de forma a seguir a proposta da classe, que é modelar um objeto "PatoSubmarino"
    @Override
    public String toString(){
        String res = "";
        res += "Velocidade: " + this.velocidade + "\n";
        return res;
    }
}
