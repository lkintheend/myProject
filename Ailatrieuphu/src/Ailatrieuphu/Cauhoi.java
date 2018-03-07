package Ailatrieuphu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

final class Cauhoi {

    private ArrayList<String> ques;

    public Cauhoi(int a) {
        this.ques = new ArrayList<>();
        try {
            FileReader fr= new FileReader("data/cauhoi"+String.valueOf(a)+".txt");
            BufferedReader br = new BufferedReader(fr);
            String s="";
            while((s=br.readLine())!=null){
                this.addcauhoi(s);
            }
        } catch (IOException e) {
        }
    }

    public void addcauhoi(String s) {
        this.ques.add(s);
    }

    public String getcauhoi() {
        Random r = new Random();
        return ques.get(r.nextInt(this.ques.size()));
    }
}
