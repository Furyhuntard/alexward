package tareadeprogra;
/**
 * @author Alumno
 *
 */
public class TempHumDia extends TempDia {
	
	int humMax;
	int humMin;
	
	
	/**
	 * @param dia
	 * @param mes
	 * @param a�o
	 * @param tempMax
	 * @param tempMin
	 * @param humMax
	 * @param humMin
	 */
	public TempHumDia(int dia, int mes, int a�o, int tempMax, int tempMin, int humMax, int humMin) {
		super(dia,mes,a�o,tempMax, tempMin);
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
		this.tempMax = tempMax;
		this.tempMin = tempMin;
		this.humMax = humMax;
		this.humMin = humMin;
	}
	/**
	 * @return
	 */
	public int getHumMax() {
		return humMax;
	}




	/**
	 * @param humMax
	 */
	public void setHumMax(int humMax) {
		this.humMax = humMax;
	}




	/**
	 * @return
	 */
	public int getHumMin() {
		return humMin;
	}




	/**
	 * @param humMin
	 */
	public void setHumMin(int humMin) {
		this.humMin = humMin;
	}
	/* 
	 * @Override
	 * @see tareadeprogra.TempDia#toString()
	 */
	@Override
	public String toString() {
		return "TempHumDia [humMax=" + humMax + ", humMin=" + humMin + ", dia=" + dia + ", mes=" + mes + ", a�o=" + a�o
				+ ", tempMax=" + tempMax + ", tempMin=" + tempMin + "]";
	}
}