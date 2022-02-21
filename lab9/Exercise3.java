package lab.abc;

public class Exercise3 {

	public static void main(String[]args)
	{
		String name="karan";
		String pasw="karan#92698";
		Authentication p=((username,password)->{if(username.equals(name)&&password.equals(pasw))
			return true;
		else
			return false;
		});
		System.out.println(p.checkIdentity("karan", "karan#9n2698"));
	}
}
interface Authentication
{
boolean checkIdentity(String username,String password);	
}
