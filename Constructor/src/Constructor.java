
public class Constructor {
	public static void main(String args []) {
		
		HspMakinesi m1=new HspMakinesi(20,10,"mavi");
		
		System.out.println("sonuc \t"+ m1.toplama());
		
		m1.setSayi1(50);
		
		System.out.println("sonuc \t"+ m1.toplama());

		
		/*System.out.println("sonuc \t"+  m1.bolme());
		System.out.println("sonuc \t"+  m1.carpma());
		System.out.println("sonuc \t"+ m1.toplama());
		System.out.println("sonuc \t"+  m1.cikarma());*/
		
		}
	

}
