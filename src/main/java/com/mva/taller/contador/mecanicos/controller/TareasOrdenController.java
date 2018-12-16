package com.mva.taller.contador.mecanicos.controller;

import com.mva.taller.contador.mecanicos.models.entity.TareasOrden;
import com.mva.taller.contador.mecanicos.models.entity.TareasOrdenId;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "TareasOrdenController", path = "TareasOrden")
public interface TareasOrdenController extends PagingAndSortingRepository<TareasOrden, TareasOrdenId> {
}
