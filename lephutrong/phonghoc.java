package lephutrong;

public abstract class phonghoc {
     public abstract boolen datchuan();
     protected String maphong,daynha;
     protected double dientich;
     protected int sobongden;
     public String getmaphong() {
    	 return maphong;
     }
     public void setmaphong(String maphong) {
    	 this.maphong = maphong;
      }
     public String getdaynha() {
    	 return daynha;                              
     }
     public void setdaynha(String daynha ) {
    	 this.daynha = daynha;
     }
     public double getdientich() {
    	 return dientich;
     }
     public void setsobongden(int sobongden) {
    	 if(sobongden >0) {
    		 this.sobongden;
    	 } else {
    		 throw new exception("1");
    	    }
    	     public boolen dusang() {
    	    	 if (getdientich()/getsobongden ()<=10) {
    	    		 return true;
    	    	 } else {
    	    		 return false ;
    	    	 }
    public  phonghoc(String maphong,String datnha, double dientich,int sobongden) throws Exception {	    	                   
    	super();
    	this.maphong= maphong;
    	this.daynha = daynha;
    	this.dientich = dientich; 
    	if (sobongden >0 ) {
    		this.sobongden= sobongden;
    	} else {
    		throw new exception ("1");
    	}
    }
    	     }
     }
     
}
