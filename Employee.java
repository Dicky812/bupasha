//Object Class
public class Employee {
    private String nama;
    private double gaji;

	public String getNama() {
		return this.nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public double getGaji() {
		return this.gaji;
	}

	public void setGaji(double gaji) {
		this.gaji = gaji;
	}


    /*Constructor nama sama dengan nama class */
    public Employee(){
        nama = "";
        gaji = 0.00;
    }
    
    //Constructor parameter
    public Employee (String nama , double gaji) {
        this.nama = nama;
        this.gaji= gaji;
    }


    //Method
    public void print() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Ini Data Dari Karyawan");
        System.out.println("Nama : "+ nama);
        System.out.println("Gaji : "+ gaji);
        System.out.println("-------------------------------------------------------------------------");
    }

}