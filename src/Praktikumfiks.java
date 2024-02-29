import java.util.Scanner;

public class Praktikumfiks {
    public static void main (String[] args ){
        Scanner deklarasi = new Scanner(System.in);
        while(true) {
            System.out.println("==== Library System ====\n 1. Login as Student\n 2. Login as Admin\n 3. Exit");
            System.out.println("Choose oprion (1-3) :");

            int pilihan = deklarasi.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan Nim :");
                    String nim = deklarasi.next();

                    if (nim.length() == 15) {
                        System.out.println("Succesfull login as a Student");
                    } else {
                        System.out.println("User not found");
                    }
                    break;
                case 2:
                    System.out.println("Masukkan id :");
                    String id = deklarasi.next();
                    System.out.println("masukkan pass :");
                    String pass = deklarasi.next();

                    if (id.equals("admin") && pass.equals("adm1n")) {
                        System.out.println("Succesfull login as a Admin");
                    } else {
                        System.out.println("User not found");
                    }
                    break;
                case 3:
                    System.out.println("Matur nuwun");
                    return;


            }

        }
    }
    Scanner.close();
}
