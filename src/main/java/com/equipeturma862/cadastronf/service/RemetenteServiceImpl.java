package com.equipeturma862.cadastronf.service;
import com.equipeturma862.cadastronf.domain.Remetente;
import com.equipeturma862.cadastronf.repository.RemetenteRepositoy;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RemetenteServiceImpl implements RemetenteService{
    private final RemetenteRepositoy remetenteRepository;

    @Override
    public List<Remetente> list(String nome) {
        return IterableUtils.toList(remetenteRepository.findAll());
    }

    @Override
    public Remetente save(Remetente remetente) {
        return remetenteRepository.save(remetente);
    }

    @Override
    public Remetente getById(Long id) {
        return remetenteRepository.findById(id).get();
    }

    @Override
    public Remetente update(Long id, Remetente remetente) {
        remetente.setId(Long.valueOf(id));
        return remetenteRepository.save(remetente);
    }

    @Override
    public void delete(Long id) {
        remetenteRepository.deleteById(id);
    }
}
