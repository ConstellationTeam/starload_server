package batang.common.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;

public class Domain implements Serializable
{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6198001891149726154L;

	@Override
	public String toString()
	{
		ObjectMapper mapper = new ObjectMapper();
		try
		{
			return mapper.writeValueAsString(this);
		}
		catch (JsonProcessingException e)
		{
			e.printStackTrace();
			return super.toString();
		}
	}
	
	
}
