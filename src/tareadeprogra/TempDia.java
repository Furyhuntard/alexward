package tareadeprogra;
/**
 * 
 * @author Alumno
 *
 */
public class TempDia {

	protected int dia;
	protected int mes;
	protected int año;
	protected int tempMax;
	protected int tempMin;
	
	public TempDia() {
		
		dia = 0;
		mes = 0;
		año = 0;
		tempMax = 0;
		tempMin = 0;
	}
	/**
	 * 
	 * @param dia
	 * @param mes
	 * @param año
	 * @param tempMax
	 * @param tempMin
	 */
	public TempDia(int dia, int mes, int año, int tempMax, int tempMin) {
		
		this.dia = dia;
		this.mes = mes;
		this.año = año;
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
	 * @return  el mes del año
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
	 * @return el año de la medicion.
	 */

	public int getAño() {
		return año;
	}
	/**
	 * para establecer el año de la medicion
	 * @param año 
	 */

	public void setAño(int año) {
		this.año = año;
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
		return "TempDia [dia=" + dia + ", mes=" + mes + ", año=" + año + ", tempMax=" + tempMax + ", tempMin=" + tempMin
				+ "tempMedia=" + ((tempMax+tempMin)/2) + "]";
	}
	
	
}