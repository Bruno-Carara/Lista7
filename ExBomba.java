package Lista7;

public class ExBomba {

	private double TotalLitros;
	private float ValorLitro;
	public double getTotalLitros() {
		return TotalLitros;
	}
	public void setTotalLitros(double totalLitros) {
		TotalLitros = totalLitros;
	}
	public float getValorLitro() {
		return ValorLitro;
	}
	public void setValorLitro(float valorLitro) {
		ValorLitro = valorLitro;
	}
	public static boolean abastecerPorLitro(int litros) {
		return true;
	}
	public static boolean abastecerPorValor(double valor) {
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExBomba [TotalLitros=");
		builder.append(TotalLitros);
		builder.append(", ValorLitro=");
		builder.append(ValorLitro);
		builder.append("]");
		return builder.toString();
	}
	
}
