/**
 * Created by amaro on 11/04/2017.
 */



public class Processo implements Comparable<Processo>{

    private int id;
    private int tC; //tempo de chegada
    private int tD; // tempo de duracao
    private int duracaores;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int gettC() {
        return tC;
    }

    public void settC(int tC) {
        this.tC = tC;
    }

    public int gettD() {
        return tD;
    }

    public void settD(int tD) {
        this.tD = tD;
    }

    public int getDuracaores() {
        return duracaores;
    }

    public void setDuracaores(int duracaores) {
        this.duracaores = duracaores;
    }

    public Processo(int id, int tC, int tD){
        this.id=id;
        this.tC=tC;
        this.tD=tD;
    }

    public int compareTo(Processo aux){
//        if((this.tC < aux.gettC() || this.tC == aux.gettC()) && (this.gettD() < aux.gettD())){
//            return -1;
//        }
//        else if((this.tC> aux.gettC() || this.tC == aux.gettC()) && (this.gettD() > aux.gettD())){
//            return 1;
//        }
        if(this.gettC() < aux.gettC()) return -1;
        else if (this.gettC() > aux.gettC()) return 1;
        else
            return 0;
    }



}
