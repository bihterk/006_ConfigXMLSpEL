package com.bikekin;

public class Yazar {
	
	private Kitap kitap;
	
	private String adi, soyadi, kitapAdi;

	//---------------------
	public Kitap getKitap() {
		return kitap;
	}

	public void setKitap(Kitap kitap) {
		this.kitap = kitap;
	}
	//---------------------
	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}
	//---------------------
	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	//---------------------
	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	@Override
	public String toString() {
		return " Yazar = " + adi + " " + soyadi 
				+ ", Kitap Adı = " + kitapAdi + "]"
				+ ", Kitap ISBN = " + getKitap().getEserISBN();
	}
	
	

}
