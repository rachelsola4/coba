import java.util.Scanner;

public class nyoba2 extends metod
{
    public static String tulisan = "Selamat datang di Toko Buku Cemerlang!";

    static void greeting(String nama){
        System.out.println("Hai, "+nama+" selamat berbelanja!");
    }

    public static void cetakTulisan(){
        System.out.println(tulisan);
    }

    public static void cetakNama(String buku){
        System.out.print("Saya ingin membeli buku berjudul "+buku);
    }

    public static void hargatotal(int harga){
        System.out.println("harga totalnya adalah "+harga);
    }

    static void ucapin(String ucapan){
        System.out.println("Terimakasih sudah berbelanja di toko kami "+ucapan);
    }

    public static void main(String[] args){
         Boolean continueProgram = true; 
        String choice="lanjut"; 
        
        
        while(continueProgram) 
        {
            switch(choice)
            {
                case "lanjut":
        greeting("rachel");
        cetakTulisan();
        metod objek = new metod();
        objek.judulbuku();
        objek.judul1();
        objek.judul2();
        objek.judul3();
        String print = objek.judul("b). Hello Jerapah");
        System.out.println(print);
        cetakNama("Hello Jerapah sebanyak : ");
        Scanner scan = new Scanner(System.in);
        int i= scan.nextInt();
        if (i==1){
            hargatotal(50000);
        }
        else if (i==2){
            hargatotal(60000);
        }
        else {
            hargatotal(100000);
        }
        ucapin("rachel");
         System.out.println("\nIngin Melanjutkan ? ");
                Scanner scan1 = new Scanner(System.in);
                String r = scan1.next();
                choice=r;
                
                break;
                case "tidak":
                System.out.println("Terima Kasih");
                continueProgram=false;
            }
        }   
    }
}


