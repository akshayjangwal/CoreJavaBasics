
public class AustralianTraffic implements CentralTraffic{

	public static void main(String[] args) {
		
		//AustralianTraffic a = new AustralianTraffic();  ----> since applying interface and trying to call methods of another class, so we won't use this
		CentralTraffic a = new AustralianTraffic();
		AustralianTraffic b = new AustralianTraffic();
		a.GreenGo();
		a.RedStop();
		a.FlashYellow();
		b.WalkingSymbols();
		//a.WalkingSymbols();   -----------------------> not possible as this method is not defined in CentralTraffic() class 

		
		

	}
	
	public void WalkingSymbols() {                    // ------> calling local methods of the AustralianTraffic() class  
		System.out.println("Walking Symbol Rules");
		
	}

	@Override
	public void GreenGo() {
		// TODO Auto-generated method stub
		System.out.println("GreenGo implementation");
		
	}

	@Override
	public void RedStop() {
		// TODO Auto-generated method stub
		System.out.println("RedStop implementation");
		
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println("FlashYellow Implementation");
		
		
	}

}
