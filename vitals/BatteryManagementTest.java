package vitals;

public class BatteryManagementTest {

	public static void main(String[] args) {
		assert (BatteryManagement.batteryIsOk(2, 78, 0.7f) == true);
		assert (BatteryManagement.batteryIsOk(44, 81, 0.1f) == false);
		assert (BatteryManagement.batteryIsOk(50, 21, 0.0f) == false);

		System.out.println("Some more tests needed");
	}
}
