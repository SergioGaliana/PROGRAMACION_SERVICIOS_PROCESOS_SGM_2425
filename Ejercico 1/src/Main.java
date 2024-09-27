import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce n1: ");
        int n1 = sc.nextInt();
        System.out.println("Introduce n2: ");
        int n2 = sc.nextInt();
        Thread t = new Thread(() ->{
            try {
                Random r = new Random();
                for(int i = n1; i <= n2; i++){
                    Thread.sleep((long)r.nextInt(1500));
                    System.out.println(i);
                }
            } catch (InterruptedException ie){
                System.out.println("El hilo ha sido interrumpido");
            }

        });
        t.start();
        System.out.println("El hilo se ha lanzado");
        while(t.isAlive()){
            Thread.sleep(1000);
        }
        System.out.println("El hilo ha finalizado");


    }

}