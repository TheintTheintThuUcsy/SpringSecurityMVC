package com.spring.security.config.core;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
/** 
 * Code Explaination
 * 1."SpringSecurityInitializer" class is used to register
 * the DelegatingFilterProxy to use the springSecurityFilterChain.
 * 2.It avoids to write Filter Configuration in web.xml
 * **/
public class SpringSecurityInitializer extends AbstractSecurityWebApplicationInitializer{

}
