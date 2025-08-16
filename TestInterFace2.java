interface Bank{
	float rateOfInterest();
}

class SBI implements Bank{
	public float rateOfInterest(){
		return 9.15f;
	}
}

class PNB implements Bank{
	public float rateOfInterest(){
		return 9.7f;
	}
}

class TestInterFace2{
	public static void main(String[] args){
		Bank S = new SBI();
		Bank P = new PNB();
		System.out.println("ROI :" + S.rateOfInterest());
		System.out.println("ROI :" + P.rateOfInterest());
	}
}
