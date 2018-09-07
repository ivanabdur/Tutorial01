public class Mahasiswa {
	String nama;
	int npm;

	Mahasiswa (String nama, int npm){
		this.nama = nama;
		this.npm = npm;
	}

	public void setNama (String nama){
		self.nama = nama;
	}

	public void setNpm (int npm){
		self.npm = npm;
	}

	public String getNama(){
		return nama;
	}

	public int getNpm(){
		return npm;
	}

}