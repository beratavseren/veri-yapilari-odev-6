public class CiftYonluBagliListe {
    Veri head;

    public void basaEkle(int veri) {
        Veri yeniVeri = new Veri(veri);
        if (head == null) {
            head = yeniVeri;
        }
        else {
            yeniVeri.sonraki = head;
            head.onceki = yeniVeri;
            head = yeniVeri;
        }
    }

    public void sirala() {
        if (head == null) {
            System.out.println("Siralanacak veri yok!");
        }
        else {
            boolean degisti = true;
            Veri kontrolEdilenVeri;
            Veri sonVeri = null;

            while (degisti) {
                degisti = false;
                kontrolEdilenVeri = head;

                while (kontrolEdilenVeri.sonraki != sonVeri) {
                    if (kontrolEdilenVeri.veri > kontrolEdilenVeri.sonraki.veri) {
                        int temp = kontrolEdilenVeri.veri;
                        kontrolEdilenVeri.veri = kontrolEdilenVeri.sonraki.veri;
                        kontrolEdilenVeri.sonraki.veri = temp;
                        degisti = true;
                    }
                    kontrolEdilenVeri = kontrolEdilenVeri.sonraki;
                }
                sonVeri = kontrolEdilenVeri;
            }
        }
    }

    public void yazdir() {
        if (head==null)
        {
            System.out.println("Yazdırılacak veri yok!");
        }
        else
        {
            Veri geciciVeri = head;
            System.out.print("[");
            while (geciciVeri != null) {
                System.out.print(geciciVeri.veri + " ");
                geciciVeri = geciciVeri.sonraki;
            }
            System.out.print("]\n");
        }
    }

}
