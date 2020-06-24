package com.search.search;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "juristic_search")
public class Search {

	private Integer id;
	private String juristic_id;
	private String juristic_name_en;
	private String juristic_name_th;
	private String juristic_type;
	private String juristic_nationality;
	private String juristic_business_type;
	
	

	public Search() {
		// TODO Auto-generated constructor stub
	}

	

	public Search(Integer id, String juristic_id, String juristic_name_en, String juristic_name_th,
			String juristic_type, String juristic_nationality, String juristic_business_type) {
		
		this.id = id;
		this.juristic_id = juristic_id;
		this.juristic_name_en = juristic_name_en;
		this.juristic_name_th = juristic_name_th;
		this.juristic_type = juristic_type;
		this.juristic_nationality = juristic_nationality;
		this.juristic_business_type = juristic_business_type;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getJuristic_id() {
		return juristic_id;
	}



	public void setJuristic_id(String juristic_id) {
		this.juristic_id = juristic_id;
	}



	public String getJuristic_name_en() {
		return juristic_name_en;
	}



	public void setJuristic_name_en(String juristic_name_en) {
		this.juristic_name_en = juristic_name_en;
	}



	public String getJuristic_name_th() {
		return juristic_name_th;
	}



	public void setJuristic_name_th(String juristic_name_th) {
		this.juristic_name_th = juristic_name_th;
	}



	public String getJuristic_type() {
		return juristic_type;
	}



	public void setJuristic_type(String juristic_type) {
		this.juristic_type = juristic_type;
	}



	public String getJuristic_nationality() {
		return juristic_nationality;
	}



	public void setJuristic_nationality(String juristic_nationality) {
		this.juristic_nationality = juristic_nationality;
	}



	public String getJuristic_business_type() {
		return juristic_business_type;
	}



	public void setJuristic_business_type(String juristic_business_type) {
		this.juristic_business_type = juristic_business_type;
	}
	
	
	
	
	
}
