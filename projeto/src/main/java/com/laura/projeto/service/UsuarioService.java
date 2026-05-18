package com.laura.projeto.service;


import com.laura.projeto.dto.UsuarioDTO;
import com.laura.projeto.model.UsuarioEntity;
import com.laura.projeto.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioEntity cadastrar(UsuarioDTO dto) {
        UsuarioEntity usuario = new UsuarioEntity();

        usuario.setNome(dto.getNome());
        usuario.setLogin(dto.getEmail());
        usuario.setSenha(dto.getSenha());

        return usuarioRepository.save(usuario);

    }
    public UsuarioEntity login(String email, String senha) {

        UsuarioEntity usuario = usuarioRepository.findByLogin(email)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado") );

        if (!usuario.getSenha().equals(senha)) {
            throw new RuntimeException("Senha inválida");
        }

        return usuario;

    }
    public List<UsuarioEntity> listar() {
        return usuarioRepository.findAll();
    }
    public UsuarioEntity atualizar( Long id, UsuarioEntity usuarioAtualizado) {
        UsuarioEntity usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        usuario.setNome(usuarioAtualizado.getNome());
        usuario.setLogin(usuarioAtualizado.getLogin());
        usuario.setSenha(usuarioAtualizado.getSenha());

        return usuarioRepository.save(usuario);

    }
    public void deletar(Long id) {
        usuarioRepository.deleteById(id);
    }

}
