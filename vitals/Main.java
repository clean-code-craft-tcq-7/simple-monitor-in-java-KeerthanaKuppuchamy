package vitals;

public class Main {

	static boolean isThresholdBreach(int startThreshold, int endThreshold, float currentValue, String errorMessage) {
		if (currentValue < startThreshold || currentValue > endThreshold) {
			System.out.println(errorMessage);
			return false;
		}
		return true;
	}

	static boolean isChargeRateNormal(double limit, float currentValue, String errorMessage) {
		if (currentValue > limit) {
			System.out.println(errorMessage);
			return false;
		}
		return true;
	}

	static boolean batteryIsOk(float temperature, float soc, float chargeRate) {
		boolean isTemperatureNormal = isThresholdBreach(0, 45, temperature, "Temperature is out of range!");
		boolean isSocNormal = isThresholdBreach(20, 80, soc, "State of Charge is out of range!");
		boolean isChargeRateNormal = isChargeRateNormal(0.8, chargeRate, "Charge Rate is out of range!");
		return isTemperatureNormal && isSocNormal && isChargeRateNormal;
	}

	public static void main(String[] args) {
		assert (isThresholdBreach(0, 45, 20, "") == true);
		assert (isThresholdBreach(20, 80, 20, "") == true);
		assert (isChargeRateNormal(0.8, 0.4f, "") == true);
		assert (batteryIsOk(25, 70, 0.7f) == true);
		assert (batteryIsOk(50, 85, 0.0f) == false);
		System.out.println("Some more tests needed");
	}
}
