package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;

@Entity
public class SampleData {
    // other columns 

    @Column(name="SAMPLE", columnDefinition="CLOB NOT NULL") 
    @Lob 
    private String sample;

	public void setSample(String string) {
		// TODO Auto-generated method stub
		this.sample = string;
	}
	
	public String getSample() {
		return this.sample;
	}

    // setters and getters
}
