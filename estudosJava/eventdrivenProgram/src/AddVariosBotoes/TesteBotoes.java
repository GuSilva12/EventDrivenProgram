package AddVariosBotoes;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;  //Um evento semântico que indica que uma ação definida pelo componente ocorreu
import java.awt.event.ActionListener;   //A interface listener para receber eventos de ação. A classe que está interessada em processar um evento de ação implementa essa interface.

import javax.swing.JButton; //Uma implementação de push button.
import javax.swing.JFrame;  //Responsável pela criação da tela em que o botão será modelado.

public class TesteBotoes {

    public void testeBotoes(){

        //Instanciando uma janela para colocar os botões
        JFrame janela = new JFrame();

        //Setando um layout para incluir vários botões
        janela.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        //criando ação por inner class
        JButton botaoInnerClass = new JButton("Botão Inner Class");
        //Adicionando o botão à janela
        janela.add(botaoInnerClass);
        botaoInnerClass.addActionListener(new AcaoBotao());

        //Criando ação por classe anônima
        JButton botaoClasseAnonima = new JButton("Botão classe anônima");
        //Adicionando o botão à janela
        janela.add(botaoClasseAnonima);
        botaoClasseAnonima.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Classe Anonima: o botão foi pressionado");
            }
        });

        //criando acao por expressão lambda
        JButton botaoLambda = new JButton("Botao lambda expression");
        //Adicionando o botão à janela
        janela.add(botaoLambda);
        botaoLambda.addActionListener((ActionEvent e) -> System.out.println("Lambda expression: o botão foi pressionado"));

        janela.pack();  //seta o tamanho da janela
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   //para o programa ao fechar a janela
        janela.setVisible(true);    //torna o frame visível
    }

    class AcaoBotao implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            System.out.println("Inner class: o botão foi pressionado");
        }
    }

    public static void main (String[]args){
         new TesteBotoes().testeBotoes();
    }
}
