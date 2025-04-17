package interfacePractice;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Redmi redmi=new Redmi();
		redmi.battery();
		redmi.lock();
		redmi.ram();
		redmi.charging();
		Vivo vivo =new Vivo();
		
			vivo.rom();
			vivo.camera();
			vivo.charging();
			Samsung samsung = new Samsung();
			samsung.camera();
			samsung.rom();
			samsung.audio();
			Mobile.audio();

		
	}

}
