import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by amaro on 09/04/2017.
 */
class FCFS {

    //ENCONTRA O TEMPO DE ESPERA DE TODOS JOBS
    public static void tEspera(int n, int[] p, int [] tC, int [] tD, int [] tE){
        int  tempo_servico[] = new int [n];
        tempo_servico[0]=0;

        //calcular tempo de espera
        for (int i = 1; i < n; i++) {
            //Adiciona o tempo de duração aos jobs anteriores
            tempo_servico[i] = tempo_servico[i-1] + tD[i-1];

            //Encontra tempo de espera para processos atuais
            tE[i] = tempo_servico[i] - tC[i];

            //Se o tempo de espera de um job é <0
            //então ele já está na fila d eprontos
            // então o tempo de espera é 0

            if(tE[i]<0){
                tE[i]=0;
            }

        }
    }

    //CALCULA O TEMPO DE RETORNO
    public static void tRetorno(int n, int[] p, int [] tE, int [] tD, int [] tR){
        for (int i = 0; i < n; i++) {
            tR[i] = tD[i]+tE[i];

        }
    }

    //CALCULA ESPERA MÉDIA E RESPOSTA
    public static void tMedio(int n, int[] p, int [] tC, int [] tD){
        int tE[] = new int [n];
        int tR[] = new int [n];
        int tRes[] = new int [n];

        //Tempo de espera de todos jobs
        tEspera(n, p, tC, tD, tE);

        //tempo de respsota
        tRetorno(n, p, tE, tD, tR);

        //Printar detalhes
        int esperaTotal=0, retornoTotal=0, respostaTotal=0;

        for (int i = 0; i < n; i++) {
            esperaTotal+= tE[i];
            retornoTotal+= tR[i];
//            System.out.println(" " + (i+1) + "\t\t" + tD[i] + "\t\t" +
//            tC[i] + "\t\t" + tE[i] + "\t\t" + tR[i] + "\t\t" + tempoRetorno);
        }
        respostaTotal=esperaTotal; //FCFS o tempo de resposta é igual ao de espera


        System.out.println("FCFS " + (float)retornoTotal / (float)n + " " + respostaTotal + " " + (float)esperaTotal / (float)n + " ");

    }

}
