import org.testng.annotations.Test;

public class Applications {
	
	@Test
	public void doLogin() {
		System.out.println("Inside Test Annotation doLogin()");
	}
	
	@Test
	public void passwordChange() {
		System.out.println("Inside test annotation passwordChange()");
	}
	
	@Test
	public void doLogout() {
		System.out.println("Test Annotation doLogout()");
	}

}
