package com.habib.hrschema.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.habib.hrschema.dto.RegionDTO;
import com.habib.hrschema.entities.Region;
import com.habib.hrschema.repositories.RegionRepository;

@Service
public class RegionService implements IRegionService{

	@Autowired
	private RegionRepository regionRepository;

	@Autowired
	private ISharedService sharedService;

	public RegionDTO getRegion(Long id) {
		Region entity = regionRepository.findById(id).orElse(null);
		return sharedService.MapSingleObject(entity, RegionDTO.class);
	}

	public List<RegionDTO> getRegions() {
		List<Region> list = regionRepository.findAll();
		return sharedService.MapListOfObject(list, RegionDTO.class);
	}

	public List<RegionDTO> getRegionList() {
		return sharedService.MapListOfObject(regionRepository.findAll(), RegionDTO.class);
	}

	public RegionDTO createRegion(RegionDTO regionDto) {
		Region region = sharedService.MapSingleObject(regionDto, Region.class);
		region.setId(null);
		Region retRegion = regionRepository.save(region);
		return sharedService.MapSingleObject(retRegion, RegionDTO.class);
	}

	public RegionDTO updateRegion(RegionDTO regionDto) {
		Region region = sharedService.MapSingleObject(regionDto, Region.class);
		Region retRegion = regionRepository.save(region);
		return sharedService.MapSingleObject(retRegion, RegionDTO.class);
	}
}
