/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2020 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wildfly.security.dynamic.ssl;

/**
 * Exception to indicate a failure related to the DynamicSSLContext.
 *
 * @author <a href="mailto:dvilkola@redhat.com">Diana Krepinska (Vilkolakova)</a>
 */
public class DynamicSSLContextException extends Exception {
    private static final long serialVersionUID = 894798122053539237L;

    public DynamicSSLContextException() {
    }

    public DynamicSSLContextException(String msg) {
        super(msg);
    }

    public DynamicSSLContextException(String message, Throwable cause) {
        super(message, cause);
    }

    public DynamicSSLContextException(Throwable cause) {
        super(cause);
    }
}
