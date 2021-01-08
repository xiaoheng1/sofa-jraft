/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.jraft.rpc.impl;

import com.alipay.remoting.exception.CodecException;
import com.google.protobuf.Message;

/**
 * @author: baozi
 */
public interface GrpcSerializationTransfer<JAVA_BEAN, PROTOBUF_BEAN extends Message> {

    /**
     * ordinary java object transfer to protobuf java object
     *
     * @param protobufBean protobuf java object
     * @return ordinary java object
     * @throws CodecException
     */
    JAVA_BEAN protoBufTransJavaBean(final PROTOBUF_BEAN protobufBean) throws CodecException;

    /**
     * protobuf java object transfer to ordinary java object
     *
     * @param javaBean ordinary java object
     * @return protobuf java object
     * @throws CodecException
     */
    PROTOBUF_BEAN javaBeanTransProtobufBean(final JAVA_BEAN javaBean) throws CodecException;
}