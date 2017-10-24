public class Main{
	public static void main(String[] args) 
      { 
		System.out.println("Start"); 
		
		Gun beretta=new Gun();
		for(int i=0;i<14;i++){
			beretta.shoot();
		}
		beretta.reload();
		for(int i=0;i<16;i++){
			beretta.shoot();
		}
		System.out.println("End"); 
      } 
} 