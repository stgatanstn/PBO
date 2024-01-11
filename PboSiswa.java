public class PboSiswa {
    public static void main(String[] args) {
        System.out.println("Semangat Belajar ");
        PboSiswa a = new PboSiswa();
        a.tampilNama();
        System.out.println(a.usia(2007));
    }

    public void tampilNama(){
        String nama= "Nathan";
        System.out.println("Nama Siswa: "+nama);
    }

    public int usia(int tahunLahir){
        int usia= 2023-tahunLahir;
        return usia;
    
    }
}
