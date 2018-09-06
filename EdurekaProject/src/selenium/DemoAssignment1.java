package selenium;

public class DemoAssignment1 {

	public static void main(String[] args) {
	
		Assignment1 As1= new Assignment1();
		As1.invokeBrowser();
		String titleofthepage = As1.getPageTitle();
		System.out.println("Title Of the Page :" +titleofthepage);
		As1.navigateCommands();
		
		As1.closeBrowser();
	}

}
