
public class Test {

public static void main(String[] args){
	graduate a=new graduate("a","男",22,4000,5000);
	graduate b=new graduate("b","女",22,4000,5000);
	if (a.pay-a.fee<=1000){
		System.out.println("应交税费："+(a.pay-a.fee)*0.03);
	} if (a.pay-a.fee>1000){
		System.out.println("应交税费："+30+(a.pay-a.fee-1000)*0.1);
	} 
	
}
}

 


