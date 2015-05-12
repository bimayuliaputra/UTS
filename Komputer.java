public class Komputer{
   public int Prosesor;
   public int Memori; 
   public int Storage;
   
   
   public Komputer(){
		Prosesor = 500;
		System.out.println("Kecepatan Prosesor Komputer: "+Prosesor);
   }
  }
  class Notebook05 extends Komputer{
	public int Baterai;
	
	public Notebook05(int i, int j, int k, int l){
		Prosesor = i;
		Memori = j;
		Storage = k;
		Baterai = l;
	}
	
	public void CetakSpesifikasi(){
		System.out.println("Kecepatan Prosesor Notebook05= "+Prosesor);
		System.out.println("Kapasitas Memori= "+Memori);
		System.out.println("Kapasitas Storage= "+Storage);
		System.out.println("Kapasitas Baterai= "+Baterai);
	}
		
	public void Overclock(int a){
		Prosesor = a;
		System.out.println("Notebook diOverclock dengan Kecepatan Prosesor= "+Prosesor);
	}
	
  }