package com.proyect.Event.model;




import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Document(collection = "events")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {
	
	@Id
	@Field(name="code")
    private String code;
	private String name;
	private String price;
	private String short_description;
	private String long_description;
	private String year;
	private String time;
	private String genre;
	private String policy;
	private String[] venue = new String[4];
	
	//enclosure[0] = name
	//enclosure[1] = city
	//enclosure[2] = direction
	//enclosure[3] = capacity
	
}
