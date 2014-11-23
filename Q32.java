
public abstract class Q32 {
	public static void main(String[] args){
		
	}
	
	class abstract People {
		private abstract void wiggle();
	}
	
	class Teachers extends People {
		public void wiggle() {
			bad_shake();
		}
	}
	
	class Pupils extends People{
		public void wiggle() {
			good_shake();
		}
	}
}