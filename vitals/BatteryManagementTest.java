package vitals;

public class BatteryManagementTest {

	public static void main(String[] args) {
		assert (BatteryManagement.isThresholdBreach(0, 45, 20, "Temperature") == true);
		assert (BatteryManagement.isThresholdBreach(0, 45, 0, "Temperature") == true);
		assert (BatteryManagement.isThresholdBreach(0, 45, 45, "Temperature") == true);

		assert (BatteryManagement.isThresholdBreach(20, 80, 20, "State of Charge") == true);
		assert (BatteryManagement.isThresholdBreach(20, 80, 21, "State of Charge") == true);
		assert (BatteryManagement.isThresholdBreach(20, 80, 81, "State of Charge") == false);

		assert (BatteryManagement.isChargeRateNormal(0.8f, 0.4f, "Charge Rate") == true);
		assert (BatteryManagement.isChargeRateNormal(0.8f, 0.9f, "Charge Rate") == false);

		assert (BatteryManagement.batteryIsOk(25, 70, 0.7f) == true);
		assert (BatteryManagement.batteryIsOk(50, 85, 0.0f) == false);

		System.out.println("Some more tests needed");
	}
}
