package com.example.dockertest.entity;

import java.io.Serializable;

public class Visitor implements Serializable{

    private static final long serialVersionUID = 1L;
    private Long id;
    private String ip;
    private Integer times;

    public Visitor(Long id, String ip, Integer times) {
        this.id = id;
        this.ip = ip;
        this.times = times;
    }

    public Long getId() {
        return id;
    }

    public Visitor() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }
}
