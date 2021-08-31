class Human1{
	 int wheel = 4;
	 public void blowhorn(){
      System.out.println("wheel count is  :" + wheel);
	   }
}
class AltoCar extends Car1 {
	 int wheel = 6;
	public void blowhorn(){
		System.out.println(" wheel count is :" + wheel);
	
	}

public static void main(String[] args) {
	AltoCar altocar = new AltoCar();
	altocar.super.blowhorn();
}
}
