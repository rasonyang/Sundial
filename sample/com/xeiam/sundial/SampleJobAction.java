/**
 * Copyright 2011 Xeiam LLC.
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
package com.xeiam.sundial;

public class SampleJobAction extends JobAction {

    @Override
    public void doRun() {
        // WorkflowContext lContext = getWorkflowContext();
        // System.out.println("xyz");
        // String xyz = (String) lContext.getRequiredValue("xyz");
        // System.out.println(xyz);
        logDebug("Test Action Log!");

    }

}
