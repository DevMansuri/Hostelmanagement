class Car {

	int wheel;

	Car(int wheelCount) {
		wheel = wheelCount;
	}	

	public void printWheel() {
		System.out.println("Car object created...and has wheel count: " + wheel);
	}	
}

class Ford extends Car {
	Ford(int i) {
		super(i);
		System.out.println("Ford object created...");
	}
}

class CarModel {

	public static void main(String[] args) {
		Car ford =  new Car(1);
		ford.printWheel();

		//ford.callSuper();
	}
}

