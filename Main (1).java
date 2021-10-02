
public class Main{
	public static void main(String[] args) {
		Main obj1 = new Main();
		odds();
		random();
		average();
		counter();
	}
	
	
	public static void odds(){
	    int x = 30;
	    System.out.println("კენტი რიცხვები 0-დან " + x +"-მდე არის: ");
	    for (int i = 1; i <= x; i++){
	       if (i % 2 != 0){
	           System.out.println(i);
	        }
	   
	    }
    }
    public static void random(){
        double a = Math.random()*100;
            System.out.println("შემთხვევითი რიცხვი 0-100 არის: "  + a );
    }
    
    public static void average(){
        double[] numbers = {12.4, 45.8, 6.7, 5.1};
        double sum = 0;
        
        for(int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
            
        }
        double av = sum / numbers.length;
            System.out.println("მოცემული რიცხვების საშუალო არის: "+av);
    }
        public static void counter(){
        int[] array = {2,-5,3};
        int minValue = array[0];
        for (int i = 1; i< array.length; i++){
            if (array[i] < minValue){
                minValue = array[i];
            }
        }
        System.out.println("მოცემულ მასივში მინიმალური მნიშვნელობა არის: " + minValue);
    }
}