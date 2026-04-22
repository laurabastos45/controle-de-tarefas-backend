package com.laura.projeto.service;


import com.laura.projeto.model.UsuarioEntity;
import com.laura.projeto.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioEntity cadastrar(UsuarioEntity usuario) {
        return usuarioRepository.save(usuario);
    }
    public UsuarioEntity login(String email, String senha) {
        UsuarioEntity usuario = usuarioRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado") );

        if (!usuario.getSenha().equals(senha)) {
            throw new RuntimeException("Senha inválida");
        }

        return usuario;

    }

}
