package switchExpression.thirdRuleDefault;

public class AEnum {

	String getWeather(Season v){
		var a = switch (v){
			case AUTUMN -> "rainy";
			case SPRING -> "nice";
			case SUMMER -> "hot gagici mare";
			case WINTER -> "snow ski visinata";
			default -> "stai acase.";
		};
		// no default because all values in enum were covered
		//BUT if someone adds a new value => not compile => add default
		return a;
	}

}
