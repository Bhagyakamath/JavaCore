package p2;

public class AddModel {
	public void add(AddDto ob) throws Exception{
		ob.setNum3(ob.getNum1()+ob.getNum2());
	}
}
