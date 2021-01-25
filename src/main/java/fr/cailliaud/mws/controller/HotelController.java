package fr.cailliaud.mws.controller;

import fr.cailliaud.mws.dto.Hotel;
import fr.cailliaud.mws.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api/hotels")
@RequiredArgsConstructor
public class HotelController {

  private final HotelService hotelService;

  @GetMapping
  public Set<Hotel> findAll() {
    return hotelService.findHotels();
  }
}
