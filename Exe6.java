
import javax.swing.JOptionPane;


public class Exe6 {

	
	public static void main(String[] args) {
		
		
		String frase = JOptionPane.showInputDialog(null,"\nDigite uma frase:");
		int ind=frase.length();
		for(ind=0;ind<=frase.length();ind++)
		{
			System.out.println("\n"+frase.substring(0,ind));
		}
	    
		for( int x=frase.length();x>=0;x--)
		{
			
			System.out.println("\n"+frase.substring(0,x));
		}
		System.exit(0);
	}

}
