package vitals;

public class LanguageExtension {

	public static void printMessage(String language, String message) {
		String updatedMessage = getUpdatedMessgae(language, message);
		if (updatedMessage == null) {
			System.out.println("No appropriate message available");
		} else {
			System.out.println(updatedMessage);
		}
	}

	private static String getUpdatedMessgae(String language, String message) {
		String updatedMessage = null;
		if (language == "German") {
			switch (message) {
			case Constants.TEMPERATURE_ERROR_ENGLISH:
				updatedMessage = Constants.TEMPERATURE_ERROR_GERMAN;
				break;
			case Constants.TEMPERATURE_LOW_WARN_ENGLISH:
				updatedMessage = Constants.TEMPERATURE_LOW_WARN_GERMAN;
				break;
			case Constants.TEMPERATURE_HIGH_WARN_ENGLISH:
				updatedMessage = Constants.TEMPERATURE_HIGH_WARN_GERMAN;
				break;
			case Constants.SOC_ERROR_ENGLISH:
				updatedMessage = Constants.SOC_ERROR_GERMAN;
				break;
			case Constants.SOC_LOW_WARN_ENGLISH:
				updatedMessage = Constants.SOC_LOW_WARN_GERMAN;
				break;
			case Constants.SOC_HIGH_WARN_ENGLISH:
				updatedMessage = Constants.SOC_HIGH_WARN_GERMAN;
				break;
			case Constants.CHARGE_RATE_ERROR_ENGLISH:
				updatedMessage = Constants.CHARGE_RATE_ERROR_GERMAN;
				break;
			case Constants.CHARGE_RATE_LOW_WARN_ENGLISH:
				updatedMessage = Constants.CHARGE_RATE_LOW_WARN_GERMAN;
				break;
			case Constants.CHARGE_RATE_HIGH_WARN_ENGLISH:
				updatedMessage = Constants.CHARGE_RATE_HIGH_WARN_GERMAN;
				break;
			default:
				updatedMessage = null;
			}
		} else if (language == "English") {
			updatedMessage = message;
		}
		return updatedMessage;
	}
}
