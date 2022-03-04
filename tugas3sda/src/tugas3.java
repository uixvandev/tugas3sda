import java.util.LinkedList;
import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) throws Exception {
        System.out.println("===================================");
        System.out.println("TUGAS 3 STRUKTUR DATA DAN ALGORITMA");
        System.out.println("            LINKED LIST            ");
        System.out.println("===================================\n");

        Scanner input = new Scanner (System.in);
        String inputan;
        String pilihan;
        boolean isLanjutkan = true;
        
        LinkedList<String> namaMahasiswa = new LinkedList<>();
        LinkedList<String> nimMahasiswa = new LinkedList<>();
        LinkedList<String> alamatMahasiswa = new LinkedList<>();

        while(isLanjutkan){
            System.out.println("Menu Pilihan :");
            System.out.println("1. isEmpty Data");
            System.out.println("2. Menambahkan Data");
            System.out.println("3. Get First Data");
            System.out.println("4. Get Last Data");
            System.out.println("5. Add First Data");
            System.out.println("6. Add Last Data");
            System.out.println("7. Clear Data");

            System.out.print("\n\nMasukkan Pilihan   : ");
            pilihan = input.next();
            System.out.println();

            switch(pilihan){
                case "1" :
                            System.out.println("Mengecek Data Kosong/Tidak");
                            System.out.println("==========================");
                            System.out.println("Apakah Data Nama Mahasiswa Kosong atau Tidak? " + namaMahasiswa.isEmpty());   
                            System.out.println("Apakah Data NIM Mahasiswa Kosong atau Tidak? " + nimMahasiswa.isEmpty());  
                            System.out.println("Apakah Data Alamat Mahasiswa Kosong atau Tidak? " + alamatMahasiswa.isEmpty());     
                break;
    
                case "2" :
                            System.out.println("Menambahkan Data");
                            System.out.println("================");
                            System.out.print("Masukkan Nama Mahasiswa yang akan ditambahkan = ");
                            inputan = input.next();
                            namaMahasiswa.add(inputan);
                            System.out.print("Masukkan NIM Mahasiswa yang akan ditambahkan = ");
                            inputan = input.next();
                            nimMahasiswa.add(inputan);
                            System.out.print("Masukkan Alamat Mahasiswa yang akan ditambahkan = ");
                            inputan = input.next();
                            alamatMahasiswa.add(inputan);
                            System.out.println("Data Linked List setelah ditambah : ");
                            System.out.println(namaMahasiswa + "ukuran : " +  namaMahasiswa.size());
                            System.out.println(nimMahasiswa + "ukuran : " +  nimMahasiswa.size());
                            System.out.println(alamatMahasiswa + "ukuran : " +  alamatMahasiswa.size());

                break;
    
                case "3" :
                            System.out.println("Get First Data");
                            System.out.println("================");
                            System.out.println("Elemen pertama dari nama mahasiswa adalah : " + namaMahasiswa.getFirst());
                            System.out.println("Elemen pertama dari nim mahasiswa adalah : " + nimMahasiswa.getFirst());
                            System.out.println("Elemen pertama dari alamat mahasiswa adalah : " + alamatMahasiswa.getFirst());
                break;
    
                case "4" :
                            System.out.println("Get Last Data");
                            System.out.println("================");
                            System.out.println("Elemen terakhir dari nama mahasiswa adalah : " + namaMahasiswa.getLast());      
                            System.out.println("Elemen terakhir dari nim mahasiswa adalah : " + nimMahasiswa.getLast());      
                            System.out.println("Elemen terakhir dari alamat mahasiswa adalah : " + alamatMahasiswa.getLast());         
                break;

                case "5" :
                            System.out.println("Add First Data");
                            System.out.println("==============");
                            System.out.print("Masukkan Nama Mahasiswa yang akan ditambahkan = ");
                            inputan = input.next();
                            namaMahasiswa.addFirst(inputan);
                            System.out.print("Masukkan NIM Mahasiswa yang akan ditambahkan = ");
                            inputan = input.next();
                            nimMahasiswa.addFirst(inputan);
                            System.out.print("Masukkan Alamat Mahasiswa yang akan ditambahkan = ");
                            inputan = input.next();
                            alamatMahasiswa.addFirst(inputan);
                            System.out.println("Data Mahasiswa setelah ditambah : ");
                            System.out.println(namaMahasiswa + "ukuran : " +  namaMahasiswa.size());
                            System.out.println(nimMahasiswa + "ukuran : " +  nimMahasiswa.size());
                            System.out.println(alamatMahasiswa + "ukuran : " +  alamatMahasiswa.size());
                            
                break;

                case "6" :
                            System.out.println("Add Last Data");
                            System.out.println("==============");
                            System.out.print("Masukkan Nama Mahasiswa yang akan ditambahkan = ");
                            inputan = input.next();
                            namaMahasiswa.addLast(inputan);
                            System.out.print("Masukkan NIM Mahasiswa yang akan ditambahkan = ");
                            inputan = input.next();
                            nimMahasiswa.addLast(inputan);
                            System.out.print("Masukkan Alamat Mahasiswa yang akan ditambahkan = ");
                            inputan = input.next();
                            alamatMahasiswa.addLast(inputan);
                            System.out.println("Data Mahasiswa setelah ditambah : ");
                            System.out.println(namaMahasiswa + "ukuran : " +  namaMahasiswa.size());
                            System.out.println(nimMahasiswa + "ukuran : " +  nimMahasiswa.size());
                            System.out.println(alamatMahasiswa + "ukuran : " +  alamatMahasiswa.size());
                break;

                case "7" :
                            System.out.println("Clear Data");
                            System.out.println("===========");
                            namaMahasiswa.clear();
                            nimMahasiswa.clear();
                            alamatMahasiswa.clear();
                            System.out.println("Data Mahasiswa berhasil dihapus");
                            System.out.println("Data Mahasiswa setelah dihapus : ");
                            System.out.println(namaMahasiswa + "ukuran : " +  namaMahasiswa.size());
                            System.out.println(nimMahasiswa + "ukuran : " +  nimMahasiswa.size());
                            System.out.println(alamatMahasiswa + "ukuran : " +  alamatMahasiswa.size());
                            
                break;
                
                            
            }

            System.out.print("\nApakah Anda Masih Ingin Lanjut[y/n]? ");
            pilihan = input.next();
            isLanjutkan = pilihan.equalsIgnoreCase ("y");
        }
        

        

        
        ;

        
    }
}