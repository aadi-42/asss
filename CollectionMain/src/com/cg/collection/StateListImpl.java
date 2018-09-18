package com.cg.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class StateListImpl implements StateList {
	private List<String> stateList;
	private Set<String> stateSet;
	private Map<String, String> stateMap;
	private Properties stateProps;
	private Set<Emp> empSet;

	public Set<Emp> getEmpSet() {
		return empSet;
	}

	public void setEmpSet(Set<Emp> empSet) {
		this.empSet = empSet;
	}

	public List<String> getStateList() {
		return stateList;
	}

	public void setStateList(List<String> stateList) {
		this.stateList = stateList;
	}

	public Set<String> getStateSet() {
		return stateSet;
	}

	public void setStateSet(Set<String> stateSet) {
		this.stateSet = stateSet;
	}

	public Map<String, String> getStateMap() {
		return stateMap;
	}

	public void setStateMap(Map<String, String> stateMap) {
		this.stateMap = stateMap;
	}

	public Properties getStateProps() {
		return stateProps;
	}

	public void setStateProps(Properties stateProps) {
		this.stateProps = stateProps;
	}

}
