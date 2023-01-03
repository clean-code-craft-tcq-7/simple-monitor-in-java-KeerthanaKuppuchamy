package vitals;

public class Constants {

	public static final String ENGLISH = "English";
	public static final String GERMAN = "German";

	public static final String TEMPERATURE = "Temperature";
	public static final String SOC = "State of Charge";
	public static final String CHARGE_RATE = "Charge Rate";

	public static final String TEMPERATURE_ERROR_ENGLISH = "Temperature is out of range!";
	public static final String SOC_ERROR_ENGLISH = "State of Charge is out of range!";
	public static final String CHARGE_RATE_ERROR_ENGLISH = "Charge Rate is out of range!";

	public static final String TEMPERATURE_ERROR_GERMAN = "Temperatur auberhalb des Bereichs!";
	public static final String CHARGE_RATE_ERROR_GERMAN = "Die Laderate liegt auberhalb des Bereichs!";
	public static final String SOC_ERROR_GERMAN = "Ladezustand auberhalb des Bereichs!";

	public static final String TEMPERATURE_LOW_WARN_ENGLISH = "Temperature is nearing lower threshold limit";
	public static final String TEMPERATURE_HIGH_WARN_ENGLISH = "Temperature is nearing higher threshold limit";
	public static final String SOC_LOW_WARN_ENGLISH = "State of Charge is nearing lower threshold limit";
	public static final String SOC_HIGH_WARN_ENGLISH = "State of Charge is nearing higher threshold limit";
	public static final String CHARGE_RATE_LOW_WARN_ENGLISH = "Charge Rate is nearing lower threshold limit";
	public static final String CHARGE_RATE_HIGH_WARN_ENGLISH = "Charge Rate is nearing higher threshold limit";

	public static final String TEMPERATURE_LOW_WARN_GERMAN = "Die Temperatur nahert sich dem unteren Schwellenwert";
	public static final String TEMPERATURE_HIGH_WARN_GERMAN = "Die Temperatur nahert sich dem oberen Grenzwert";
	public static final String SOC_LOW_WARN_GERMAN = "Der Ladezustand nahert sich dem unteren Schwellenwert";
	public static final String SOC_HIGH_WARN_GERMAN = "Der Ladezustand nahert sich dem oberen Schwellenwert";
	public static final String CHARGE_RATE_LOW_WARN_GERMAN = "Die Laderate nahert sich dem unteren Grenzwert";
	public static final String CHARGE_RATE_HIGH_WARN_GERMAN = "Die Laderate nahert sich dem oberen Grenzwert";
}
