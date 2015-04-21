/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.tooling.internal.provider;

import org.gradle.tooling.internal.protocol.JvmTestDescriptorVersion1;

import java.io.Serializable;

public class InternalTestDescriptor implements Serializable, JvmTestDescriptorVersion1 {

    private final Object id;
    private final String name;
    private final String testKind;
    private final String displayName;
    private final String suiteName;
    private final String className;
    private final String methodName;
    private final Object parentId;

    public InternalTestDescriptor(Object id, String name, String testKind, String displayName, String suiteName, String className, String methodName, Object parentId) {
        this.id = id;
        this.name = name;
        this.testKind = testKind;
        this.displayName = displayName;
        this.suiteName = suiteName;
        this.className = className;
        this.methodName = methodName;
        this.parentId = parentId;
    }

    public Object getId() {
        return id;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }

    public String getName() {
        return name;
    }

    public String getTestKind() {
        return testKind;
    }

    public String getSuiteName() {
        return suiteName;
    }

    public String getClassName() {
        return className;
    }

    public String getMethodName() {
        return methodName;
    }

    public Object getParentId() {
        return parentId;
    }

}