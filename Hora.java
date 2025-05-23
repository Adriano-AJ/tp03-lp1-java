package estudos;

import java.util.Scanner;

public class Hora {
	
	private int hora;
	private int min;
	private int seg;

	private static Scanner sc = new Scanner(System.in);
	
	public Hora() {
		setHor();
		setMin();
		setSeg();
	}
	public Hora(int h, int m, int s) {
		setHor(h);
		setMin(m);
		setSeg(s);
	}
	public void setHor() {
		int hora;
	    boolean entradaValida = false;

	    do {
	        System.out.print("Digite a hora: ");
	        try {
	            hora = sc.nextInt();
	            if (validaHor(hora)) { 
	                this.hora = hora;
	                entradaValida = true;
	            } else {
	                System.out.println("Hora inválida, tente novamente.");
	            }
	        } catch (Exception ex) {
	            System.out.println("Entrada inválida. Digite um número inteiro.");
	            sc.nextLine();
	        }
	    } while (!entradaValida);
	}
	public void setMin() {
		int min;
	    boolean entradaValida = false;
	    
	    do {
	    	System.out.printf("Digite os minutos:");
			try {
				min = sc.nextInt();
				if(validaMin(min)){
					this.min = min;
					entradaValida = true;
				}else {
					System.out.printf("Minuto invalido.");
				}
			}catch(Exception ex){
				System.out.printf("Erro: %s", ex);
			}
	   }while(!entradaValida);
	}
	public void setSeg() {
		int seg;
		boolean entradaValida = false;
		
		do {
			System.out.printf("Digite os segundos:");
			try {
				seg = sc.nextInt();
				if(validaSeg(seg)) {
					this.seg = seg;
					entradaValida = true;
				}else {
					System.out.printf("Segundos invalidos.");
				}
			}catch(Exception ex){
				System.out.printf("Erro: %s", ex);
			}
		}while(!entradaValida);
	}
	public void setHor(int h) {
		if(validaHor(h)) {
			this.hora = h;
		}else {
			this.hora = 0;
		}
	}
	public void setMin(int m) {
		if(validaMin(m)) {
			this.min = m;
		}else {
			this.min = 0;
		}
	}
	public void setSeg(int s) {
		if(validaSeg(s)) {
			this.seg = s;
		}else {
			this.seg = 0;
		}
	}
	public int getHor() {
		return this.hora;
	}
	public int getMin() {
		return this.min;
	}
	public int getSeg() {
		return this.seg;
	}
	public String getHora1() {
		String horaFormatada = String.format("%02d:%02d:%02d", hora, min, seg);
		return horaFormatada;
	}
	public String getHora2() {
		
		String periodo;
		
		if(hora < 12) {
			periodo = "AM";
		}else {
			periodo = "PM";
		}
		
		String horaFormatada = String.format("%02d:%02d:%02d - %s", hora, min, seg, periodo);
		return horaFormatada;
	}
	public int getSegundos() {

		int segundos;
		
		segundos = hora*60*60 + min*60 + seg;
		return segundos;
	}
	
	private boolean validaHor(int h) {
		if(h >= 0 && h < 24) {
			return true;
		}
		else {
			return false;
		}
	}
	private boolean validaMin(int m) {
		if(m >= 0 && m < 60) {
			return true;
		}
		else {
			return false;
		}
	}
	private boolean validaSeg(int s) {
		if(s >+ 0 && s < 60) {
			return true;
		}
		else {
			return false;
		}
	}

}
