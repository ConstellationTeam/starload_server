package batang.common.domain;

/**
 * REST API 결과를 나타내는 클래스다.
 */
public class RestResult extends Domain
{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public static enum ResultCode
	{
		Success,
		
		EmailDuplicated,	// 이메일(사용자 아이디)이 중복되었음
		PhoneNumberDuplicated, 	// 전화번호가 중복되었음.
		UserNotFound,	// 존재하지 않는 사용자
		
		CertificationCodeNotIssued,	// 인증 코드가 아직 발급되지 않았음
		CertificationCodeExpired,	// 인증 코드가 만료되었음
		CertificationCodeMismatch,	// 인증 코드가 올바르지 않음
		
		PasswordMismatch,	// 비밀번호가 올바르지 않음
		NotAuthorized, 	// 사용 권한이 없음
		
		DatabaseFail,
		AccessDenied,
		InvalidParameter,
		Fail,
		DataNotExist,
		InvalidSession,
		BadCredentials,
	}
	
	
	/**
	 * 결과 코드
	 */
	private ResultCode resultCode = ResultCode.Success;
	
	/**
	 * 결과 메시지
	 */
	private String resultMessage;
	
	/**
	 * 결과 값
	 */
	private Object data;

	
	public ResultCode getResultCode()
	{
		return resultCode;
	}

	public void setResultCode(ResultCode resultCode)
	{
		this.resultCode = resultCode;
	}

	public String getResultMessage()
	{
		return resultMessage;
	}

	public void setResultMessage(String resultMessage)
	{
		this.resultMessage = resultMessage;
	}

	public Object getData()
	{
		return data;
	}

	public void setData(Object data)
	{
		this.data = data;
	}
}
