package tareadeprogra;
/**
 * 
 * @author Alumno
 *
 */
public class TempDia {

	protected int dia;
	protected int mes;
	protected int a�o;
	protected int tempMax;
	protected int tempMin;
	
	public TempDia() {
		
		dia = 0;
		mes = 0;
		a�o = 0;
		tempMax = 0;
		tempMin = 0;
	}
	/**
	 * 
	 * @param dia
	 * @param mes
	 * @param a�o
	 * @param tempMax
	 * @param tempMin
	 */
	public TempDia(int dia, int mes, int a�o, int tempMax, int tempMin) {
		
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
		this.tempMax = tempMax;
		this.tempMin = tempMin;
		
	}
	/**
	 * 
	 * @return dia del mes
	 */

	public int getDia() {
		return dia;
	}

	/**
	 * para establecer el dia
	 * @param dia
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * 
	 * @return  el mes del a�o
	 */
	public int getMes() {
		return mes;
	}
	/**
	 * para establecer el mes de la medicion.
	 * @param mes
	 */

	public void setMes(int mes) {
		this.mes = mes;
	}
	/**
	 * 
	 * @return el a�o de la medicion.
	 */

	public int getA�o() {
		return a�o;
	}
	/**
	 * para establecer el a�o de la medicion
	 * @param a�o 
	 */

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	/**
	 * 
	 * @return
	 */

	public int getTempMax() {
		return tempMax;
	}
	/**
	 * 
	 * @param tempMax
	 */

	public void setTempMax(int tempMax) {
		this.tempMax = tempMax;
	}
	/**
	 * 
	 * @return
	 */

	public int getTempMin() {
		return tempMin;
	}
	/**
	 * 
	 * @param tempMin
	 */

	public void setTempMin(int tempMin) {
		this.tempMin = tempMin;
	}
	
	/**
	 * @Override
	 */

	
	public String toString() {
		return "TempDia [dia=" + dia + ", mes=" + mes + ", a�o=" + a�o + ", tempMax=" + tempMax + ", tempMin=" + tempMin
				+ "tempMedia=" + ((tempMax+tempMin)/2) + "]";
	}
	
	
}