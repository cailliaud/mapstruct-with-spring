package fr.cailliaud.mws.service;

import fr.cailliaud.mws.dto.Responsable;
import fr.cailliaud.mws.mapper.ConversionServiceAdapter;
import fr.cailliaud.mws.repository.ResponsableRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ResponsableService {
  private final ResponsableRepository responsableRepository;
  private final ConversionServiceAdapter conversionServiceAdapter;

  @Transactional(readOnly = true)
  public Set<Responsable> findAll() {
    return responsableRepository.findAll().stream()
        .map(conversionServiceAdapter::mapResponsableEntityToResponsable)
        .collect(Collectors.toSet());
  }
}
