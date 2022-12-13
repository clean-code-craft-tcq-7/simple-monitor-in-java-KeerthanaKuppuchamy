package vitals;

public class Main {

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

	public static void main(String[] args) {
		assert (isThresholdBreach(0, 45, 20, "Temperature") == true);
		assert (isThresholdBreach(0, 45, 0, "Temperature") == true);
		assert (isThresholdBreach(0, 45, 45, "Temperature") == true);

		assert (isThresholdBreach(20, 80, 20, "State of Charge") == true);
		assert (isThresholdBreach(20, 80, 21, "State of Charge") == true);
		assert (isThresholdBreach(20, 80, 81, "State of Charge") == false);

		assert (isChargeRateNormal(0.8f, 0.4f, "Charge Rate") == true);
		assert (isChargeRateNormal(0.8f, 0.9f, "Charge Rate") == false);

		assert (batteryIsOk(25, 70, 0.7f) == true);
		assert (batteryIsOk(50, 85, 0.0f) == false);

		System.out.println("Some more tests needed");
	}
}
