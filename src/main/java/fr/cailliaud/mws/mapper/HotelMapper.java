package fr.cailliaud.mws.mapper;

import fr.cailliaud.mws.dto.Hotel;
import fr.cailliaud.mws.entity.HotelEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;

@Mapper(config = MapperSpringConfig.class)
public interface HotelMapper extends Converter<HotelEntity, Hotel> {

  @Mapping(target = "estComplet", constant = "false")
  @Mapping(target = "pensionnaires", source = "chats")
  Hotel convert(HotelEntity hotelEntity);
}
