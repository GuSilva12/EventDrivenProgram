package IntroducaoEventDrivenProgram;

import java.util.ArrayList;

public class Pato {


    ArrayList<AcaoVoar> acaoVoarList = new ArrayList<>();
    public void addAcaoVoar(AcaoVoar aAcaoVoar){
        this.acaoVoarList.add(aAcaoVoar);
    }

    public void voar() {
        for(AcaoVoar acaoVoar : this.acaoVoarList) {
            acaoVoar.fazVoar();
        }
    }

}