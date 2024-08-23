package ex0729_jyj;

import java.util.TreeSet;
import java.util.Random;

public class Lotto {

    public static void main(String[] args) {
        
        TreeSet<Integer> lottoNum = new TreeSet<>();
        Random random = new Random();

        
        while (lottoNum.size() < 6) {
            int number = random.nextInt(45) + 1;
            lottoNum.add(number); 
        }

        
        System.out.println("로또 번호: " + lottoNum);
    }
}
