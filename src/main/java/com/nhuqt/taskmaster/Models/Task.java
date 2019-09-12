package com.nhuqt.taskmaster.Models;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import org.w3c.dom.html.HTMLIsIndexElement;

import java.util.ArrayList;

@DynamoDBTable(tableName = "taskmaster")
public class Task {
  private String id;
  private String assignee;
  private String title;
  private String description;
  private String status;
  private ArrayList<History> history;

  public Task(){this.history = new ArrayList<>();}

  public Task(String assignee, String title, String description, String status){
    this.assignee = assignee;
    this.title = title;
    this.description = description;
    this.status = status;
    this.history = new ArrayList<>();
  }

  @DynamoDBHashKey
  @DynamoDBAutoGeneratedKey
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @DynamoDBAttribute
  public String getAssignee() {
    return assignee;
  }

  public void setAssignee(String assignee) {
    this.assignee = assignee;
  }

  @DynamoDBAttribute
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @DynamoDBAttribute
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @DynamoDBAttribute
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @DynamoDBAttribute
  public ArrayList <History>getHistory() {
    return history;
  }

  public void setHistory(ArrayList<History> history) {
    this.history = history;
  }

  public void addHistory(History h){
    history.add(h);
  }
}
