package ArrayList;

import java.util.ArrayList; //Importa uma classe ArrayList para a criação de listas em Java

class Gato{ //Classe que modela objetos do tipo "ArrayList.Gato"
    //Declaração de variáveis
    private String nome;   //Variável "nome" do tipo String, privada

    //CONSTRUCTOR DA CLASSE "ArrayList.Gato"
    public Gato(String aNome){
        this.nome = aNome;
    }
    @Override
    public String toString(){
        String res = "";
        res += "Gato de nome: " + this.nome + "\n";
        return res;
    }
}

//Classe principal
public class Main {
    //Início do programa
    public static void main(String[] args) {
        ArrayList<Gato> gatos = new ArrayList<Gato>();   //Instancia um novo objeto do tipo ArrayList


        Gato gato01 = new Gato("Brutos");   //Instancia um objeto "ArrayList.Gato" chamado "gato01"
        gatos.add(gato01);  //Adiciona o objeto "gato01" à lista "Gatos"

        Gato gato02 = new Gato("Chitarra");    //Instancia um objeto "ArrayList.Gato" chamado "gato02"
        gatos.add(gato02);  //Adiciona o objeto "gato02" à lista "Gatos"

        Gato gato03 = new Gato("Chirriro");    //Instancia um objeto "ArrayList.Gato" chamado "gato03"
        gatos.add(gato03);    //Adiciona o objeto "gato03" à lista "Gatos"

        Gato gato04 = new Gato("Skal");
        gatos.add(gato04);

        Gato gato05 = new Gato("Pulley");
        gatos.add(gato05);


        //LISTANDO OS ELEMENTOS QUE A LISTA CONTÉM
        for (int i = 0; i < gatos.size(); i++) {
            System.out.println(gatos.get(i));   //Imprime individualmente cada elemento da lista "gato"
        }


        //EXIBINDO O TAMANHO DA LISTA
        System.out.println("Tamanho da lista: " + gatos.size());

        gatos.clear();  //limpa a lista (ela ficará vazia)
    }
}

