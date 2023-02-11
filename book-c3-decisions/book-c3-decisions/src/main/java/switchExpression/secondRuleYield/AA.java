package switchExpression.secondRuleYield;

public class AA {

	int m = 10;
	int f = 100;

	void function() {
		var a = switch (m) {
			case 1 -> "abcd";
			case 2 -> {
				yield "mnop";		// 'yield' = 'return'; MANDATORY if switch return a value (var, int, String etc)
			}				// no ; 
			case 3 -> {
				if (f > 10) {
					yield "qrt";
				} else {
					yield "trq";
				}
			}			// no ;
			default -> "qwerty";
		};
	}
}
/*
NO YIELD where must be => Switch expression rule should produce result in all execution paths
NO ; at case BLOCKS
 */
