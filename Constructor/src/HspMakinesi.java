
public class HspMakinesi {
	private int sayi1;
	private int sayi2;
	private String renk;
	
	HspMakinesi(int sayi1,int sayi2,String renk){
		this.sayi1=sayi1;
		this.sayi2=sayi2;
		this.renk=renk;
	}
	
	public void setSayi1(int sayi1) {
		this.sayi1=sayi1;
	}
	
	public int getSayi1() {
		return this.sayi1;
	}
	
	public int toplama() {
		return sayi1+sayi2;
	}
	
	public int cikarma() {
		return sayi1-sayi2;
	}
	
	public int carpma() {
	return sayi1*sayi2;
	}
	
	public int bolme() {
		return sayi1/sayi2;
	}
	
	

}
