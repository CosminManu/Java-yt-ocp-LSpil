package switchExpression.thirdRuleDefault;

public class AAA {

	int v = 0;

	private void func() {
		String r = switch (v) {
			case 1 -> "nice";
			case 2 -> "a";
			case 3 -> "b";
			default -> "";
		};
		//		'switch' expression DOES NOT COVER ALL possible input values
		// you need to have a fall-back
		// = DEFAULT
	}

}
