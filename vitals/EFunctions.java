package vitals;

public enum EFunctions {

	TEMPERATURE("Temperature", 0f, 45f, true),

	SOC("State of Charge", 20f, 80f, true),

	CHARGE_RATE("Charge Rate", 0f, 0.8f, true);

	String name = "";
	Float startThreshold = null;
	Float endThreshold = null;
	Boolean showWarning = false;

	private EFunctions(String name, Float startThreshold, Float endThreshold, Boolean showWarning) {
		this.name = name;
		this.startThreshold = startThreshold;
		this.endThreshold = endThreshold;
		this.showWarning = showWarning;
	}
}
