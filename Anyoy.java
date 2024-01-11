public class Anyoy {
    public static void main(String[] args) {
        System.out.println("Anyoyy ");
        Anyoy A = new Anyoy();
        A.tampilNama();
        System.out.println("Usia: " + A.usia(2007));
    }

    public void tampilNama(){
        String nama= "Nathan Anyoy ";
        System.out.println("Nama Siswa: "+nama);
    }

    public int usia(int tahunLahir){
        int usia= 2023- tahunLahir;
        return usia;

    }
}
