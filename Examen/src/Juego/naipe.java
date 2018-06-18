package Juego;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class naipe {
	
	
	private int Id;
	private ArrayList<carta> cartas;
	
	public naipe(int id) throws Exception {
		super();
		this.Id = id;

		ArrayList<carta> myArray = new ArrayList<carta>();
		
		for (int p=1;p<=4;p++) {
			String pPalo=null;
			 switch (p) {
	            case 1:  pPalo="escudos";
	            
	           
	                     break;
	            case 2:  pPalo="flores";   
	            
	                     break;
	            case 3:  pPalo="estrellas";     
	            
	                     break;
	            case 4:  pPalo="gotas";  
	            
	            	     break;
	            
	        }
			for (int i=1;i<=13;i++) {
				String pNombre = null;
				int pValue =0;
				 switch (i) {
		            case 1:  pNombre="As";
		            		 pValue=1;
		           
		                     break;
		            case 2:  pNombre="2";
           		 			 pValue=2;   		            
		            
		                     break;
		            case 3:  pNombre="3";
           		 		     pValue=3;     		            
		            
		                     break;
		            case 4: pNombre="4";
           		 			pValue=4;    
		            
		                     break;
		            case 5: pNombre="5";
           		 			pValue=5;
					           
		                     break;
		            case 6: pNombre="6";
           		 			pValue=6;  		            
		           
		                     break;
		            case 7: pNombre="7";
           		 			pValue=7;     		            
		           
		                     break;
		            case 8: pNombre="8";
           		 			pValue=8;    
		           
		                     break;
			        case 9: pNombre="9";
           		 			pValue=9;   		            
				           
	                         break;
	                case 10:pNombre="10";
           		 			pValue=10;     		            
	          
	                         break;
	                case 11:pNombre="Jota";
   		 					pValue=10;    
	             
	                               
	                	     break;
	                case 12:pNombre="Quina";
	 						pValue=10;    
         
                             break;
	                case 13:pNombre="Ka";
	 						pValue=10;    
         
                           
            	break;
			}
				 
				 carta cartaNaipe = new carta(pNombre,pPalo,pValue);
				 
				 myArray.add(cartaNaipe);
				
				 System.out.println(pNombre);
				 System.out.println(pPalo);
				 System.out.println(pValue);
		} 
	}
	
		 this.cartas=myArray;
	
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public ArrayList<carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<carta> cartas) {
		this.cartas = cartas;
	}

	public int getLenght() {
		int CartasLenght;
		ArrayList<carta> cartass=this.getCartas();
		CartasLenght=cartass.size();
		
		return CartasLenght;
	}
	
	
	

}
	
