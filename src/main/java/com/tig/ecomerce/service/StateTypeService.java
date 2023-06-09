package com.tig.ecomerce.service;

import java.util.List;

import com.tig.ecomerce.model.StateType;

public interface StateTypeService {
	List<StateType> getStatetypes();
	StateType saveStateType(StateType stateType);
	List<StateType> saveAllStatetypes(List<StateType> stateTypes);
	StateType getStateTypeById(int id);
}
