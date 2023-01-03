package vitals;

public class BatteryManagement {

	static String language = "English";

	static boolean isThresholdBreach(EFunctions eFunction, float currentValue) {
		if (eFunction.showWarning) {
			if (EarlyWarningExtension.checkForLowWarning(eFunction, currentValue)) {
				LanguageExtension.printMessage(language, eFunction.name + " is nearing lower threshold limit");
			} else if (EarlyWarningExtension.checkForHighWarning(eFunction, currentValue)) {
				LanguageExtension.printMessage(language, eFunction.name + " is nearing higher threshold limit");
			}
		}
		if (currentValue < eFunction.startThreshold || currentValue > eFunction.endThreshold) {
			LanguageExtension.printMessage(language, eFunction.name + " is out of range!");
			return false;
		}
		return true;
	}

	static boolean batteryIsOk(float temperature, float soc, float chargeRate) {
		boolean isTemperatureNormal = isThresholdBreach(EFunctions.TEMPERATURE, temperature);
		boolean isSocNormal = isThresholdBreach(EFunctions.SOC, soc);
		boolean isChargeRateNormal = isThresholdBreach(EFunctions.CHARGE_RATE, chargeRate);
		return isTemperatureNormal && isSocNormal && isChargeRateNormal;
	}

}
