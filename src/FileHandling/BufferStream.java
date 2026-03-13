package FileHandling;

public class BufferStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		(
				BufferedReader bufInput = new BufferedReader(new FileReader(args[0]));
				BufferedWrite butOutput = new BufferedWrite(new FileWrite(args[1])) 
					
				
				
		)
		{
			String line = "";
			while((line = bufInput.readLine()) != null ) {
				butfOutput.write(line);
				bufOutput.newLine();
			}
					
		}
		
	
			
	}

}
