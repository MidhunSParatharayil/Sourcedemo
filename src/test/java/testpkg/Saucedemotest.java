package testpkg;

import org.testng.annotations.Test;

import basepackage.Baseclass;
import pagepackage.Saucedemopage;
import pagepkg.baseclass;
import pagepkg.saucedemopage;
import utilities.Excelutility;


public class Saucedemotest extends baseclass
{
	@Test (priority = 1)
	public void LogintoSite()
	{

		saucedemopage ob = new saucedemopage(driver);

        String Excel = "F:\\Luminar\\Saucedemoexcel.xlsx";

        String Sheet = "Sheet1";

        int rowcount = Excelutility.getRowCount(Excel, Sheet);
        
        for (int i=1;i<=rowcount;i++)

        {
                    String Username=Excelutility.getCellValue(Excel, Sheet, i, 0);
                    System.out.println("username---"+Username);
                    String Password=Excelutility.getCellValue(Excel, Sheet, i, 1);
                    System.out.println("password---"+Password);
                    
                    ob.clear();
                    
                    ob.loginmethod(Username, Password);
                    
                    ob.loginbutton();
                    
      			                    
        }
	}
        
        @Test(priority = 2)
        public void AddProductstoCart() throws Exception
    	{
        	saucedemopage ob = new saucedemopage(driver);
        	 
        ob.addtocart();
        
        Thread.sleep(2000);
        
		ob.cart();
		
		Thread.sleep(2000);
		 
        ob.checkout();
        
    	}
        
        @Test(priority = 3)
        public void EnterPersonalDetails() throws Exception
        {
        	saucedemopage ob = new saucedemopage(driver);
        	
            ob.personaldetails();
            
            Thread.sleep(2000);
            
            ob.continueclick();
            
        }
            @Test(priority = 4)
            public void GotoHomeandLogout() throws Exception
            {
            	
            	saucedemopage ob = new saucedemopage(driver);
            	
            	ob.sidemenu();
                ob.home();
                
                Thread.sleep(2000);
                
                ob.sidemenu();
                
                Thread.sleep(2000);
                
                ob.logout();
            	
            }
            
}
        	
        
        
	
	
