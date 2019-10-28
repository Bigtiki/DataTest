package excelreadandwrite;
public class Test1 extends TestCopy {
	public static void main(String[] args) {
		mainBefore();
		TestCopy objt=new TestCopy();
		int T=objt.numberTest(10, 15);
		objt.setName("\tTHE NUMBER IS: ");
		String Name = objt.Number(objt.getName());
		
		System.out.println(Name+T);
	}
	
}

class TestCopy extends abstractTest{


	
	public static void mainBefore() {
		int X=5;
		int Y;
		int Z;
		
		// TODO Auto-generated method stub
		Y=X+A;
		Test1 K=new Test1();
		Z=K.numberTest(9);
		
		int T=K.numberTest(Y, Z);
		K.setName("\tTHE NUMBER IS: ");
		String Name = K.Number(K.getName());
		
		System.out.println(Name+T);
		
	}

	@Override
	 int numberTest(int A) {
		return (A+1);
	}

	@Override
	int numberTest(int A, int B) {
		return (A+B);
	}

	@Override
	public  String Number(String Number) {
		return Number;
	}

}
 abstract class abstractTest implements value{ 
	 private String name;
	 abstract int numberTest(int A);
	 abstract int numberTest(int A, int B);
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
 
 interface value{
	 
	 public int A=5;
	 String Number(String Number);
	 
 }