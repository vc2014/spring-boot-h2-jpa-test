package com.example.pojo;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Document implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("name")
	private String name;
	@JsonProperty("id")
	private String id;
	@JsonProperty("tabid")
	private String tabID;
	@JsonProperty("values")
	
	private List<SampleJSON> values;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTabID() {
		return tabID;
	}
	public void setTabID(String tabID) {
		this.tabID = tabID;
	}
	public List<SampleJSON> getValues() {
		return values;
	}
	public void setValues(List<SampleJSON> values) {
		this.values = values;
	}
	@Override
	public String toString() {
		return "Document [name=" + name + ", id=" + id + ", tabID=" + tabID + ", values=" + values + "]";
	}
	
	
	
	
}

class SampleJSON implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("name")
	private String name;
	@JsonProperty("value")
	private String value;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "SampleJSON [name=" + name + ", value=" + value + "]";
	}
	
}
