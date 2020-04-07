class exception9 {
	public static void main(String[] args) {
		try
		{
		System.out.println(reverse(""));
		}
		catch(java.lang.Exception e)
		{
		System.out.println("The String was blank");
		}
		finally
		{
		System.out.println("All done");
		}
	}
	public static String reverse(String s) throws java.lang.Exception {
		if(s.length()==0)
		{
		throw new java.lang.Exception();
		}
		String reverseStr = "";
		for(int i=s.length()-1 ; i>=0 ; --i){
		reverseStr+=s.charAt(i);
		}
		return reverseStr;
		}
}