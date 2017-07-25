package com.sample.singleprograms;

public class getrealpath {

	private HttpServletRequest servletRequest;

	public String execute() {
		// The method getRealPath(String) from the type ServletRequest is
		// deprecated
		String filePath = servletRequest.getRealPath("/");
		return filePath;
	}

	public void setServletRequest(HttpServletRequest arg0) {
		this.servletRequest = arg0;
	}

}