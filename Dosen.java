public class Dosen {
	String nama;
	int nik;

	Mahasiswa (String nama, int nik){
		this.nama = nama;
		this.nik = nik;
	}

	public void setNama (String nama){
		self.nama = nama;
	}

	public void setNik (int nik){
		self.nik = nik;
	}

	public String getNama(){
		return nama;
	}

	public int getNik(){
		return nik;
	}
}