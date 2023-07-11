//******************* how to get the date in format mmddyy *****************

private static String getDate() {
	Date date = new Date();
	SimpleDateFormat form = new SimpleDateFoprmat(“MMddyyyy”);
	String strDate = form.format(date);
	return strDate;
}