package control_flow_statements;

public class Nested_if_statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		if(a+b>25) {
			System.out.println("Greater than 25");
			}
		else {
			System.out.println("not printed");
			}
		if(a+b<25) {
			System.out.println("less than 25");
			}
		else {
			System.out.println("2nd not printed");
			}
		if(a+b>28) {
			System.out.println("Greater than 28");
			}
		else {
			System.out.println("none of the abobe");
		}

	}

}
