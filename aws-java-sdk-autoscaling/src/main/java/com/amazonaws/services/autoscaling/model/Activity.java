/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * Describes scaling activity, which is a long-running process that
 * represents a change to your Auto Scaling group, such as changing its
 * size or replacing an instance.
 * </p>
 */
public class Activity implements Serializable, Cloneable {

    /**
     * The ID of the activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String activityId;

    /**
     * The name of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * A friendly, more verbose description of the activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String description;

    /**
     * The reason the activity began.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String cause;

    /**
     * The start time of the activity.
     */
    private java.util.Date startTime;

    /**
     * The end time of the activity.
     */
    private java.util.Date endTime;

    /**
     * The current status of the activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WaitingForSpotInstanceRequestId, WaitingForSpotInstanceId, WaitingForInstanceId, PreInService, InProgress, WaitingForELBConnectionDraining, MidLifecycleAction, Successful, Failed, Cancelled
     */
    private String statusCode;

    /**
     * A friendly, more verbose description of the activity status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String statusMessage;

    /**
     * A value between 0 and 100 that indicates the progress of the activity.
     */
    private Integer progress;

    /**
     * The details about the activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String details;

    /**
     * The ID of the activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The ID of the activity.
     */
    public String getActivityId() {
        return activityId;
    }
    
    /**
     * The ID of the activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param activityId The ID of the activity.
     */
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }
    
    /**
     * The ID of the activity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param activityId The ID of the activity.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Activity withActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }

    /**
     * The name of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name of the Auto Scaling group.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Activity withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * A friendly, more verbose description of the activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return A friendly, more verbose description of the activity.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A friendly, more verbose description of the activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param description A friendly, more verbose description of the activity.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A friendly, more verbose description of the activity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param description A friendly, more verbose description of the activity.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Activity withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The reason the activity began.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The reason the activity began.
     */
    public String getCause() {
        return cause;
    }
    
    /**
     * The reason the activity began.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param cause The reason the activity began.
     */
    public void setCause(String cause) {
        this.cause = cause;
    }
    
    /**
     * The reason the activity began.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param cause The reason the activity began.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Activity withCause(String cause) {
        this.cause = cause;
        return this;
    }

    /**
     * The start time of the activity.
     *
     * @return The start time of the activity.
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * The start time of the activity.
     *
     * @param startTime The start time of the activity.
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * The start time of the activity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime The start time of the activity.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Activity withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * The end time of the activity.
     *
     * @return The end time of the activity.
     */
    public java.util.Date getEndTime() {
        return endTime;
    }
    
    /**
     * The end time of the activity.
     *
     * @param endTime The end time of the activity.
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }
    
    /**
     * The end time of the activity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endTime The end time of the activity.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Activity withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * The current status of the activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WaitingForSpotInstanceRequestId, WaitingForSpotInstanceId, WaitingForInstanceId, PreInService, InProgress, WaitingForELBConnectionDraining, MidLifecycleAction, Successful, Failed, Cancelled
     *
     * @return The current status of the activity.
     *
     * @see ScalingActivityStatusCode
     */
    public String getStatusCode() {
        return statusCode;
    }
    
    /**
     * The current status of the activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WaitingForSpotInstanceRequestId, WaitingForSpotInstanceId, WaitingForInstanceId, PreInService, InProgress, WaitingForELBConnectionDraining, MidLifecycleAction, Successful, Failed, Cancelled
     *
     * @param statusCode The current status of the activity.
     *
     * @see ScalingActivityStatusCode
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
    
    /**
     * The current status of the activity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WaitingForSpotInstanceRequestId, WaitingForSpotInstanceId, WaitingForInstanceId, PreInService, InProgress, WaitingForELBConnectionDraining, MidLifecycleAction, Successful, Failed, Cancelled
     *
     * @param statusCode The current status of the activity.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ScalingActivityStatusCode
     */
    public Activity withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * The current status of the activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WaitingForSpotInstanceRequestId, WaitingForSpotInstanceId, WaitingForInstanceId, PreInService, InProgress, WaitingForELBConnectionDraining, MidLifecycleAction, Successful, Failed, Cancelled
     *
     * @param statusCode The current status of the activity.
     *
     * @see ScalingActivityStatusCode
     */
    public void setStatusCode(ScalingActivityStatusCode statusCode) {
        this.statusCode = statusCode.toString();
    }
    
    /**
     * The current status of the activity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WaitingForSpotInstanceRequestId, WaitingForSpotInstanceId, WaitingForInstanceId, PreInService, InProgress, WaitingForELBConnectionDraining, MidLifecycleAction, Successful, Failed, Cancelled
     *
     * @param statusCode The current status of the activity.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ScalingActivityStatusCode
     */
    public Activity withStatusCode(ScalingActivityStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * A friendly, more verbose description of the activity status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return A friendly, more verbose description of the activity status.
     */
    public String getStatusMessage() {
        return statusMessage;
    }
    
    /**
     * A friendly, more verbose description of the activity status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param statusMessage A friendly, more verbose description of the activity status.
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
    
    /**
     * A friendly, more verbose description of the activity status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param statusMessage A friendly, more verbose description of the activity status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Activity withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * A value between 0 and 100 that indicates the progress of the activity.
     *
     * @return A value between 0 and 100 that indicates the progress of the activity.
     */
    public Integer getProgress() {
        return progress;
    }
    
    /**
     * A value between 0 and 100 that indicates the progress of the activity.
     *
     * @param progress A value between 0 and 100 that indicates the progress of the activity.
     */
    public void setProgress(Integer progress) {
        this.progress = progress;
    }
    
    /**
     * A value between 0 and 100 that indicates the progress of the activity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param progress A value between 0 and 100 that indicates the progress of the activity.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Activity withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * The details about the activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The details about the activity.
     */
    public String getDetails() {
        return details;
    }
    
    /**
     * The details about the activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param details The details about the activity.
     */
    public void setDetails(String details) {
        this.details = details;
    }
    
    /**
     * The details about the activity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param details The details about the activity.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Activity withDetails(String details) {
        this.details = details;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getActivityId() != null) sb.append("ActivityId: " + getActivityId() + ",");
        if (getAutoScalingGroupName() != null) sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getCause() != null) sb.append("Cause: " + getCause() + ",");
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null) sb.append("EndTime: " + getEndTime() + ",");
        if (getStatusCode() != null) sb.append("StatusCode: " + getStatusCode() + ",");
        if (getStatusMessage() != null) sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getProgress() != null) sb.append("Progress: " + getProgress() + ",");
        if (getDetails() != null) sb.append("Details: " + getDetails() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getActivityId() == null) ? 0 : getActivityId().hashCode()); 
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getCause() == null) ? 0 : getCause().hashCode()); 
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode()); 
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode()); 
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode()); 
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode()); 
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode()); 
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Activity == false) return false;
        Activity other = (Activity)obj;
        
        if (other.getActivityId() == null ^ this.getActivityId() == null) return false;
        if (other.getActivityId() != null && other.getActivityId().equals(this.getActivityId()) == false) return false; 
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getCause() == null ^ this.getCause() == null) return false;
        if (other.getCause() != null && other.getCause().equals(this.getCause()) == false) return false; 
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false; 
        if (other.getEndTime() == null ^ this.getEndTime() == null) return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false) return false; 
        if (other.getStatusCode() == null ^ this.getStatusCode() == null) return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false) return false; 
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null) return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false) return false; 
        if (other.getProgress() == null ^ this.getProgress() == null) return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false) return false; 
        if (other.getDetails() == null ^ this.getDetails() == null) return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false) return false; 
        return true;
    }
    
    @Override
    public Activity clone() {
        try {
            return (Activity) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    