import java.util.Random;

public class Ejercicio_1Runnable implements Runnable{
    public static int n1;
    public static int n2;

    @Override
    public void run() {
        Random r = new Random();
        for(int i = n1; i <= n2; i++){
            try {
                Thread.sleep(r.nextInt(1000));
            } catch (InterruptedException ie){
                System.out.println("El hilo ha sido interrumpido");
            }
            System.out.println(i);
        }
    }

}
