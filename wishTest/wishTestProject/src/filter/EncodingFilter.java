package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter {
	private String encoding;
	
	@Override
	public void init(FilterConfig config) throws ServletException {
		this.encoding = config.getInitParameter("encoding");
		
		if(this.encoding == null || this.encoding.length() < 1) {
			this.encoding = "UTF-8";
		}
		
		config.getServletContext().setAttribute("encoding", this.encoding);
		
		System.out.println("<EncodingFilter - doFilter() 알림> : 설정된 encoding : " + this.encoding);
	}
	
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.setCharacterEncoding(this.encoding);
		response.setContentType("text/html;charset=" + this.encoding);
		
		chain.doFilter(request, response);
	}
	
	
	public void destroy() { };
}
