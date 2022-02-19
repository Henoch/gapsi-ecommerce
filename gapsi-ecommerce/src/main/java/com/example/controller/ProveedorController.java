package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Proveedor;
import com.example.service.ProveedorService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/proveedor")
public class ProveedorController {

	@Autowired
	private ProveedorService proveedorService;

	@GetMapping("/obtener-todos")
	public List<Proveedor> obtener() {
		return this.proveedorService.obtenerProveedores();
	}

	@PostMapping("/guardar")
	public ResponseEntity<String> guardar(@RequestBody Proveedor proveedor) {
		return this.proveedorService.guardar(proveedor);
	}
	
	@PostMapping("/borrar")
	public ResponseEntity<String> borrar(@RequestBody Proveedor proveedor) {
		return this.proveedorService.borrar(proveedor);
	}

}
