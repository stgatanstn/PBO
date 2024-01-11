public class PboKuliah {
    public static void main(String[] args) {
        System.out.println("Data Mahasiswa");
        PboKuliah B = new PboKuliah();
        B.tampilkanInfo();
        System.out.println("Usia Murid: " + B.Usia(2002));
    }

    public void tampilkanInfo() {
        String nama ="Galen Nico";
        String jurusan ="Teknik Informatika";
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Jurusan: " + jurusan);
    }
    public int Usia(int tahunLahir) {
        int usia=2024-tahunLahir;
        return usia;
    }
}
