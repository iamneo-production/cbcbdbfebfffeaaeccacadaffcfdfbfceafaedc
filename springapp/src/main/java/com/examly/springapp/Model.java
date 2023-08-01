package com.examly.springapp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Model {
    @Id
 @Column  
 private int id;
 @Column  
 private String name;
 @Column
 private String date;
 @Column
 private String taskName;
 @Column
 private String taskStatus;
 
 public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getDate() {
    return date;
}
public void setDate(String date) {
    this.date = date;
}
public String getTaskName() {
    return taskName;
}
public void setTaskName(String taskName) {
    this.taskName = taskName;
}
public String getTaskStatus() {
    return taskStatus;
}
public void setTaskStatus(String taskStatus) {
    this.taskStatus = taskStatus;
}

}