// AC obj = new BC();
package a34;

class AC{
	public int a() {return 1;}
}
class BC extends AC{
	public int a() {return 2;}
}


public class N {
    public static void main(String[] args) { 
 
    	AC ab=new BC();
    	System.out.println(ab.a());
    
    }
   
}