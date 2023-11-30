package id.ac.undiksha.siak.people;

public class Dosen {
	
	private String nip;
	private String nama;
	private String alamat;
	private String matakuliah;
	private String tanggalLahir;
	private boolean jeniskelamin;
	
	public void setNip(String nip) {
		this.nip = nip;
	}
	
	public String getNip() {
		return this.nip;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getMataKuliah() {
		return matakuliah;
	}

	public void setMataKuliah(String matakuliah) {
		this.matakuliah = matakuliah;
	}

	public String getTanggalLahir() {
		return tanggalLahir;
	}
	
	public void setTanggalLahir(String tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	public boolean isJeniskelamin() {
		return jeniskelamin;
	}
	
	public String getJeniskelamin() {
		if (this.isJeniskelamin()) {
			return "Perempuan";
		} else {
			return "Laki-laki";
		}
	}

	public void setJeniskelamin(boolean jeniskelamin) {
		this.jeniskelamin = jeniskelamin;
	}
}