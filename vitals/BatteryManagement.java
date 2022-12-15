package vitals;

public class BatteryManagement {

	static boolean isThresholdBreach(float startThreshold, float endThreshold, float currentValue,
			String errorMessage) {
		if (currentValue < startThreshold || currentValue > endThreshold) {
			System.out.println(errorMessage + " is out of range!");
			return false;
		}
		return true;
	}

	static boolean isChargeRateNormal(float limit, float currentValue, String errorMessage) {
		if (currentValue > limit) {
			System.out.println(errorMessage + " is out of range!");
			return false;
		}
		return true;
	}

	static boolean batteryIsOk(float temperature, float soc, float chargeRate) {
		boolean isTemperatureNormal = isThresholdBreach(0, 45, temperature, "Temperature");
		boolean isSocNormal = isThresholdBreach(20, 80, soc, "State of Charge");
		boolean isChargeRateNormal = isChargeRateNormal(0.8f, chargeRate, "Charge Rate");
		return isTemperatureNormal && isSocNormal && isChargeRateNormal;
	}
}
