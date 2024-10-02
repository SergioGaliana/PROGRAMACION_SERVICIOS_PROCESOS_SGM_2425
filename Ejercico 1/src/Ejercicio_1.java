import java.util.Random;
import java.util.Scanner;

public class Ejercicio_1 implements Runnable{

    @Override
    public void run() {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce n1: ");
            int n1 = sc.nextInt();
            System.out.println("Introduce n2: ");
            int n2 = sc.nextInt();

            Thread t = new Thread(() -> {
                Random r = new Random();
                for(int i = n1; i <= n2; i++){
                    try {
                        Thread.sleep(r.nextInt(1000));
                    } catch (InterruptedException ie){
                        System.out.println("El hilo ha sido interrumpido");
                    }
                    System.out.println(i);
                }
            });
            t.start();
            System.out.println("El hilo se ha lanzado");
            while(t.isAlive()){
                    Thread.sleep(1000);
            }
            System.out.println("El hilo ha finalizado");

        } catch (InterruptedException ie){
            System.out.println("El hilo ha sido interrumpido");

        }
    }

}
