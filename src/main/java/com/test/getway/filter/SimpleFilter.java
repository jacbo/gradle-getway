package com.test.getway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class SimpleFilter extends ZuulFilter {

    private static final Logger logger = LoggerFactory.getLogger(SimpleFilter.class);

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        HttpServletResponse response = ctx.getResponse();
        ctx.setSendZuulResponse(false);
        ctx.setResponseBody("hello world");

        logger.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
        logger.info(String.format("response Status : %s, ContentType:  %s", response.getStatus(), response.getContentType()));

        return null;
    }
}
