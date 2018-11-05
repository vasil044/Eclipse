
public class TercerProceso {
	public void ejecutar(String ruta){
		 ProcessBuilder pb;
		 try {
			 pb = new ProcessBuilder(ruta);
			 pb.start();
		 } catch (Exception e) {
			 // TODO Auto-generated catch block
			 e.printStackTrace();
		 }
	}
		 
	public static void main(String[] args) {
		 String ruta="C:\\Program Files";
		 TercerProceso lp=new TercerProceso();
		 lp.ejecutar(ruta);
		 System.out.println("Finalizado");
	}
		
}
