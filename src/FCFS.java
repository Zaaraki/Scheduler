import java.util.ArrayList;
import java.util.List;

/**
 * Created by amaro on 09/04/2017.
 */

//PROCESSOS ESTÃO NA FILA DE PRONTOS, E SERÃO MANDADOS PARA A CPU
class FCFS {
    public FCFS(List<Processo> listaP){

        List<Processo> fPronto = new ArrayList<Processo>(listaP);
        int numProc = listaP.size();
        int tRetorno=0, tRespota=0, tEspera=0, totalP=0;

        int min = listaP.get(0).gettC(); //Ver o início do tempo de processo, onde tudo começa
        for (Processo p : listaP) {
            if (p.gettC() < min) {
                min = p.gettC();
            }
        }

        totalP=min;

        for(Processo processo: listaP){
            totalP += processo.gettD(); // Tempo total de cada processo do inicio ao final de sua execucao
            tRetorno += (totalP - processo.gettC());
            tEspera += (totalP - processo.gettC() - processo.gettD());
        }

        //No FCFS, o tempo de resposta é igual ao de espera
        tRespota = tEspera;

        System.out.println("FCFS " + (float)tRetorno/4.f + " " + (float)tRespota/4.f + " " + (float)tEspera/4.f);



    }

}
