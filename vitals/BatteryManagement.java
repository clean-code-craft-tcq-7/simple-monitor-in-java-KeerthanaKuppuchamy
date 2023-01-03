package vitals;

public class BatteryManagement {

	static String language = "English";

	static boolean isThresholdBreach(EFunctions eFunction, float currentValue) {
		if (eFunction.showWarning) {
			EarlyWarningExtension.checkWarning(language, eFunction, currentValue);
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
