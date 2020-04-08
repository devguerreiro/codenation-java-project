package br.com.ErrorCenter.services.impl;

import br.com.ErrorCenter.entities.ApplicationEntity;
import br.com.ErrorCenter.repositories.ApplicationRepository;
import br.com.ErrorCenter.services.interfaces.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    @Override
    public List<ApplicationEntity> findAll() {
        return applicationRepository.findAll();
    }

    @Override
    public Optional<ApplicationEntity> findById(Long applicationId) {
        return applicationRepository.findById(applicationId);
    }

}
