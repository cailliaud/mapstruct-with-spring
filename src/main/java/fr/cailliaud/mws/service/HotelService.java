package fr.cailliaud.mws.service;

import fr.cailliaud.mws.dto.Hotel;
import fr.cailliaud.mws.mapper.ConversionServiceAdapter;
import fr.cailliaud.mws.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HotelService {

  private final HotelRepository hotelRepository;
  private final ConversionServiceAdapter conversionServiceAdapter;

  @Transactional(readOnly = true)
  public Set<Hotel> findHotels() {
    return hotelRepository.findAll().stream()
        .map(conversionServiceAdapter::mapHotelEntityToHotel)
        .collect(Collectors.toSet());
  }
}
