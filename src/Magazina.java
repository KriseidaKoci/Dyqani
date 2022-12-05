import java.util.*;

public class Magazina {

    Map<Integer, Produkt> magazine = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    Produkt produkt = new Produkt("", 0, 0);
    int key = 0;


    public void shtoProdukt() {

            System.out.print("Cfare produkti deshironi te shtoni ? ");
            String emri = scanner.nextLine();
            System.out.print("Cfare sasie deshironi te shtoni?  ");
            int sasia = scanner.nextInt();
            System.out.print("Cfare cmimi ka ky produkt?  ");
            int cmimi = scanner.nextInt();
            ++key;
            magazine.put(key, new Produkt(emri, sasia, cmimi));
            System.out.println("Produkti u shtua me sukses ");

        }
        public void fshiProdukt () {
            System.out.println("Cilin produkt deshironi te fshini?  ");
            int ind = scanner.nextInt();
            for (Integer key : magazine.keySet()) {
                if (magazine.containsKey(ind)) {
                    magazine.remove(ind);
                    System.out.println("Produkti u fshi nga magazina");
                } else {

                    System.out.println("Produkti nuk ndodhet ne magazine");
                }

            }

        }

        public void shfaqProduktet () {

            for (Map.Entry entry : magazine.entrySet()) {
                if (entry != null) System.out.println(entry.getKey() + " :" + entry.getValue());
                else {
                    System.out.println("Nuk ekziston asnje produkt ne dyqan");
                }
            }
        }

        public void bliProdukt () {
            System.out.println("zgjidhni produktet qe deshironi te blini ne baze te indeksit te produktit" + '\n' + magazine);
            int b = scanner.nextInt();
            System.out.println("Cfare sasie deshironi te bleni nga ky produkt?  ");
            int c = scanner.nextInt();
            for (Integer key : magazine.keySet()) {
                if (b == key) {
                    int shuma = 0;
                    produkt.setSasia(produkt.getSasia() - c);
                    shuma = (c * produkt.getCmimi());
                    System.out.println("blerja juaj u realizua me sukses" + " " + "Shuma qe ju duhet te paguani eshte : " + shuma);
                }


                System.out.println("");
            }


        }


    }
