class Pattern_D {

   public static void main(String []args) {
	   
	   for(int rows = 0 ; rows < 6; rows++) {
		  
		  for (int columns = 1; columns<=6; columns++ ) {
			  if(columns>rows) {
				  System.out.print(columns-rows+" ");
			  } else {
				  System.out.print("  ");
			  }
		  }
		  
		  System.out.println();
	   }
   }
}