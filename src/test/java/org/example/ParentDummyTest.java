package org.example;

import org.testng.annotations.Test;

public class ParentDummyTest {
   public  int data;
 public  String user;
    public ParentDummyTest(int data,String user) {
        this.data = data;
        this.user=user;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
