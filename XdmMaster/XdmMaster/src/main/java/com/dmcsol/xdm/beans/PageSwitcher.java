package com.dmcsol.xdm.beans;

import java.io.Serializable;

import oracle.adf.controller.TaskFlowId;

public class PageSwitcher implements Serializable {
    //private String taskFlowId = "/WEB-INF/task-edit-overview-flow.xml#task-edit-overview-flow";
private UiState currentUiState;

    public PageSwitcher() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(currentUiState.getCurrentTF());
        //return TaskFlowId.parse("/WEB-INF/task-edit-overview-flow.xml#task-edit-overview-flow");
    }
/*
    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }
*/    
    public void setUiState(UiState state) {
        currentUiState = state;
    }
}
