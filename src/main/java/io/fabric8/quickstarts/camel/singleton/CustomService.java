/**
 *  Copyright 2005-2016 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package io.fabric8.quickstarts.camel.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomService {

    private static final Logger LOG = LoggerFactory.getLogger(CustomService.class);

    private boolean started;

    public void start() {
        LOG.info("CustomService has been started on the master pod");
        started = true;
    }

    public boolean isStarted() {
        return started;
    }

    public void stop() {
        LOG.info("CustomService has been stopped on the master pod");
        started = false;
    }

}
