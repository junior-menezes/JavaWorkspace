package util;

public class CotacaoDolar {
	
	public static final double IOF = 0.06;
	
	public static double Cotacao(double valorD, double quantD){
		return (valorD * quantD) * (1.0 + IOF);
		
	}
}
