package com.myLearning.springWeb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Implementers {
	
	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	private String city="Jabalpur";
	private Double salary;	

}
