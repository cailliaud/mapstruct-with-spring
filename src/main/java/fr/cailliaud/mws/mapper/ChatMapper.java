package fr.cailliaud.mws.mapper;

import fr.cailliaud.mws.dto.Chat;
import fr.cailliaud.mws.entity.ChatEntity;
import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;

@Mapper(config = MapperSpringConfig.class)
public interface ChatMapper extends Converter<ChatEntity, Chat> {

  Chat convert(ChatEntity chatEntity);
}
