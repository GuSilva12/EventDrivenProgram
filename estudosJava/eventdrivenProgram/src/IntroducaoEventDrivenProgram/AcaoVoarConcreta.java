package IntroducaoEventDrivenProgram;

public class AcaoVoarConcreta implements AcaoVoar{
    @Override
    public void fazVoar(){
        System.out.println("Classe que defina a ação: faz voar");
    }
}
