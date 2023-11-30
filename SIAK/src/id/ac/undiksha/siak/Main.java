package id.ac.undiksha.siak;

import id.ac.undiksha.siak.people.Mahasiswa;
import id.ac.undiksha.siak.people.Dosen;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Mahasiswa ani = new Mahasiswa();
		
		ani.setNim("Nim: 1234");
		ani.setNama("Nama: Ani");
		ani.setAlamat("Alamat: Singaraja");
		ani.setProdi("Prodi: Ilmu Komputer");
		ani.setTanggalLahir("Tanggal Lahir: 1 Januari 2000");
		ani.setJeniskelamin(true);
		

Dosen budi = new Dosen();

        budi.setNip("Nip: 5678");
        budi.setNama("Nama: Budi");
        budi.setAlamat("Alamat: Denpasar");
        budi.setMataKuliah("Pengampu: Aloritma Pemograman");
        budi.setTanggalLahir("Tanggal Lahir: 15 Februari 1985");
        budi.setJeniskelamin(false);
		
		
		/*ani.nim 			= "123";
		ani.nama 			= "Ani";
		ani.alamat 			= "Singaraja";
		ani.tanggalLahir 	= "1 Januari 2000";
		ani.jeniskelamin 	= true;
		ani.prodi 			= "Ilmu Komputer";
		
		System.out.println(ani.nim);
		System.out.println(ani.nama);
		System.out.println(ani.alamat);
		System.out.println(ani.tanggalLahir);
		System.out.println(ani.jeniskelamin);
		System.out.println(ani.prodi);*/
		
		System.out.println(ani.getNim());
		System.out.println(ani.getNama());
		System.out.println(ani.getAlamat());
		System.out.println(ani.getProdi());
		System.out.println(ani.getTanggalLahir());
		System.out.println(ani.getJeniskelamin());
		
		
        System.out.println(budi.getNip());
        System.out.println(budi.getNama());
        System.out.println(budi.getAlamat());
        System.out.println(budi.getMataKuliah());
        System.out.println(budi.getTanggalLahir());
        System.out.println(budi.getJeniskelamin());

	}

}