/*
 * Copyright © 2017 camunda services GmbH (info@camunda.com)
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
package io.zeebe.monitor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "INCIDENT")
public class IncidentEntity {

  @Id
  @Column(name = "ID_")
  private String id;

  @Column(name = "KEY_")
  private long key;

  @Column(name = "INTENT_")
  private String intent;

  @Column(name = "WORKFLOW_INSTANCE_KEY_")
  private long workflowInstanceKey;

  @Column(name = "ACTIVITY_INSTANCE_KEY_")
  private long activityInstanceKey;

  @Column(name = "JOB_KEY_")
  private long jobKey;

  @Column(name = "ERROR_TYPE_")
  private String errorType;

  @Column(name = "ERROR_MSG_")
  private String errorMessage;

  @Column(name = "TIMESTAMP_")
  private long timestamp;

  public String getErrorType() {
    return errorType;
  }

  public IncidentEntity setErrorType(String errorType) {
    this.errorType = errorType;
    return this;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public IncidentEntity setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public long getIncidentKey() {
    return key;
  }

  public void setKey(long incidentKey) {
    this.key = incidentKey;
  }

  public long getWorkflowInstanceKey() {
    return workflowInstanceKey;
  }

  public void setWorkflowInstanceKey(long workflowInstanceKey) {
    this.workflowInstanceKey = workflowInstanceKey;
  }

  public long getActivityInstanceKey() {
    return activityInstanceKey;
  }

  public void setActivityInstanceKey(long activityInstanceKey) {
    this.activityInstanceKey = activityInstanceKey;
  }

  public long getJobKey() {
    return jobKey;
  }

  public void setJobKey(long jobKey) {
    this.jobKey = jobKey;
  }

  public String getIntent() {
    return intent;
  }

  public void setIntent(String intent) {
    this.intent = intent;
  }

  public long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }
}
