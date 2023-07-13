package com.habib.hrschema.services;

import java.util.List;

import com.habib.hrschema.dto.RegionDTO;

public interface IRegionService {

	RegionDTO getRegion(Long id);

	List<RegionDTO> getRegions();

	List<RegionDTO> getRegionList();

	RegionDTO createRegion(RegionDTO regionDto);

	RegionDTO updateRegion(RegionDTO regionDto);

}
