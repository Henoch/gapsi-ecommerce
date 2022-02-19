package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.model.Proveedor;
import com.example.repository.ProveedorRepository;
import com.example.service.ProveedorService;

@Service
public class ProveedorServiceImpl implements ProveedorService {

	@Autowired
	private ProveedorRepository proveedorRepository;

	@Override
	public List<Proveedor> obtenerProveedores() {
		return this.proveedorRepository.findAll();
	}

	@Override
	public Proveedor obtnerProveedor(Long lIdProveedor) {
		return this.proveedorRepository.getById(lIdProveedor);
	}

	@Override
	public ResponseEntity<String> guardar(Proveedor proveedor) {
		try {
			this.proveedorRepository.save(proveedor);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NO_CONTENT);// TODO: handle exception
		}
		return new ResponseEntity<>(("Proveedor guardado"), HttpStatus.OK);

	}

	@Override
	public ResponseEntity<String> borrar(Proveedor proveedor) {
		try {
			this.proveedorRepository.delete(proveedor);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NO_CONTENT);// TODO: handle exception
		}
		return new ResponseEntity<>(("Proveedor borrado"), HttpStatus.OK);

	}

}
