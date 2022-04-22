
public enum Month {
	JANUARY(31),
	FEBRUARY {
		@Override
		public int numDays() {
			return isLeapYear() ? 29 : 28;
		}
	},
	MARCH(31),
	APRIL(30);
	
	private int daysInMonth;
	
	private Month() {
		this(0);
	}

	private Month(int days) {
//		if (this.name() == "FEBRUARY" && isLeapYear()) {
//			daysInMonth = 29;
//		} else {
			daysInMonth = days;
//		}
	}
	
	private static boolean isLeapYear() {
		return true;
	}
	
	public int numDays() {
		return daysInMonth;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " (" + numDays() + " days)";
	}
}
