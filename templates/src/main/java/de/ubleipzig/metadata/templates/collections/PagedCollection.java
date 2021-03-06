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
package de.ubleipzig.metadata.templates.collections;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PagedCollection {
    @JsonProperty("@context")
    private String context;

    @JsonProperty("@id")
    private String id;

    @JsonProperty("@type")
    private String type;

    @JsonProperty("first")
    private String first;

    @JsonProperty("total")
    private Integer total;

    @JsonProperty("within")
    private String within;

    @JsonProperty
    private String label;

    @JsonProperty
    private List<ManifestItem> manifests;

    @JsonProperty
    private String description;

    @JsonProperty
    private String logo;

    @JsonProperty
    private String attribution;

    @JsonProperty
    private String next;

    @JsonProperty
    private List<Object> members;

    @JsonProperty
    private Integer startIndex;

    @JsonProperty
    private String prev;

    @JsonProperty
    private String viewingHint;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getFirst() {
        return first;
    }

    public Integer getTotal() {
        return total;
    }

    public void setFirst(final String first) {
        this.first = first;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getAttribution() {
        return attribution;
    }

    public void setAttribution(String attribution) {
        this.attribution = attribution;
    }

    public List<ManifestItem> getManifests() {
        return manifests;
    }

    public void setManifests(List<ManifestItem> manifests) {
        this.manifests = manifests;
    }

}
