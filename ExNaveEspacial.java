package Lista7;

public class ExNaveEspacial {

	private double VelocidadeMaxima;

	public double getVelocidadeMaxima() {
		return VelocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		VelocidadeMaxima = velocidadeMaxima;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExNaveEspacial [VelocidadeMaxima=");
		builder.append(VelocidadeMaxima);
		builder.append("]");
		return builder.toString();
	}
}
