/* Licensed under the Apache License, Version 2.0 (the "License");
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
package org.camunda.bpm.engine.rest.sub.runtime;

import java.io.InputStream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.camunda.bpm.engine.rest.dto.runtime.VariableInstanceDto;

/**
 *
 * @author Daniel Meyer
 */
public interface VariableInstanceResource {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public VariableInstanceDto getVariable();


  @GET
  @Path("/data")
  @Produces(MediaType.APPLICATION_OCTET_STREAM)
  public InputStream getBinaryVariable();

}
