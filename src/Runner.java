/**
 * Created by doetken on 21.10.2016.
 */
public class Runner {
    private static volatile boolean test = true;
//    private static boolean istSoweit = true;

    public static void main(String[] args) {
        new Thread() {
            public void run() {
//                while (test) istSoweit = test;
                while (test) ;
                System.out.println("Ende.");
            }
        }.start();
        System.out.println("Warten auf den Thread...");
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        test = false;
//        while (true) System.out.println(istSoweit);
        while (true) ;


//        Problem:
//        Der Thread bekommt es nicht mit, weil beide Threads mit dem gleichen Kontext arbeiten
//          und den auf unterschiedliche Prozessoren kopieren
//          deswegen müssen flüchtige Variablen deklariert werden, die dann immer vor dem Lesen durch
//          alle Threads fertig bearbeitet sein müssen
    }
}
