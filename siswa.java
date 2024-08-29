//Object Class
public class siswa {
  private int id;
  private String nama;
  private double ipk;

  /*Constructor nama sama dgn nama Class
  */
  public siswa() {
      id = 0;
      nama = "";
      ipk = 0;
  }

  //Constructor Parameter
  public siswa(int id, String nama, double ipk) {
      this.id = id;
      this.nama = nama;
      this.ipk = ipk;
  }

  //Getter-->mendapatkan nilai-->tipe data
  public int getId() {
      return id;
  }
  public String getNama() {
      return nama;
  }
  public double getIpk() {
      return ipk;
  }
  //Setter-->mengubah nilai-->void
  public void setId(int id) {
      this.id = id;
  }
  public void setNama(String nama) {
      this.nama = nama;
  }
  public void setIpk(double ipk) {
      this.ipk = ipk;
  }
  //method tidak menghasilkan value
  public void print() {
      System.out.println("ID : " + id);
      System.out.println("Nama : " + nama);
      System.out.println("IPK : " + ipk);
  }

  //method yang menghasilkan value
  public String print2() {
      return "ID : " + id
      + "\nNama : " + nama
      + "\nIPK : " + ipk;
  }
}