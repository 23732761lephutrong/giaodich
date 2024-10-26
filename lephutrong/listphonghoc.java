package lephutrong;

public class listphonghoc {
   list < phonghoc > Is;
   public list phonghoc () {
	   Is = new ArrayList<phonghoc>(2)
   }
   public boolen themphong(phonghoc p) {{
	   if (Is.contains(p)) {
		   return false;
	   } else { Is.add(p);
	     return true;
	   }
   }
   public int sophonghoc() {
	   return Is.size();
   }
   public boolen xoaphong(String maphong) {
	   for (Phonghoc ph : Is)
		   if (ph.maphong.equalsIgnoreCase(maphong)) {
			   ls.remove(ls);
		   }
	   return false ;
   }
   public List<phonghoc> Xuatphonghoc(){
	   return ls;
	   }
   public list<phonghoc> dansachphongdatchuan(){
	  list<phonghoc> dsDc  = new ArrayList<phonghoc>();
	  for  (phonghoc ph : ls )
		  if (ph.datchuan())
			  dsDC.add(ph)
			  return dsDc;
   }
   public void sapxep () {
	   Collection.sort(ls, new comparator <phonghoc>() ){                   
		   @override
		   public int compare(phonghoc o1,phongho o2) {
			   String x= new String(o1.getmaphong()) ;
			   String y = new String(o2.getmaphong()) ;
			   return x.compareToIgnoreCase(y);
		   }
	   }
   }
   public boolean Sobongden (string maphong,int sobong) throws exception{
	   for (phonghoc ph: ls)
		    if (maphong.equalsIgnorecase(ph.getmaphong())) {
		    	ph.setsobongden(sobong);
		    	return true;
		    }
	   return false ;
   }
   
   
   }
   
   
