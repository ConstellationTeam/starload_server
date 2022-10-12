package batang.common.Controller;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;


public class ExcelControllerContext
{
	public void download(HttpServletResponse response, ExcelControllerStrategy strategy)
	{
		try
		{
			download(response, strategy.execute());
		}
		catch (Exception e)
		{
			LoggerFactory.getLogger(getClass()).error(e.getMessage(), e);
			throw new ResourceNotFoundException();
		}
	}
	
	public void download(HttpServletResponse response, File file)
	{
		try
		{
			String fileName = URLEncoder.encode(file.getName(), "UTF-8");
	        response.setContentType("application/x-msdownload");            
	        response.setHeader("Content-disposition", "attachment; filename="+ fileName);
			
			InputStream is = new FileInputStream(file);
			OutputStream os = response.getOutputStream();
			
			byte[] bytes = new byte[1024];
			int length;
			while ((length = is.read(bytes, 0, bytes.length)) > 0)
			{
				os.write(bytes, 0, length);
			}
			
			os.close();
			is.close();
		}
		catch (Exception e)
		{
			LoggerFactory.getLogger(getClass()).error(e.getMessage(), e);
			throw new ResourceNotFoundException();
		}
	}
	
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public static class ResourceNotFoundException extends RuntimeException
	{
		/**
		 * serialVersionUID
		 */
		private static final long serialVersionUID = 1L;

		public ResourceNotFoundException()
		{
			super();
		}
	}
}
