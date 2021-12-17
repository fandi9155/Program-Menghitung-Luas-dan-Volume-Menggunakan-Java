import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        //
      // Membuat perhitungan menghitung luas persegi panjang
      // luas = panjang * lebar
      int panjang, lebar, luas, tinggi, volume;
      System.out.println(" === Menghitung Luas === ");

      System.out.print("Panjang = " );
      panjang = userInput.nextInt();

      System.out.print("Lebar = " );
      lebar   = userInput.nextInt();

      luas = panjang * lebar;
      System.out.println( "Hasil Dari Luas = "+ luas );

      System.out.println(" === Menghitug Volume === ");
      System.out.print(" tinggi = ");
      tinggi = userInput.nextInt();
      volume = luas * tinggi;

      System.out.println("Hasil Dari Volume = "+ volume);
    }
}
