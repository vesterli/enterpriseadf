package com.dmcsol.xdm.beans;

public class UiState {
    private String currentTF = "/WEB-INF/task-edit-overview-flow.xml#task-edit-overview-flow";

    public void setCurrentTF(String s) {
        this.currentTF = s;
    }

    public String getCurrentTF() {
        return currentTF;
    }
}
