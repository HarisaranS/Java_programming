class speedWrapperClass{

	private int speed;

	speedWrapperClass(){}

	speedWrapperClass(int speed){
		this.speed = speed;
	}

	public int getVehicleSpeed(){
		return speed;
	}

	public void setVehicleSpeed(int speed){
		this.speed = speed;
	}

	public static void main (String[] args){
		speedWrapperClass speedValue = new speedWrapperClass(100);
		System.out.println("Vehile Speed : "+speedValue.getVehicleSpeed() + "km/hr");
	}
}



