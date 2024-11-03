package Lista7;

public class ExApolo11 extends ExNaveEspacial{

	private String TipoCombustivel;

	public String getTipoCombustivel() {
		return TipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		TipoCombustivel = tipoCombustivel;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExApolo11 [TipoCombustivel=");
		builder.append(TipoCombustivel);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
