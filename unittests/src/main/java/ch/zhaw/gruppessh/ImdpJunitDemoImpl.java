package ch.zhaw.gruppessh;


public class ImdpJunitDemoImpl implements IMdpJunitDemo {

	public boolean isEmpty(String s) {
		return s == null || s.isEmpty();
	}

	public String capitalize(String s) {
		if (s.isEmpty()) {
			return "";
		} else {
			return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
		}
	}

	public String reverse(String s) throws NullPointerException {
		return new StringBuilder(s).reverse().toString();
	}

	public String join(String... strings) {
		StringBuilder sb = new StringBuilder();
		for (String s : strings) {
			if (sb.length() != 0) {
				sb.append(' ');
			}
			sb.append(s);
		}
		return sb.toString();
	}

	
	
}
