package AdicionadoAcaoEmBotao;

import java.awt.event.ActionEvent; //Um evento semântico que indica que uma ação definida pelo componente ocorreu.
import java.awt.event.ActionListener; //A interface listener para receber eventos de ação. A classe que está interessada em processar um evento de ação implementa essa interface.

import javax.swing.JButton; //Uma implementação de push button.
import javax.swing.JFrame; //Responsável pela criação da tela em que o botão será modelado.

public class TesteBotao {

    public void testeBotao(){

            //Instanciando uma janela para colocar o botão
        JFrame janela = new JFrame();

        //Instanciando um botão para ser colocado na janela
        JButton botao = new JButton("Botão teste");
        //Adicionando o botão à janela
        janela.add(botao);

        //Criação da ação usdando inner class
        AcaoBotao acaoBotao = new AcaoBotao();

        //Inserindo uma ação no botão
        botao.addActionListener(acaoBotao);

        //REALIZANDO CONFIGURAÇÕES NA JANELA
        //1 - Redimensionando para caber todos os componentes
        janela.pack();
        //2 - Configura para terminar o programa quando a janela for fechada
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //3 - Tornando a janela visível
        janela.setVisible(true);
    }

    //ActionListener a ser inserido no botão
    class AcaoBotao implements ActionListener {

        //ActionListener deve ter um actionPerformed
        //É uma ação que deve ser acionada quando o o botão (evento) for pressionado
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("O botão foi pressionado");
        }
    }
    //INÍCIO DO PROGRAMA
    public static void main(String[]args){
        new TesteBotao().testeBotao();
        }
}
