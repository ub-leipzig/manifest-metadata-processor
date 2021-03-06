/*
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

package de.ubleipzig.metadata.templates;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(value = {"motivation", "on", "type", "@type"}, allowGetters = true)
public class Images {

    @JsonProperty("@id")
    private String id;

    private String type;

    @JsonProperty
    private String motivation;

    @JsonProperty
    private String on;

    @JsonProperty
    private Resource resource;


    /**
     * setId.
     *
     * @param id id
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * getAnnoId.
     *
     * @return id
     */
    @JsonIgnore
    public String getAnnoId() {
        return this.id;
    }

    /**
     * getBody.
     *
     * @return TemplateBody
     */
    @JsonIgnore
    public Resource getResource() {
        return this.resource;
    }

    /**
     * setBody.
     *
     * @param resource body
     */
    public void setResource(final Resource resource) {
        this.resource = resource;
    }

    /**
     * setTarget.
     *
     * @param on target
     */
    public void setTarget(final String on) {
        this.on = on;
    }
}
