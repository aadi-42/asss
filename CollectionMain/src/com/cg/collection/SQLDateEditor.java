package com.cg.collection;

import java.beans.PropertyEditorSupport;
import java.sql.Date;

public class SQLDateEditor extends PropertyEditorSupport {
	
	@Override
	public String getAsText(){
		return getValue().toString();
		
	}
	
	@Override
	public void setAsText(String txt) throws IllegalArgumentException{
		if(txt!=null && txt.equalsIgnoreCase("today")){
			Date date = new Date(System.currentTimeMillis());
			setValue(date);
		}
		
		else{
			setValue(Date.valueOf(txt));
		}
		
	}

}
