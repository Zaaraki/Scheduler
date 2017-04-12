/**
 * Created by amaro on 09/04/2017.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Scheduling {
    public static Scanner dado = new Scanner(System.in);
    public static List<Processo> listaP = new ArrayList<Processo>();

    public static void main(String[] args) {
        int id = 0;
        while (true) {
            String in[] = dado.nextLine().split(" ");
            if (in[0].isEmpty() || in[1].isEmpty()) {
                dado.close();
                break;
            }
            listaP.add(new Processo(++id, Integer.parseInt(in[0]), Integer.parseInt(in[1])));
        }

        FCFS fcfs = new FCFS(listaP);
        SJF sjf = new SJF(listaP);
//        RR rr = new RR(listaP);
//
//        fcfs.print();
//        sjf.print();
//        rr.print();

    }
}