package estudos;

public class Main {
		public static void main(String[] args) {
			Hora hora = new Hora();
			
			int h = hora.getHor();
			int m = hora.getMin();
			int s = hora.getSeg();
			int seconds = hora.getSegundos();
			String horaFormatada = hora.getHora1();
			String horaFormatadaAmPm = hora.getHora2();
			
			System.out.printf("Time: %d:%d:%d%n", h, m, s);
			System.out.printf("Time in seconds: %d%n", seconds);
			System.out.printf("TimeFormat: %s%n", horaFormatada);
			System.out.printf("TimeFormat: %s%n", horaFormatadaAmPm);
			
			//método construtor com parametros
			
			Hora hora2 = new Hora(20, 10, 15);
			System.out.printf("Time: %d:%d:%d", hora2.getHor(), hora2.getMin(), hora2.getSeg());
		}
}
