package com.cg.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public interface StateList {

	List<String> getStateList();

	Set<String> getStateSet();

	Map<String, String> getStateMap();

	Properties getStateProps();
	
	Set<Emp> getEmpSet();

}
