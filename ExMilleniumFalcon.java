package Lista7;

public class ExMilleniumFalcon extends ExNaveEspacial{

	private float ClasseHiperpropulsor;

	public float getClasseHiperpropulsor() {
		return ClasseHiperpropulsor;
	}

	public void setClasseHiperpropulsor(float classeHiperpropulsor) {
		ClasseHiperpropulsor = classeHiperpropulsor;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExMilleniumFalcon [ClasseHiperpropulsor=");
		builder.append(ClasseHiperpropulsor);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
