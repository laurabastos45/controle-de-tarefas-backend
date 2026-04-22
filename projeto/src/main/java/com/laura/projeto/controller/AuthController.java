package com.laura.projeto.controller;

import com.laura.projeto.dto.LoginDTO;
import com.laura.projeto.model.UsuarioEntity;
import com.laura.projeto.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UsuarioService usuarioService;

    @PostMapping("/login")
    public UsuarioEntity login(@RequestBody LoginDTO dto) {
        return usuarioService.login(dto.getEmail(), dto.getSenha());
    }
    @PostMapping("/register")
    public UsuarioEntity register(@RequestBody UsuarioEntity usuario) {
        return usuarioService.cadastrar(usuario);
    }



}
