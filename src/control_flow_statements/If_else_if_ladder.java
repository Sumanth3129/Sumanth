package control_flow_statements;

public class If_else_if_ladder {

	public static void main(String[] args) {
		/*if(logic){
		 * statement
		 * }else if(logic){
		 * statement
		 * }else if(logic){
		 * statement
		 * }else{
		 * statement}
		 */
		int a=10;
		int b=20;
		if(a+b>25) {
			System.out.println("Greater than 25");
		}
		else if (a+b<25) {
			System.out.println("Less than 25");
		}
		else if (a+b>28) {
			System.out.println("Greater than 28");
		}
		else {
			System.out.println("None of the above");
		}
	}

}
