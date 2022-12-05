import java.nio.file.LinkPermission;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Produkt> magazine = new HashMap<>();
        Magazina magazina = new Magazina();
        while (true) {
            try {
                System.out.println("Pershendetje,ju lutem zgjidhni nje nga opsionet e meposhtme" + '\n' + "1-Menaxher" + '\n' + "2-Klient"
                );
                Scanner scanner = new Scanner(System.in);
                int s = scanner.nextInt();
                switch (s) {
                    case (1):
                        System.out.println("Cfare deshironi te beni ne dyqan?" + '\n' + "1-Shto produkt" + '\n' + "2-Fshi produkt" + '\n' + "3-Shfaq produktet qe ndodhen ne magazine");
                        int a = scanner.nextInt();
                        switch (a) {
                            case (1):
                                magazina.shtoProdukt();
                                break;
                            case (2):
                                magazina.fshiProdukt();
                                break;
                            case (3):
                                magazina.shfaqProduktet();
                                break;
                        }
                        break;

                    case (2):
                        magazina.bliProdukt();
                        break;
                }


            } catch (Exception e) {
                System.out.println("Ju lutem zgjidhni nga opsionet e meposhtme");

            }


        }

    }
}