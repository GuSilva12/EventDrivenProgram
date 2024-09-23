package HerancaEmJava;

import org.w3c.dom.ls.LSOutput;

//Classe de teste do programa
public class TestePato {

    //Início do programa
    public static void main (String[] args){

        //Instanciando um objeto Pato chamado "pato"
        Pato pato = new Pato("João", 1999);
        System.out.println(pato);
        pato.voa();
        pato.nada();


        PatoSubmarino patoSubmarino = new PatoSubmarino("Atômico", 2000, 555);
        System.out.println(patoSubmarino);
        patoSubmarino.voa();
        patoSubmarino.nada();
    }
}