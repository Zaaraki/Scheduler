/**
 * Created by amaro on 09/04/2017.
 */

import java.util.Scanner;

public class Scheduling {
    public static void main(String[] args) {

        Scanner nP = new Scanner(System.in);
        Scanner tempoC = new Scanner(System.in);
        Scanner tempoD = new Scanner(System.in);

        int n;

        System.out.println("Digite o numero de processos: ");
        n=nP.nextInt();

        int proc[] = new int [n];
        int tC[] = new int [n+1]; // Tempo de chegada
        int tD[] = new int [n+1]; //Tempo de duração

        for (int i = 0; i < n; i++) {
            proc[i] = i;
        }

        for(int i=0; i<n; i++){
            System.out.println("Digite o tempo de chegada para o processo " + i);
            tC[i] = tempoC.nextInt();
            System.out.println("Digite o tempo de duracao para o processo " + i);
            tD[i] = tempoD.nextInt();
        }

        FCFS.tMedio(n, proc, tC, tD);


    }
}
