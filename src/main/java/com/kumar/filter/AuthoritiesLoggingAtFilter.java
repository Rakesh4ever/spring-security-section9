package com.kumar.filter;

import jakarta.servlet.*;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * @author RakeshKumar created on 24/01/24
 */

public class AuthoritiesLoggingAtFilter implements Filter {
    private final Logger LOG = Logger.getLogger(AuthoritiesLoggingAtFilter.class.getName());

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        LOG.info("Authentication Validation is in progress");
        chain.doFilter(request, response);
    }

}
