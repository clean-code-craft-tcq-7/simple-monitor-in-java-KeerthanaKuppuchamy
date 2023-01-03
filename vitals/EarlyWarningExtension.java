package vitals;

public class EarlyWarningExtension {

	public static void checkWarning(String language, EFunctions eFunction, float currentValue) {
		if (eFunction.showWarning) {
			if (checkForLowWarning(eFunction, currentValue)) {
				LanguageExtension.printMessage(language, eFunction.name + " is nearing lower threshold limit");
			} else if (checkForHighWarning(eFunction, currentValue)) {
				LanguageExtension.printMessage(language, eFunction.name + " is nearing higher threshold limit");
			}
		}
	}

	public static boolean checkForLowWarning(EFunctions eFunction, float currentValue) {
		Float startWarmLimit = eFunction.startThreshold + ((eFunction.endThreshold * 5) / 100);
		return checkValueWithinRange(eFunction.startThreshold, currentValue, startWarmLimit);
	}

	public static boolean checkForHighWarning(EFunctions eFunction, float currentValue) {
		Float endWarmLimit = eFunction.endThreshold - ((eFunction.endThreshold * 5) / 100);
		return checkValueWithinRange(endWarmLimit, currentValue, eFunction.endThreshold);
	}

	public static boolean checkValueWithinRange(float startValue, float currentValue, Float endValue) {
		return (startValue <= currentValue && currentValue <= endValue);
	}
}
