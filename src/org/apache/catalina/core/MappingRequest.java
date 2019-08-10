package org.apache.catalina.core;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

import javax.servlet.AsyncContext;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.apache.catalina.Connector;
import org.apache.catalina.Context;
import org.apache.catalina.HttpRequest;
import org.apache.catalina.Response;
import org.apache.catalina.Wrapper;


/**
 * 
 */

public class MappingRequest
    implements HttpRequest, HttpServletRequest {

    public MappingRequest(String contextPath, String decodedURI,
                          String queryString) {
        this.contextPath = contextPath;
        this.decodedURI = decodedURI;
        this.queryString = queryString;
    }

    protected String contextPath = null;
    protected String decodedURI = null;
    protected String queryString = null;

    protected String pathInfo = null;
    protected String servletPath = null;
    protected Wrapper wrapper = null;

    public String getContextPath() {
        return (contextPath);
    }

    public ServletRequest getRequest() {
        return (this);
    }

    public String getDecodedRequestURI() {
        return decodedURI;
    }

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String query) {
        queryString = query;
    }

    public String getPathInfo() {
        return pathInfo;
    }

    public void setPathInfo(String path) {
        pathInfo = path;
    }

    public String getServletPath() {
        return servletPath;
    }

    public void setServletPath(String path) {
        servletPath = path;
    }

    public Wrapper getWrapper() {
        return (this.wrapper);
    }

    public void setWrapper(Wrapper wrapper) {
        this.wrapper = wrapper;
    }

    public String getAuthorization() { return null; }
    public void setAuthorization(String authorization) {}
    public Connector getConnector() { return null; }
    public void setConnector(Connector connector) {}
    public Context getContext() { return null; }
    public void setContext(Context context) {}
    public String getInfo() { return null; }
    public Response getResponse() { return null; }
    public void setResponse(Response response) {}
    public Socket getSocket() { return null; }
    public void setSocket(Socket socket) {}
    public InputStream getStream() { return null; }
    public void setStream(InputStream input) {}
    public void addLocale(Locale locale) {}
    public ServletInputStream createInputStream() throws IOException {
        return null;
    }
    public void finishRequest() throws IOException {}
    public Object getNote(String name) { return null; }
    public Iterator getNoteNames() { return null; }
    public void removeNote(String name) {}
    public void setContentType(String type) {}
    public void setNote(String name, Object value) {}
    public void setProtocol(String protocol) {}
    public void setRemoteAddr(String remoteAddr) {}
    public void setRemoteHost(String remoteHost) {}
    public void setScheme(String scheme) {}
    public void setServerName(String name) {}
    public void setServerPort(int port) {}
    public Object getAttribute(String name) { return null; }
    public Enumeration getAttributeNames() { return null; }
    public String getCharacterEncoding() { return null; }
    public int getContentLength() { return -1; }
    public void setContentLength(int length) {}
    public String getContentType() { return null; }
    public ServletInputStream getInputStream() throws IOException {
        return null;
    }
    public Locale getLocale() { return null; }
    public Enumeration getLocales() { return null; }
    public String getProtocol() { return null; }
    public BufferedReader getReader() throws IOException { return null; }
    public String getRealPath(String path) { return null; }
    public String getRemoteAddr() { return null; }
    public String getRemoteHost() { return null; }
    public String getScheme() { return null; }
    public String getServerName() { return null; }
    public int getServerPort() { return -1; }
    public boolean isSecure() { return false; }
    public void removeAttribute(String name) {}
    public void setAttribute(String name, Object value) {}
    public void setCharacterEncoding(String enc)
        throws UnsupportedEncodingException {}
    public void addCookie(Cookie cookie) {}
    public void addHeader(String name, String value) {}
    public void addParameter(String name, String values[]) {}
    public void clearCookies() {}
    public void clearHeaders() {}
    public void clearLocales() {}
    public void clearParameters() {}
    public void recycle() {}
    public void setAuthType(String authType) {}
    public void setContextPath(String path) {}
    public void setMethod(String method) {}
    public void setRequestedSessionCookie(boolean flag) {}
    public void setRequestedSessionId(String id) {}
    public void setRequestedSessionURL(boolean flag) {}
    public void setRequestURI(String uri) {}
    public void setSecure(boolean secure) {}
    public void setUserPrincipal(Principal principal) {}
    public String getParameter(String name) { return null; }
    public Map getParameterMap() { return null; }
    public Enumeration getParameterNames() { return null; }
    public String[] getParameterValues(String name) { return null; }
    public RequestDispatcher getRequestDispatcher(String path) {
        return null;
    }
    public String getAuthType() { return null; }
    public Cookie[] getCookies() { return null; }
    public long getDateHeader(String name) { return -1; }
    public String getHeader(String name) { return null; }
    public Enumeration getHeaders(String name) { return null; }
    public Enumeration getHeaderNames() { return null; }
    public int getIntHeader(String name) { return -1; }
    public String getMethod() { return null; }
    public String getPathTranslated() { return null; }
    public String getRemoteUser() { return null; }
    public String getRequestedSessionId() { return null; }
    public String getRequestURI() { return null; }
    public void setDecodedRequestURI(String uri) {}
    public StringBuffer getRequestURL() { return null; }
    public HttpSession getSession() { return null; }
    public HttpSession getSession(boolean create) { return null; }
    public boolean isRequestedSessionIdFromCookie() { return false; }
    public boolean isRequestedSessionIdFromURL() { return false; }
    public boolean isRequestedSessionIdFromUrl() { return false; }
    public boolean isRequestedSessionIdValid() { return false; }
    public boolean isUserInRole(String role) { return false; }
    public Principal getUserPrincipal() { return null; }

/*************************自己加的，解决报错的问题*****************************/
	@Override
	public AsyncContext getAsyncContext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DispatcherType getDispatcherType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLocalAddr() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLocalName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getLocalPort() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRemotePort() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ServletContext getServletContext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAsyncStarted() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAsyncSupported() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AsyncContext startAsync() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AsyncContext startAsync(ServletRequest arg0, ServletResponse arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean authenticate(HttpServletResponse arg0) throws IOException, ServletException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Part getPart(String arg0) throws IOException, IllegalStateException, ServletException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Part> getParts() throws IOException, IllegalStateException, ServletException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void login(String arg0, String arg1) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout() throws ServletException {
		// TODO Auto-generated method stub
		
	}
/*************************自己加的，解决报错的问题*****************************/

}

