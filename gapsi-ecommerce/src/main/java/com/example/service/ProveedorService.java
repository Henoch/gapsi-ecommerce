package com.example.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.model.Proveedor;

public interface ProveedorService {
	List<Proveedor> obtenerProveedores();

	Proveedor obtnerProveedor(Long lIdProveedor);

	ResponseEntity<String> guardar(Proveedor proveedor);

	ResponseEntity<String> borrar(Proveedor proveedor);
}
