package com.Admin.admin.Entity;

import javax.persistence.*;

@Entity
@Table(name="merchant")
public class merchantEntity {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	int id ;
	
	@Column
	String name;
	
	@Column
	String pincode;
	
	@Column
	String location;
	
	@Column
	int gstNo;

}
