package batang.common.domain;

public class Site extends Domain
{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 사이트 아이디
	 */
	private String sideIdx;
	
	/**
	 * 사이트 이름
	 */
	private String siteName;

	
	public String getSideIdx()
	{
		return sideIdx;
	}

	public void setSideIdx(String sideIdx)
	{
		this.sideIdx = sideIdx;
	}

	public String getSiteName()
	{
		return siteName;
	}

	public void setSiteName(String siteName)
	{
		this.siteName = siteName;
	}

	
	public static void main(String[] args)
	{
		int i = 0;
		int sum = 0;
		int multi = 1;
		
		for (i = 0 ; i < 10 ; i++)
			sum += i;
			multi *= i;
		
		System.out.println(sum + "  " + multi);
	}
	
	public static String encrypt(String plain)
	{
		
		
		
		
		return null;
	}
}
