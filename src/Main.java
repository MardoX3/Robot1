import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random random = new Random();
        random.setSeed(1000);
        System.out.println(random.nextLong());
        System.out.println();
        for(int i =0;i<5;i++){
            System.out.println(random.nextInt(100));

        }
    }
}