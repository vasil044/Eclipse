import java.io.IOException;

public class SegundoProceso {
	public static void main(String[] args) {
		 try {
			 Runtime runtime = Runtime.getRuntime();
			 Process process = runtime.exec("mspaint.exe");
			 int retorno = process.waitFor();
			 //process.destroy();
		 } catch (IOException ex) {
			 ex.printStackTrace();
		 }catch(InterruptedException ex){
			 System.err.println ("El proceso hijo finalizó de forma incorrecta");
			 System.exit(-1);
		 }
		
	}

}
