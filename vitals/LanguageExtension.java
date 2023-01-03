package vitals;

import java.util.HashMap;
import java.util.Map;

public class LanguageExtension {

	public static void printMessage(String language, String message) {
		Map<String, Map<String, String>> languageMap = generateMap();
		if (languageMap.containsKey(language)) {
			Map<String, String> messageMap = languageMap.get(language);
			if (messageMap.containsKey(message)) {
				System.out.println(messageMap.get(message));
			}
		}
	}

	private static Map<String, Map<String, String>> generateMap() {
		Map<String, Map<String, String>> languageMap = new HashMap<String, Map<String, String>>();
		Map<String, String> englishMessageMap = new HashMap<String, String>();
		Map<String, String> germanMessageMap = new HashMap<String, String>();

		englishMessageMap.put(Constants.TEMPERATURE_ERROR_ENGLISH, Constants.TEMPERATURE_ERROR_ENGLISH);
		englishMessageMap.put(Constants.SOC_ERROR_ENGLISH, Constants.SOC_ERROR_ENGLISH);
		englishMessageMap.put(Constants.CHARGE_RATE_ERROR_ENGLISH, Constants.CHARGE_RATE_ERROR_ENGLISH);
		englishMessageMap.put(Constants.TEMPERATURE_LOW_WARN_ENGLISH, Constants.TEMPERATURE_LOW_WARN_ENGLISH);
		englishMessageMap.put(Constants.TEMPERATURE_HIGH_WARN_ENGLISH, Constants.TEMPERATURE_HIGH_WARN_ENGLISH);
		englishMessageMap.put(Constants.SOC_LOW_WARN_ENGLISH, Constants.SOC_LOW_WARN_ENGLISH);
		englishMessageMap.put(Constants.SOC_HIGH_WARN_ENGLISH, Constants.SOC_HIGH_WARN_ENGLISH);
		englishMessageMap.put(Constants.CHARGE_RATE_LOW_WARN_ENGLISH, Constants.CHARGE_RATE_LOW_WARN_ENGLISH);
		englishMessageMap.put(Constants.CHARGE_RATE_HIGH_WARN_ENGLISH, Constants.CHARGE_RATE_HIGH_WARN_ENGLISH);

		germanMessageMap.put(Constants.TEMPERATURE_ERROR_ENGLISH, Constants.TEMPERATURE_ERROR_GERMAN);
		germanMessageMap.put(Constants.SOC_ERROR_ENGLISH, Constants.SOC_ERROR_GERMAN);
		germanMessageMap.put(Constants.CHARGE_RATE_ERROR_ENGLISH, Constants.CHARGE_RATE_ERROR_GERMAN);
		germanMessageMap.put(Constants.TEMPERATURE_LOW_WARN_ENGLISH, Constants.TEMPERATURE_LOW_WARN_GERMAN);
		germanMessageMap.put(Constants.TEMPERATURE_HIGH_WARN_ENGLISH, Constants.TEMPERATURE_HIGH_WARN_GERMAN);
		germanMessageMap.put(Constants.SOC_LOW_WARN_ENGLISH, Constants.SOC_LOW_WARN_GERMAN);
		germanMessageMap.put(Constants.SOC_HIGH_WARN_ENGLISH, Constants.SOC_HIGH_WARN_GERMAN);
		germanMessageMap.put(Constants.CHARGE_RATE_LOW_WARN_ENGLISH, Constants.CHARGE_RATE_LOW_WARN_GERMAN);
		germanMessageMap.put(Constants.CHARGE_RATE_HIGH_WARN_ENGLISH, Constants.CHARGE_RATE_HIGH_WARN_GERMAN);

		languageMap.put(Constants.ENGLISH, englishMessageMap);
		languageMap.put(Constants.GERMAN, germanMessageMap);
		return languageMap;
	}
}
