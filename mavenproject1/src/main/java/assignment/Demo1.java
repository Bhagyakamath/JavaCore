package assignment;

public class Demo1 {
	public static void main(String[] args) {
		Matrix ob1=new Matrix(2,2);
		ob1.readMatrix();
		ob1.displayMatrix();
		
		Matrix ob2=new Matrix(ob1);
		ob2.displayMatrix();
		
		Matrix sum=ob1.add(ob2);
		sum.displayMatrix();
	}
	
}
