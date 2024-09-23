package HerancaEmJava;

/*
Herança é a relação entre duas classes, uma superclasse e uma subclasse, que faz com que

    - a subclasse tenha exatamente todos os atributos e métodos da superclasse.
    - possibilidade de adicionar atributos e métodos
    - redefinir os métodos.

Por exemplo, vamos fazer uma classe Pato que tem os atributos: nome e ano de nascimento; e os métodos voa e nada.
Depois vamos definir uma subclasse PatoSubmarino que tem também uma valocidade para nadar e redefine o método nadar.
 */

public class Pato {
    //DECLARAÇÃO DE VARIÁVEIS
    private String nome;
    private int ano;

    //CONSTRUCTOR
    public Pato(String aNome, int aAno){
        this.nome = aNome;
        this.ano = aAno;
    }

    public String getNome(){
        return nome;
    }
    public int getAno(){
        return ano;
    }
    public void voa(){
        System.out.println("O pato voa");
    }
    public void nada(){
        System.out.println("O pato nada");
    }
    @Override
    public String toString(){
        String res = "";
        res += "classe: " + this.getClass() + "\n";
        res += "nome: " + this.nome + "\n";
        res += "Nascimento: " + this.ano + "\n";
        return res;
    }
}
