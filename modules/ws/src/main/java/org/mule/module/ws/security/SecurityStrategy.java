/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.module.ws.security;

import org.mule.module.cxf.builder.ProxyClientMessageProcessorBuilder;

// TODO: MULE-7241 This interface should not depend on the CXF module.

public interface SecurityStrategy
{
    
    public void apply(ProxyClientMessageProcessorBuilder proxyClientMessageProcessorBuilder);

}
