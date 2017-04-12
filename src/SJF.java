import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by amaro on 09/04/2017.
 */
public class SJF {
    public SJF(List<Processo> listaP){
        List<Processo> fPronto = new ArrayList<Processo>(listaP);


        //Ordena lista
        Collections.sort(listaP);

        for (int i = 0; i < listaP.size(); i++) {
            System.out.println(listaP.get(i).gettD());
        }


    }


}
