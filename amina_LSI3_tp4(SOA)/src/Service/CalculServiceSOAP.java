package Service;
@webService(name="CalculWS")
public class CalculServiceSOAP {
	@webMethod(operationName="somme")
	public double  somme (@webParam(name="a")double a ,@webParam(name="b") double b) 
	{
		return (a+b) ;
	}


	
}
