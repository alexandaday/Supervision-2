
public class Q33 {
	public static void main(String[] args){
		
	}
	
	Interface Nameable{
		public void getName();
	}
	
	Interface Teachable{
		public void math();
		public void english();
	}
	
	class Student implements Nameable,Teachable{
		public void math(){
	
		}
		public void english(){
			
		}
		public void getName(){
			
		}
	}
	class Teacher implements Nameable{
		public void getName(){
			
		}
	}
}