package fr.cailliaud.mws.mapper;

import fr.cailliaud.mws.dto.Responsable;
import fr.cailliaud.mws.entity.ResponsableEntity;
import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;

@Mapper(config = MapperSpringConfig.class)
public interface ResponsableMapper extends Converter<ResponsableEntity, Responsable> {

  Responsable convert(ResponsableEntity responsableEntity);
}
