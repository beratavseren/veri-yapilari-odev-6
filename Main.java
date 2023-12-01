import java.util.Random;

public class Main {
    public static void main(String[] args) {

        CiftYonluBagliListe cybl=new CiftYonluBagliListe();

        Random random=new Random();

        cybl.basaEkle(random.nextInt(101));
        cybl.basaEkle(random.nextInt(101));
        cybl.basaEkle(random.nextInt(101));
        cybl.basaEkle(random.nextInt(101));
        cybl.basaEkle(random.nextInt(101));
        cybl.basaEkle(random.nextInt(101));
        cybl.basaEkle(random.nextInt(101));
        cybl.basaEkle(random.nextInt(101));

        cybl.yazdir();
        cybl.sirala();
        cybl.yazdir();
    }
}
