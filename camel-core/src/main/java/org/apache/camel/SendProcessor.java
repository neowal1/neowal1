/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel;

/**
 * @version $Revision$
 */
public class SendProcessor<E> implements Processor<E> {
    private Endpoint<E> destination;

    public SendProcessor(Endpoint<E> destination) {
        this.destination = destination;
    }

    public void onExchange(E exchange) {
        destination.send(exchange);
    }

    public Endpoint<E> getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return "sendTo(" + destination + ")";
    }
}
