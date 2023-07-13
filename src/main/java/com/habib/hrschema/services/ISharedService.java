package com.habib.hrschema.services;

import java.util.List;

import org.dozer.DozerBeanMapper;

public interface ISharedService {

	DozerBeanMapper getDozerInstance();

	<S, U> U MapSingleObject(S s, Class<U> u);

	<S, U> List<U> MapListOfObject(List<S> s, Class<U> u);

}
