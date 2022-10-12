package batang.common.domain;

import batang.common.domain.RestResult.ResultCode;

/**
 * 시스템에서 발생하는 공통적으로 사용 가능한 기본적인 예외다.
 */
public class CommonException extends RuntimeException
{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private ResultCode resultCode = ResultCode.Fail;
	
	public CommonException()
	{
		super();
	}

	public CommonException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CommonException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public CommonException(String message)
	{
		super(message);
	}

	public CommonException(Throwable cause)
	{
		super(cause);
	}

	public void setResultCode(ResultCode resultCode)
	{
		this.resultCode = resultCode;
	}
	
	public ResultCode getResultCode()
	{
		return resultCode;
	}
}
