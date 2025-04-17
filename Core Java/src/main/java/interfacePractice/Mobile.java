package interfacePractice;

public interface Mobile {
	public void camera();
	public void battery();
	public void ram();
	public void rom();
	
	//by default public so we can or cannot use public
	//public default void charging()
	//public static void audio()
	default void charging() {
		audio();
		commoncode();
		
		System.out.println("Laptop charging");
	}
	static void audio() {
		commoncode();
		
		System.out.println("Mobile audio code");
	}
	private static void commoncode() {
		System.out.println("Common code");
	}
	

}
