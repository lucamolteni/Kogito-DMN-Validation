/**
 *  Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.kie.dmn.validation;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.kie.kogito.rules.RuleUnit;
import org.kie.kogito.rules.RuleUnitInstance;
import org.kie.kogito.rules.units.SessionData;

@Path("/validator")
public class ValidationResource {

    @Inject
    @Named("validationKS")
    RuleUnit<SessionData> ruleUnit;

    @POST
    @Consumes(MediaType.APPLICATION_XML)
    public String validate(String payload) {
        SessionData memory = new SessionData();

//        memory.add(new Person(name, age));

        RuleUnitInstance<SessionData> instance = ruleUnit.createInstance(memory);
        instance.fire();
        return "Ciao";
    }
}