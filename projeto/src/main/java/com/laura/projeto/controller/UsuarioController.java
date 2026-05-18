package com.laura.projeto.controller;

import com.laura.projeto.model.UsuarioEntity;
import com.laura.projeto.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
@CrossOrigin("*")
public class UsuarioController {
    private final UsuarioService usuarioService;

    @GetMapping
    public List<UsuarioEntity> listar() {
        return usuarioService.listar();
    }
    @PutMapping("/{id}")
    public UsuarioEntity atualizar(@PathVariable Long id, @RequestBody UsuarioEntity usuario) {
        return usuarioService.atualizar(id,usuario);
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        usuarioService.deletar(id);
    }

}
