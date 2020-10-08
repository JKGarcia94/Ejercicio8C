
public class App {

	public static void main(String[] args) {
		A p0= new A();
		B p1= new B();
		C p2= new C();
		A p3= new B();
		A p4= new C();
		
		p0=p1;//a)
		p1=p2;//b)
		p2=p4;//c)
		p2=(C)p1;//d)
		p1=(B)p3;//e)
		p2=(C)p4;//f)
		
		

	}

}
