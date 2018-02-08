package add;

import javax.jws.WebMethod;

class Addition {
	  @WebMethod
	public int sum(int a,int b)
	{
		 return a+b;
	}
}
