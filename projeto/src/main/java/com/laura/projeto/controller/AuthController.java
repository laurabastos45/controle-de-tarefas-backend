package com.laura.projeto.controller;

import com.laura.projeto.dto.UsuarioDTO;
import com.laura.projeto.model.UsuarioEntity;
import com.laura.projeto.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@CrossOrigin("*") // evita problema de CORS
public class AuthController {

    private final UsuarioService usuarioService;

    @PostMapping("/register")
    public UsuarioEntity register(@RequestBody UsuarioDTO dto) {
        return usuarioService.cadastrar(dto);
    }


    @PostMapping("/login")
    public UsuarioEntity login(@RequestBody UsuarioDTO dto) {
        return usuarioService.login(dto.getEmail(), dto.getSenha());
    }

}
