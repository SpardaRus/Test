public class Gun{
	private int ammo=12;
	
	
	
	public void shoot(){
		if(ammo>0){
			System.out.println("Buuuum!");
			ammo--;
		}
		else
			System.out.println("Out of ammo");
	}
	public void reload(){
		this.ammo=12;
		System.out.println("Reload...");
	}
} 