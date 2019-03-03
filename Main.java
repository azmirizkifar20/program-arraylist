import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Arraylist
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
        boolean jalan = true;

        while (jalan) {
            System.out.println("========== Silahkan pilih menu ==========");
            System.out.println("1. Tambah data\n" +
                    "2. Lihat data\n" +
                    "3. Cari data\n" +
                    "4. Hapus data\n" +
                    "5. Edit data\n" +
                    "6. Keluar");
            System.out.print("Silahkan pilih menu : "); int menu = input.nextInt();

            if (menu == 1) {
                System.out.print("Masukkan jumlah data : "); int jumlah = input.nextInt();
                System.out.println();

                for (int i = 0; i < jumlah; i++) {
                    Mahasiswa mhs = new Mahasiswa();
                    System.out.println("Masukkan data ke - " + (i+1));
                    System.out.print("Masukkan Nama : "); mhs.setNama(input.next());
                    System.out.print("Masukkan NIM  : "); mhs.setNim(input.next());
                    System.out.print("Masukkan Nilai : "); mhs.setNilai(input.nextInt());
                    listMahasiswa.add(mhs);
                    System.out.println();
                }
            }

            else if (menu == 2) {
                System.out.println();
                System.out.println("==============================");
                System.out.println();
                for (int i = 0; i < listMahasiswa.size(); i++) {
                    System.out.println("Nama    : " + listMahasiswa.get(i).getNama());
                    System.out.println("NIM     : " + listMahasiswa.get(i).getNim());
                    System.out.println("Nilai   : " + listMahasiswa.get(i).getNilai());
                    System.out.println();
                }
                System.out.println("==============================");
                System.out.println();
            }

            else if (menu == 3) {
                System.out.print("Masukkan NIM  : "); String cari = input.next();
                for (int i = 0; i < listMahasiswa.size(); i++) {
                    if (listMahasiswa.get(i).getNim().equals(cari)) {
                        System.out.println("Nama    : " + listMahasiswa.get(i).getNama());
                        System.out.println("NIM     : " + listMahasiswa.get(i).getNim());
                        System.out.println("Nilai   : " + listMahasiswa.get(i).getNilai());
                        System.out.println();
                    }
                }
            }

            else if (menu == 4) {
                System.out.print("Masukkan NIM  : "); String hapus = input.next();
                for (int i = 0; i < listMahasiswa.size(); i++) {
                    if (listMahasiswa.get(i).getNim().equals(hapus)) {
                        listMahasiswa.remove(i);
                        System.out.println("Data berhasil dihapus!");
                        System.out.println();
                    }
                }
            }

            else if (menu == 5) {
                for (int i = 0; i < listMahasiswa.size(); i++) {
                    System.out.println("index ke - " + (i+1));
                    System.out.println("Nama    : " + listMahasiswa.get(i).getNama());
                    System.out.println("NIM     : " + listMahasiswa.get(i).getNim());
                    System.out.println("Nilai   : " + listMahasiswa.get(i).getNilai());
                    System.out.println();
                }
                Mahasiswa mhs = new Mahasiswa();
                System.out.print("pilih index data : "); int index = input.nextInt();
                System.out.println();

                if (index <= listMahasiswa.size()) {
                    System.out.println("Anda memilih data " + listMahasiswa.get(index-1).getNama());
                    System.out.println("Pilih data yang ingin diubah : ");
                    System.out.println("1. Nama\n" +
                            "2. NIM\n" +
                            "3. Nilai\n" +
                            "4. Pilih semua");
                    System.out.print("Masukkan pilihan : "); int pilih2 = input.nextInt();

                    if (pilih2 == 1) {
                        System.out.print("Masukkan Nama : "); mhs.setNama(input.next());
                        mhs.setNim(listMahasiswa.get(index-1).getNim());
                        mhs.setNilai(listMahasiswa.get(index-1).getNilai());

                        listMahasiswa.set(index-1, mhs);
                        System.out.println("Update nama berhasil!");
                    }
                    else if (pilih2 == 2) {
                        System.out.print("Masukkan NIM  : "); mhs.setNim(input.next());
                        mhs.setNama(listMahasiswa.get(index-1).getNama());
                        mhs.setNilai(listMahasiswa.get(index-1).getNilai());

                        listMahasiswa.set(index-1, mhs);
                        System.out.println("Update nim berhasil!");
                    }
                    else if (pilih2 == 3) {
                        System.out.print("Masukkan Nilai : "); mhs.setNilai(input.nextInt());
                        mhs.setNama(listMahasiswa.get(index-1).getNama());
                        mhs.setNim(listMahasiswa.get(index-1).getNim());

                        listMahasiswa.set(index-1, mhs);
                        System.out.println("Update nilai berhasil!");
                    }
                    else if (pilih2 == 4) {
                        System.out.print("Masukkan Nama : "); mhs.setNama(input.next());
                        System.out.print("Masukkan NIM  : "); mhs.setNim(input.next());
                        System.out.print("Masukkan Nilai : "); mhs.setNilai(input.nextInt());
                        listMahasiswa.set(index-1, mhs);
                        System.out.println("Update data berhasil!");
                    }
                    else {
                        System.out.println("maaf perintah yang anda masukkan tidak valid!");
                    }
                }
                else {
                    System.out.println("Maaf tidak ditemukan data dari index " + index);
                }

                System.out.println();
            }
            else {
                System.out.println("Maaf perintah yang anda masukkan tidak valid!");
                jalan = false;
            }
        }
    }
}