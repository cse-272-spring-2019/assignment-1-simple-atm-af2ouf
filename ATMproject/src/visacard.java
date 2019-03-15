
public class  visacard  {
         int s;
         int k;
         int i =-1;
	     double accountbalance;
	     String visanumber;
	     String[] transaction = new String[5];
	     

	    public visacard(double accountbalance, String visanumber){
	        this.accountbalance=accountbalance;
	        this.visanumber=visanumber;
	    }
	    public void setAccountbalance(double accountbalance) {
	        this.accountbalance = accountbalance;
	    }
	    public double getAccountbalance()
	    {          if(k==5){
			k=4;
            for(int i=0;i<4;i++)
                transaction[i]=transaction[i+1] ;
   
    }
    if(s==5)
         s=4;
    
     transaction[k]="Viewed balance: "+accountbalance;
     k++;
     s++;
	    	return this.accountbalance;
	    }
	    public String getVisanumber() {
	        return visanumber;
	    }
	    public void setVisanumber(String visanumber){
	        this.visanumber=visanumber;
	    }
	     
	    
	    public  void deposit(double ammount)
		{
			
			accountbalance=accountbalance+ammount;
	
			if(k==5){
				k=4;
	                        for(int i=0;i<4;i++)
	                            transaction[i]=transaction[i+1] ;
	               
	                }
	                if(s==5)
	                     s=4;
	                
			transaction[k]="Deposit: "+ammount;
			k++;
	        s++;
			
		}
		
		public  boolean withdraw(double ammount)
		{
			if(ammount<accountbalance){
			accountbalance=accountbalance - ammount;
	              if(k==5){
				k=4;
	                        for(int i=0;i<4;i++)
	                            transaction[i]=transaction[i+1] ;
	               
	                }
	                if(s==5)
	                     s=4;
	                
			transaction[k]="Withdraw: "+ammount;
			k++;
	                s++;
	                return true;
	                        }
	                
	                else{	               
                     
	                 return false;
	                }
	                
		}
		public boolean login(String x) {
			if(x.equals(visanumber))
				return true;
			else 
				return false;
		}
		
		
		public String prev() {
			if(s==-1)
				return("No previous transactions");
			return(transaction[s--]);
		}
		public String next()
		{   if(s==5)
		{
			return("No following transactions");
		} else
			return(transaction[s++]);
		}
		
		
		
		
}
	      
